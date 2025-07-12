# ✅ Valid Sudoku

🔗 [LeetCode Link](https://leetcode.com/problems/valid-sudoku/)

---

## 🧠 Problem Statement

Determine if a `9 x 9` Sudoku board is valid.

- Each **row**, **column**, and **3×3 box** must contain digits `1-9` **without repetition**.
- Empty cells are denoted by `'.'`.
- The board **doesn't need to be solvable**, just valid as-is.

---

## 🥉 Brute Force Approach

### 🔸 Logic:
- For each filled cell:
    - Check entire row for duplicate
    - Check entire column for duplicate
    - Check its 3×3 box for duplicate

### 📊 Complexity:
- Time: **O(81 × 9) = O(729)** → constant time due to fixed size
- Space: **O(1)** → no extra storage (except basic variables)

---

## 🥇 Optimal Approach (Set-Based)

### 🔸 Logic:
- Use a single `HashSet<String>` to track seen elements:
    - `"5row0"` → digit `5` in row `0`
    - `"5col3"` → digit `5` in column `3`
    - `"5box1_2"` → digit `5` in box `(1,2)`
- For each filled cell:
    - Check if any of these strings already exist → return false
    - Else, add them to the set

### 📦 Box ID Calculation:
- Row box index = `i / 3`
- Column box index = `j / 3`

### 📊 Complexity:
- Time: **O(81) = O(1)** → one scan of board
- Space: **O(81) = O(1)** → max 81 entries in set

---

## 📌 Summary

| Approach     | Time     | Space   | Notes                             |
|--------------|----------|---------|-----------------------------------|
| Brute Force  | O(729)   | O(1)    | Checks each row, col, box manually |
| Set-Based ✅ | O(81)    | O(1)    | Clean, efficient, scalable        |

---

## 🏷️ Tags
`HashSet`, `2D Array`, `Matrix`, `Implementation`, `Simulation`, `Sudoku`, `Validation`