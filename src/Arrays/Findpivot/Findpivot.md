# Find Pivot Index

🔗 [LeetCode #724](https://leetcode.com/problems/find-pivot-index/)

---

## 🧠 Problem Intuition

Given an array `nums`, the **pivot index** is the index where the sum of all the numbers **to the left** is equal to the sum of all the numbers **to the right**.

Return the leftmost such index. If none exists, return -1.

---

## 🔍 Approaches

### 1. Brute Force Using Two Prefix Arrays

- Create two arrays:
    - `left[i]`: sum of elements from index 0 to i-1
    - `right[i]`: sum of elements from index i+1 to end
- Compare `left[i]` and `right[i]` for every index.

#### 🔄 Can it be improved?
✅ Yes. Instead of using **two arrays**, we can use **one prefix sum array** and derive `right = total - prefix[i] - nums[i]`.

But even better is to use just two variables.

#### ⏱ Time Complexity: O(n)
#### 🧠 Space Complexity: O(n)

---

### 2. Optimal Approach (Running Left Sum + Total Sum)

- First, compute the total sum of the array.
- Then iterate once while maintaining the current left sum.
- For each index `i`, compute right sum as:  
  `right = total - left - nums[i]`  
  If `left == right`, return `i`.

- Early return as soon as a valid pivot is found.

#### ⏱ Time Complexity: O(n)
#### 🧠 Space Complexity: O(1)

---

## ✅ Summary Table

| Approach                   | Time Complexity | Space Complexity | Notes                              |
|----------------------------|------------------|-------------------|-------------------------------------|
| Brute Force (2 prefix arrays) | O(n)           | O(n)              | Can be reduced to 1 prefix array    |
| Optimal (total & left sum) | O(n)             | O(1)              | Best solution using variables only  |

---

## 💡 Interview Tip

Mention that although the brute force uses two arrays, it can be reduced to a single prefix array or further optimized to constant space using just `total` and `left`.

