import json
import os
from datetime import datetime

# Configuration
LANGUAGE_DIRS = {
    "java": "Java",
    "cpp": "C++",
    "python": "Python",
    "react": "React",
    "functional": "Functional-Programming"
}

def count_solutions():
    stats = {
        "last_update": datetime.now().strftime("%Y-%m-%d"),
        "languages": {}
    }
    
    for lang, dir_name in LANGUAGE_DIRS.items():
        count = 0
        difficulty_counts = {"easy": 0, "medium": 0, "hard": 0}
        
        # Create directory if it doesn't exist
        if not os.path.exists(dir_name):
            os.makedirs(dir_name)
            continue
            
        for root, _, files in os.walk(dir_name):
            for file in files:
                if file.endswith(('.java', '.cpp', '.py', '.js', '.scala', '.hs')):
                    count += 1
                    # Extract difficulty from path (assuming structure)
                    difficulty = os.path.basename(root).lower()
                    if difficulty in difficulty_counts:
                        difficulty_counts[difficulty] += 1
        
        stats["languages"][lang] = {
            "count": count,
            "difficulty": difficulty_counts
        }
    
    return stats

def update_readme(stats):
    with open('README.md', 'r', encoding='utf-8') as f:
        readme = f.read()
    
    # Generate stats table
    total = sum(lang['count'] for lang in stats['languages'].values())
    table = "| Language | Solved Problems | Last Updated |\n"
    table += "|----------|----------------:|-------------:|\n"
    for lang, data in stats['languages'].items():
        table += f"| {lang.capitalize()} | {data['count']} | {stats['last_update']} |\n"
    table += f"| **Total** | **{total}** | {stats['last_update']} |"
    
    # Calculate difficulty sums
    easy = sum(lang['difficulty']['easy'] for lang in stats['languages'].values())
    medium = sum(lang['difficulty']['medium'] for lang in stats['languages'].values())
    hard = sum(lang['difficulty']['hard'] for lang in stats['languages'].values())
    
    # Generate difficulty table
    difficulty_table = "| Difficulty | Problems Solved |\n"
    difficulty_table += "|------------|----------------:|\n"
    difficulty_table += f"| Easy       | {easy} |\n"
    difficulty_table += f"| Medium     | {medium} |\n"
    difficulty_table += f"| Hard       | {hard} |\n"
    difficulty_table += f"| **Total**  | **{total}** |"
    
    # Update readme
    readme = readme.split('## 📈 Progress Statistics')[0]
    readme += f"""## 📈 Progress Statistics (Auto-updated)

{table}

*(Last automated update: {stats['last_update']})*
"""
    with open('README.md', 'w', encoding='utf-8') as f:
        f.write(readme)

if __name__ == "__main__":
    stats = count_solutions()
    with open('stats.json', 'w', encoding='utf-8') as f:
        json.dump(stats, f, indent=2)
    update_readme(stats)
