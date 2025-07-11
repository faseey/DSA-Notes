# Two Sum

🔗 [LeetCode Link](https://leetcode.com/problems/two-sum/)

---

## 🧠 Problem Statement

Given an array of integers `nums` and a target integer `target`, return the indices of the two numbers such that they add up to the target.

Only one solution exists. You cannot use the same element twice.

---

## 🥉 Brute Force Approach

### 🔸 Logic:
- Use two loops.
- For each element, check every other element after it.
- If the sum equals the target, return their indices.

### 📊 Complexity:
- Time: **O(n²)**
- Space: **O(1)**

---

## ⚡ Optimized Approach (Using HashMap)

### 🔸 Logic:
- Use a HashMap to store numbers and their indices.
- For each number, check if its complement (`target - num`) exists in the map.
- If yes, return the stored index and the current index.
- If not, store the current number with its index.

### 📊 Complexity:
- Time: **O(n)**
- Space: **O(n)**

---

## 📌 Summary

| Approach     | Time   | Space  | Suitable For          |
|--------------|--------|--------|------------------------|
| Brute Force  | O(n²)  | O(1)   | Simple logic, easy     |
| HashMap      | O(n)   | O(n)   | Efficient and optimal ✅ |

---

## 🏷️ Tags
`Arrays`, `HashMap`, `Optimization`, `Logic Only`, `No Code`
