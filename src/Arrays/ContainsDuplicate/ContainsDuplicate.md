# Contains Duplicate

🔗 [LeetCode Link](https://leetcode.com/problems/contains-duplicate/)

---

## 🧠 Problem Statement

Given an integer array `nums`, return `true` if any value appears **at least twice**, and `false` if every element is distinct.

---

## 🥉 Brute Force Approach

### 🔸 Logic:
- Use two loops to compare every element with every other element.
- If any duplicate is found, return true.

### 📊 Complexity:
- Time: **O(n²)**
- Space: **O(1)**

---

## ⚡ Optimized Approach (Using HashSet)

### 🔸 Logic:
- Create a `HashSet` to track seen elements.
- Iterate through the array:
    - If element is already in the set → return true
    - Else → add to set
- If loop completes without finding duplicates → return false

### 📊 Complexity:
- Time: **O(n)** (on average, HashSet operations are O(1))
- Space: **O(n)** (in worst case, all elements are unique)

---

## 📌 Summary

| Approach     | Time   | Space  | Notes               |
|--------------|--------|--------|----------------------|
| Brute Force  | O(n²)  | O(1)   | Simple but slow      |
| HashSet      | O(n)   | O(n)   | Best for large input ✅ |

---

## 🏷️ Tags
`HashSet`, `Arrays`, `Duplicates`, `Optimization`, `Java`
