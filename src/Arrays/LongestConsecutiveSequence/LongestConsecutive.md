# LeetCode 128. Longest Consecutive Sequence
🔗 [Problem Link](https://leetcode.com/problems/longest-consecutive-sequence/)

---

## 🧠 Problem Statement
Given an unsorted array of integers, return the length of the longest sequence of consecutive elements.

The algorithm must run in `O(n)` time.

**Example:**  
Input: `[100, 4, 200, 1, 3, 2]`  
Output: `4`  
Explanation: The longest consecutive sequence is `[1, 2, 3, 4]`.

---

## 🔍 Approaches

### 1. Brute Force (Sorting-Based)
- Sort the array first.
- Traverse it and count consecutive streaks.
- Skip duplicates while counting.
- Return the maximum streak found.

**Time Complexity:** `O(n log n)`  
**Space Complexity:** `O(1)` (in-place sorting)

---

### 2. Optimal (HashSet-Based)
- Insert all elements into a `HashSet`.
- For each number, check if it's the **start** of a sequence (i.e., `num - 1` not in the set).
- If it is, count how far the consecutive sequence goes by checking `num + 1`, `num + 2`, etc.
- Keep track of the longest sequence.

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(n)`

---

## ✅ Summary Table

| Approach      | Time Complexity | Space Complexity | Description             |
|---------------|------------------|------------------|-------------------------|
| Sorting       | O(n log n)       | O(1)              | Easy to implement       |
| HashSet       | O(n)             | O(n)              | Optimal and efficient   |

---

## 📌 Notes
- Always prefer the **HashSet-based approach** when `O(n)` is required.
- Skip duplicates in the sorted approach to avoid breaking streak counts.
- Both methods are useful — start from brute and work toward optimal for interviews.
