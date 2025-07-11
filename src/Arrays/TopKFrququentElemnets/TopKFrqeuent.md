# Top K Frequent Elements

🔗 [LeetCode Link](https://leetcode.com/problems/top-k-frequent-elements/)

---

## 🧠 Problem Statement

Given an integer array `nums` and an integer `k`, return the `k` most frequent elements.

---

## 🥉 Brute Force Approach

### 🔸 Logic:
- Count frequency of each element.
- Sort the entire list based on frequency.
- Return top `k` elements.

### 📊 Complexity:
- Time: **O(n²)** (inefficient — due to scanning counts manually)
- Space: **O(n)**

---

## 🥈 HashMap + Sorting (Simple & Clean)

### 🔸 Logic:
- Count frequencies using `HashMap`
- Convert `Map.Entry` to a list
- Sort by frequency (descending)
- Pick top `k` elements

### 📊 Complexity:
- Time: **O(n log n)**
- Space: **O(n)**

### ✅ Pros:
- Easy to implement
- Good enough for interviews

---

## 🥈 HashMap + Min-Heap (Priority Queue)

### 🔸 Logic:
- Count frequency using `HashMap`
- Push entries into a **min-heap (PriorityQueue)** by frequency
- Maintain size `k` → remove smallest if size exceeds
- Extract top `k` elements from heap

### 📊 Complexity:
- Time: **O(n log k)**
- Space: **O(n)**

### ✅ Pros:
- Great for **streaming** or very large inputs
- Efficient when `k << n`

---

## 🥇 HashMap + Bucket Sort (Most Optimal)

### 🔸 Logic:
- Count frequencies using `HashMap`
- Create an array of lists (buckets), index = frequency
- Store numbers in corresponding frequency index
- Traverse buckets from highest to lowest, pick `k` elements

### 📊 Complexity:
- Time: **O(n)**
- Space: **O(n)**

### ✅ Pros:
- Most efficient solution
- Avoids full sort

---

## 🔍 Example

**Input:**  
nums = [1, 1, 1, 2, 2, 3, 3, 4]
k = 2

makefile
Copy
Edit

**Frequencies:**  
1 → 3
2 → 2
3 → 2
4 → 1

markdown
Copy
Edit

**Possible Outputs:**  
[1, 2] or [1, 3] ✅

yaml
Copy
Edit

---

## 📌 Summary

| Approach                 | Time Complexity | Space Complexity | Notes                         |
|--------------------------|------------------|------------------|-------------------------------|
| Brute Force              | O(n²)            | O(n)             | Too slow ❌                   |
| HashMap + Sort           | O(n log n)       | O(n)             | Clean and easy ✅             |
| HashMap + Min-Heap       | O(n log k)       | O(n)             | Great when `k` is small 🔥   |
| HashMap + Bucket Sort    | O(n)             | O(n)             | Best possible performance ✅ |

---

## 🏷️ Tags
`HashMap`, `Sorting`, `Heap`, `Bucket Sort`, `Top K`, `Java`