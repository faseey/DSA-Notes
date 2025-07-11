# Product of Array Except Self

🔗 [LeetCode Link](https://leetcode.com/problems/product-of-array-except-self/)

---

## 🧠 Problem Statement

Given an integer array `nums`, return an array `answer` such that `answer[i]` is equal to the product of all the elements of `nums` except `nums[i]`.

**Constraints:**
- Don't use division (for optimal solution)
- Solve in **O(n)** time
- Use **constant extra space**

---

## 🥉 1. Brute Force

### 🔸 Logic:
- For every index `i`, loop through the entire array and multiply everything except `nums[i]`.

### 📊 Complexity:
- Time: **O(n²)**
- Space: **O(1)**

### ❌ Cons:
- Very inefficient
- Fails on large inputs

---

## 🥈 2. Division-Based Approach (Handles Zeros)

### 🔸 Logic:
- Multiply all elements to get total product.
- If zero exists:
    - If 1 zero → only that index gets product, others get 0
    - If >1 zero → all outputs are 0
- Else: `product / nums[i]`

### 📊 Complexity:
- Time: **O(n)**
- Space: **O(1)**

### ⚠️ Note:
- **Not allowed** on LeetCode
- Good for conceptual understanding

---

## 🥈 3. Prefix & Suffix Arrays

### 🔸 Logic:
- Create two arrays:
    - `left[i]` = product of elements left of `i`
    - `right[i]` = product of elements right of `i`
- Final answer: `left[i] * right[i]`

### 📊 Complexity:
- Time: **O(n)**
- Space: **O(n)** (extra arrays)

### ✅ Pros:
- No division
- Easy to understand

---

## 🥇 4. Optimized (Prefix in Result Array + Suffix in Variable)

### 🔸 Logic:
- First pass: store prefix product in result array
- Second pass: maintain a running suffix product and multiply it into result

### 📊 Complexity:
- Time: **O(n)**
- Space: **O(1)** (excluding output array)

### ✅ Pros:
- Most optimal
- Accepted by LeetCode
- Uses minimal memory

---

## 📌 Summary

| Approach                     | Time Complexity | Space Complexity | Division | Notes                             |
|------------------------------|------------------|-------------------|-----------|------------------------------------|
| Brute Force                  | O(n²)            | O(1)              | ❌        | Very slow, just for understanding  |
| Division Approach            | O(n)             | O(1)              | ✅        | Not allowed in LeetCode            |
| Prefix + Suffix Arrays       | O(n)             | O(n)              | ❌        | Clean and easy to implement        |
| Optimized Prefix + Suffix    | O(n)             | O(1)              | ❌        | Best solution ✅                    |

---

## 🔍 Example

**Input:**  
nums = [1, 2, 3, 4]

makefile
Copy
Edit

**Output:**  
[24, 12, 8, 6]

yaml
Copy
Edit

---

## 🏷️ Tags
`Array`, `Prefix Product`, `Suffix Product`, `Space Optimization`, `No Division`