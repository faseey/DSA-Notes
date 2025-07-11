# Valid Anagram

🔗 [LeetCode Link](https://leetcode.com/problems/valid-anagram/)

---

## 🧠 Problem Statement

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

An **Anagram** is a word formed by rearranging the letters of another word, using all original letters exactly once.

---

## 🥉 Brute Force Approach

### 🔸 Logic:
- Sort both strings.
- If both sorted strings are equal, they are anagrams.

### 📊 Complexity:
- Time: **O(n log n)** (due to sorting)
- Space: **O(n)** (for new strings)

---

## 🥈 HashMap Approach

### 🔸 Logic:
- Count the frequency of each character in `s` using a HashMap.
- Then, for each character in `t`, subtract from the map.
- If any value goes negative or a char is missing, return false.

### 📊 Complexity:
- Time: **O(n)**
- Space: **O(n)**

---

## 🥇 Frequency Array Approach (Optimized for lowercase a–z)

### 🔸 Logic:
- Use an integer array of size 26 (for each letter).
- For each character in `s`, increment its corresponding index.
- For each character in `t`, decrement the same index.
- If the final array has any non-zero values, return false.

### 📊 Complexity:
- Time: **O(n)**
- Space: **O(1)** (fixed size array — constant space)

---

## 📌 Summary

| Approach             | Time     | Space   | Notes                          |
|----------------------|----------|---------|--------------------------------|
| Brute Force          | O(n log n) | O(n)   | Easy, but slower               |
| HashMap              | O(n)     | O(n)    | Good for any character set     |
| Frequency Array      | O(n)     | O(1)    | Best for lowercase English ✅ |

---

## 🏷️ Tags
`Strings`, `HashMap`, `Sorting`, `Frequency Array`, `Java`
