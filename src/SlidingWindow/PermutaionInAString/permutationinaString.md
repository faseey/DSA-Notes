# LeetCode - 567. Permutation in String

**Category:** Sliding Window  
**Difficulty:** Medium  
**Link:** [LeetCode Problem](https://leetcode.com/problems/permutation-in-string/)

---

## 💬 Problem Statement

Given two strings `s1` and `s2`, return `true` if `s2` contains a **permutation** of `s1`, or `false` otherwise.

In other words, check if any substring of `s2` is a rearranged version (permutation) of `s1`.

---

## 🚀 Brute-force Approach

### 🔑 Idea:
- Generate a frequency array `arr1` for `s1`.
- Slide a window of size `s1.length()` over `s2` and for each window:
    - Generate frequency array `arr2`
    - Compare `arr1` and `arr2` using `Arrays.equals()`

### ⏱ Time and Space Complexity

| Metric     | Value         |
|------------|---------------|
| Time       | O(26 × (m − n + 1)) = O(m) |
| Space      | O(1)          |

Where `n = s1.length()` and `m = s2.length()`  
*26 is the number of lowercase letters*

---

## ✅ Optimized Approach (Same as Brute in Code, but Efficient)

### 🔑 Idea:
- Instead of creating new arrays every time, update `arr2` incrementally:
    - Add the new character at the right end of the window.
    - Remove the old character at the left end.
- This avoids rebuilding `arr2` each time.

### ⏱ Time and Space Complexity

| Metric     | Value         |
|------------|---------------|
| Time       | O(m)          |
| Space      | O(1)          |

---

## 🧠 Example

```text
Input:
s1 = "ab"
s2 = "eidbaooo"

"ba" is a permutation of "ab" and is found in s2 → ✅ return true
