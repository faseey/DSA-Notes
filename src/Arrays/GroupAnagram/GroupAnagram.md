# Group Anagrams

🔗 [LeetCode Link](https://leetcode.com/problems/group-anagrams/)

---

## 🧠 Problem Statement

Given an array of strings `strs`, group the anagrams together.  
Return a list of lists where each inner list contains words that are anagrams of each other.

---

## 🥉 Brute Force Approach

### 🔸 Logic:
- Iterate over each string.
- Compare it with strings in existing groups to check if it is an anagram.
- If yes → add it to that group.
- If not → create a new group.

### 🔹 How to check anagram?
- Sort both strings and compare, OR
- Use frequency count and match characters.

### 📊 Complexity:
- Time: **O(n² \* k log k)**  
  (n = number of strings, k = length of each string)
- Space: **O(n)** (for result storage)

### ❌ Cons:
- Inefficient for large inputs.
- Every string comparison is costly.

---

## ⚡ Optimized Approach (Sorted String as Key)

### 🔸 Logic:
- For each string:
    - Sort its characters → this becomes the key.
    - Use a HashMap where:
        - Key = Sorted string
        - Value = List of original strings (anagrams)
- Finally return all values of the map.

### 🔹 Example:

"eat" → "aet"
"tea" → "aet"
"tan" → "ant"
Grouped as:

["eat", "tea", "ate"]

["tan", "nat"]

["bat"]


---

## 📊 Complexity

- **Time:** O(n × k log k)
- **Space:** O(n)

---

## ✅ Pros

- Simple and efficient.
- Easy to implement using `HashMap`.
- Works well for small to medium inputs.

---

## 📌 Summary

| Approach           | Time Complexity     | Space Complexity | Notes                        |
|--------------------|---------------------|------------------|-------------------------------|
| Brute Force        | O(n² × k log k)     | O(n)             | Slow, only for understanding  |
| Sorted String


