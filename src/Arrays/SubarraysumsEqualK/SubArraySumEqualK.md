# Subarray Sum Equals K

🔗 [LeetCode #560](https://leetcode.com/problems/subarray-sum-equals-k/)

---

## 🧠 Problem Intuition

Given an integer array `nums` and an integer `k`, find the total number of continuous subarrays whose sum equals `k`.

The goal is to count **all subarrays** (not necessarily distinct) whose elements add up exactly to `k`.

---

## 🔍 Approaches

### 1. Brute-Force (Triple Loop)

- **Idea**: Try every possible subarray `(i to j)` and calculate its sum by looping from `i` to `j`.
- **Time Complexity**: O(n³)
- **Space Complexity**: O(1)
- **Use Case**: Just for understanding or very small inputs.

---

### 2. Prefix Sum (Double Loop)

- **Idea**: Precompute prefix sums to quickly get sum of any subarray in O(1) time.
- **Approach**: For each pair `(start, end)`, use the formula:  
  `sum = prefix[end + 1] - prefix[start]`
- **Time Complexity**: O(n²)
- **Space Complexity**: O(n) for prefix array
- **Benefit**: Avoids recomputation of sums in inner loop.

---

### 3. Optimal using HashMap (Prefix Sum + Frequency Map)

- **Idea**: Keep track of the number of times each cumulative sum has occurred.
- **Logic**: For each index `i`, maintain a running sum `sum`.  
  If `(sum - k)` has appeared before, it means there's a subarray ending at `i` with sum `k`.
- **Time Complexity**: O(n)
- **Space Complexity**: O(n) for the HashMap
- **Use Case**: Best solution for large inputs and interviews.

---

## ✅ Summary Table

| Approach               | Time Complexity | Space Complexity | Description                         |
|------------------------|------------------|-------------------|-------------------------------------|
| Brute Force            | O(n³)            | O(1)              | Try all subarrays + sum each        |
| Prefix Sum (2 loops)   | O(n²)            | O(n)              | Precompute prefix for faster sum    |
| HashMap (Optimal)      | O(n)             | O(n)              | Count prefix sum frequencies        |

---

## 💡 Tip for Interviews

- Start with brute force to show understanding.
- Optimize to prefix sum or HashMap based on constraints.
- Explain intuition clearly: "We're looking for previous sums that allow current window to equal `k`."
