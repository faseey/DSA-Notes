# Contiguous Array

🔗 [LeetCode #525](https://leetcode.com/problems/contiguous-array/)

---

## 🧠 Problem Intuition

Given a binary array `nums`, return the maximum length of a contiguous subarray with an equal number of 0s and 1s.

To solve this, we need to find the **longest subarray** where the count of 0s and 1s is the same.

---

## 🔍 Approaches

### 1. Brute Force (Triple Loop)

- **Idea**: Try all subarrays, count the number of 0s and 1s in each, and update max length if equal.
- **Logic**:
    - For every pair `(start, end)`, count 0s and 1s between them.
    - If count0 == count1 → update max length.
- **Time Complexity**: O(n³)
- **Space Complexity**: O(1)
- **Use Case**: Very small input only; not efficient.

---

### 2. Improved Brute (Double Loop)

- **Idea**: Count 0s and 1s while expanding the `end` pointer — no need for an inner loop.
- **Time Complexity**: O(n²)
- **Space Complexity**: O(1)

---

### 3. Optimal Approach (Prefix Sum + HashMap)

- **Key Insight**: Replace all 0s with -1, then the problem reduces to:
  > Find the longest subarray with **sum = 0**
- **Approach**:
    - Convert 0 → -1 in the array.
    - Track cumulative sum while iterating.
    - Use a HashMap to store the **first index** of each cumulative sum.
    - If the same sum appears again at index `i`, then the subarray from `firstIndex+1` to `i` has net sum = 0 (i.e., equal 0s and 1s).
- **Time Complexity**: O(n)
- **Space Complexity**: O(n)
- **Use Case**: Best for large inputs and interviews.

---

## ✅ Summary Table

| Approach             | Time Complexity | Space Complexity | Description                          |
|----------------------|------------------|-------------------|--------------------------------------|
| Brute Force (3 loops)| O(n³)            | O(1)              | Try all subarrays + count manually   |
| Improved Brute       | O(n²)            | O(1)              | Expand window while counting         |
| HashMap (Optimal)    | O(n)             | O(n)              | Track prefix sum (0 → -1 trick)      |

---

## 💡 Interview Tip

Mention the 0 → -1 trick and explain how equal count of 0s and 1s transforms into finding subarrays with sum = 0. It’s a common trick in binary array problems.

