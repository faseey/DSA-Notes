# LeetCode 125. Valid Palindrome
🔗 [LeetCode Link](https://leetcode.com/problems/valid-palindrome/)

## Problem
Check whether a given string is a valid palindrome.  
Only consider **alphanumeric characters** and **ignore cases**.

Example:  
Input: `"A man, a plan, a canal: Panama"`  
Output: `true`

---

## Approach: Two Pointers

- Convert the string to lowercase.
- Use two pointers: `i` at the start, `j` at the end.
- Skip any non-alphanumeric characters using character checks.
- Compare characters at `i` and `j`:
    - If not equal → return false.
    - If equal → move both pointers inward.
- If loop completes, return true.

---

## Time and Space Complexity

- **Time Complexity:** `O(n)` — where `n` is the length of the string.
- **Space Complexity:** `O(1)` — constant space (no extra data structures used).
