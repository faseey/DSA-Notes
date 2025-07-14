# 🌧️ Trapping Rain Water

🔗 [LeetCode Link](https://leetcode.com/problems/trapping-rain-water/)

---

## 💣 Brute-force Approach (Using Prefix Max Arrays)

- Create two arrays: `leftMax[]` and `rightMax[]`
- For each bar, the water it can trap is:  
  `min(leftMax[i], rightMax[i]) - height[i]`
- Sum this for all bars.

### 🧠 Intuition:
> Every bar can trap water only if it has a taller bar on both its left and right. So we precompute the **maximum height to the left and right** of each bar, and use that to compute trapped water.

---

## 🚀 Optimized Approach (Two Pointers)

- Use two pointers `l` and `r` starting from both ends.
- Maintain `leftMax` and `rightMax` as you go.
- At each step, calculate trapped water based on:
  `min(leftMax, rightMax) - height[i]`

### 🧠 Intuition:
> Since water trapping depends on the minimum of max-left and max-right, we can move the pointer with the smaller max — because the limiting factor lies there.

---

## ⏱️ Time & Space Complexity

| Approach       | Time Complexity | Space Complexity |
|----------------|------------------|------------------|
| Brute-force    | O(n)             | O(n)             |
| Two Pointers   | O(n)             | O(1)             |
