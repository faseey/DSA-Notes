# LeetCode - 424. Longest Repeating Character Replacement

**Category:** Sliding Window
**Difficulty:** Medium
**Link:** [LeetCode Problem](https://leetcode.com/problems/longest-repeating-character-replacement/)

---

## 💬 Problem Statement

Given a string `s` and an integer `k`, return the length of the longest substring that can be obtained by replacing **at most `k` characters** so that all characters in the substring are the same.

---

## 🐌 Brute-force Approach

### 🔑 Idea:
- Try every possible substring.
- Count the frequency of each character in that substring.
- If `(window size - most frequent char count) <= k`, then it's a valid substring.
- Track the maximum length among all valid substrings.

### ⏱ Time and Space Complexity

| Metric     | Value   |
|------------|---------|
| Time       | O(n²)   |
| Space      | O(1)    |

---

## 🔄 Better Approach (Recomputing Max Frequency in Window)

### 🔑 Idea:
- Use a sliding window with two pointers.
- Keep frequency of characters in an array.
- If window size - maxFrequency > k → shrink window from left.
- **Recalculate `maxFrequency`** during shrinking.

### ⏱ Time and Space Complexity

| Metric     | Value   |
|------------|---------|
| Time       | O(26 × n) = O(n) in practice |
| Space      | O(1)    |

---

## 🚀 Optimal Approach (No Recalculation of Max Frequency)

### 🔑 Idea:
- Same as better approach but **do not recalculate `maxFrequency`** when shrinking.
- Even if maxFrequency becomes stale for a moment, it won't affect correctness because window will shrink anyway.
- Gives true linear time.

### ⏱ Time and Space Complexity

| Metric     | Value   |
|------------|---------|
| Time       | O(n)    |
| Space      | O(1)    |

---

## 🧠 Example

```text
Input: s = "AABABBA", k = 1

Longest valid substring: "AABA" or "ABBA" → length = 4
