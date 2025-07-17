## 🔗 [LeetCode 76. Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/)

---

### 🧠 Intuition:
We need to find the **smallest substring in `s`** that contains **all characters of `t`** (including duplicates).  
This is a classic **sliding window** problem where we try to shrink the window while still satisfying the condition.

---

### 💭 Brute-Force Approach:
- Try every substring starting at each index.
- For each substring, check if it contains all characters of `t` using a hashmap.
- Keep track of the minimum length substring.

#### ⏱️ Time Complexity:
O(n²) — two nested loops over string `s`.

#### 🗃️ Space Complexity:
O(1) — assuming only lowercase/ASCII characters.

---

### 🚀 Optimized Sliding Window Approach:
- Use two pointers (`l` and `r`) to represent the window.
- Use an array (size 128 for ASCII) to store character frequencies from `t`.
- Expand `r` to find a valid window.
- Once all required characters are matched, try to shrink the window by moving `l`.
- Track the minimum window found.

#### ⏱️ Time Complexity:
O(n) — each character is visited at most twice.

#### 🗃️ Space Complexity:
O(1) — fixed-size array for ASCII characters.

---
