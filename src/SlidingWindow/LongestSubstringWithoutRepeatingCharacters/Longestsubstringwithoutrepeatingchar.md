# LeetCode - 3. Longest Substring Without Repeating Characters

**Category:** Sliding Window  
**Difficulty:** Medium  
**Link:** [LeetCode Problem](https://leetcode.com/problems/longest-substring-without-repeating-characters/)

---

## 💬 Problem Statement

Given a string `s`, find the **length of the longest substring** without repeating characters.

---

## 🚀 Brute-force Approach

### 🔑 Idea:
- Try all substrings starting from each index.
- For each substring, use a `Set` to detect duplicates.
- Stop checking as soon as a duplicate character is found.

### ⏱ Time and Space Complexity

| Metric     | Value              |
|------------|--------------------|
| Time       | O(n²)              |
| Space      | O(min(n, k))       |

Where `n = s.length()` and `k = size of character set`.

---

## ✅ Optimized Approach: Sliding Window + HashMap

### 🔑 Idea:
- Use a sliding window with two pointers `l` and `r`.
- Track characters and their **last seen index** in a HashMap.
- If a character is repeated **inside the window**, move `l` to one position after the last occurrence.
- Update `maxlength` as you expand the window.

### ⏱ Time and Space Complexity

| Metric     | Value              |
|------------|--------------------|
| Time       | O(n)               |
| Space      | O(min(n, k))       |

---

## 🧠 Example

```text
Input: "abcabcbb"

Substrings without repetition:
"abc" → length 3  
"bca" → length 3  
"cab" → length 3  
...

✅ Max Length = 3
