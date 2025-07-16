# LeetCode - 1423. Maximum Points You Can Obtain from Cards

**Category:** Sliding Window  
**Difficulty:** Medium  
**Link:** [LeetCode Problem](https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/)

---

## 💬 Problem Statement

You have an integer array `cardPoints` and an integer `k`.  
You can pick exactly `k` cards from either the **start** or **end** of the array.  
Your goal is to **maximize the total points** you collect.

---

## 🚀 Brute-force Approach

Try all possible combinations of taking `i` cards from the front and `k - i` from the back.

### ⏱️ Time and Space Complexity

| Complexity | Value   |
|------------|---------|
| Time       | O(k²)   |
| Space      | O(1)    |

---

## ✅ Optimized Approach: Sliding Window

Start by taking the first `k` cards.  
Then slide the window by removing cards from the start and adding cards from the end one by one, keeping track of the maximum sum.

### ⏱️ Time and Space Complexity

| Complexity | Value   |
|------------|---------|
| Time       | O(k)    |
| Space      | O(1)    |

---

## 🧠 Example

```text
Input: cardPoints = [1,2,3,4,5,6,1], k = 4  
Possible max score: 13 (by picking [1,2] from front and [6,1] from back)
