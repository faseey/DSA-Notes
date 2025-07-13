# ✅ 15. 3Sum

🔗 [LeetCode Link](https://leetcode.com/problems/3sum/)

---

## 🧠 Problem Statement

Given an integer array `nums`, return all the **unique triplets** `[nums[i], nums[j], nums[k]]` such that:
```
i != j, j != k, i != k
and
nums[i] + nums[j] + nums[k] == 0
```
You must return the solution set **without duplicates**.

---

## 🥉 Brute Force Approach

### 🔸 Logic:
- Use three nested loops `(i, j, k)` to try all combinations.
- Check if the sum is 0 and store the triplet.
- Use a **Set** to avoid duplicates.

### 📊 Complexity:
- Time: **O(n³)**
- Space: **O(k)** for storing unique triplets

---

## 🥇 Optimal Approach (Sorting + Two Pointers)

### 🔸 Logic:
- **Sort** the array first.
- Fix one number `nums[i]` and apply the **two-pointer** technique on the subarray `i+1 to n-1`.
- Skip duplicates for all 3 elements to avoid repeating results.

### 📦 Key Observations:
- Target is `-nums[i]` → find two numbers whose sum equals this.
- Efficient way to scan combinations using two pointers: `left` and `right`.

### 📊 Complexity:
- Time: **O(n²)**
- Space: **O(1)** (excluding output list)

---

## 📌 Summary

| Approach             | Time    | Space   | Notes                              |
|----------------------|---------|---------|------------------------------------|
| Brute Force          | O(n³)   | O(k)    | Too slow for large input           |
| Two Pointer ✅        | O(n²)   | O(1)    | Efficient and LeetCode-accepted    |

---

## 🧩 Pattern
`Two Pointer`, `Sorting`, `Fixed Element + Pair Sum`, `Duplicate Handling`

---

## 🏷️ Tags
`Two Pointers`, `Sorting`, `Array`, `HashSet`, `Triplets`, `Greedy`
