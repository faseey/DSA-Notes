# 🧱 Container With Most Water

🔗 [LeetCode Link](https://leetcode.com/problems/container-with-most-water/)

---

## 💣 Brute-force Approach

- Try all possible pairs of lines `(i, j)` where `i < j`.
- For each pair, calculate the area using:
  Area = (j - i) * min(height[i], height[j])


- Keep track of the maximum area found.

### 🧠 Intuition:
> Try every possible container formed by two lines and return the one that holds the most water.

---

## 🚀 Optimized Approach (Two Pointers)

- Place one pointer at the **start** and one at the **end** of the array.
- Calculate the area between the two lines.
- Move the pointer pointing to the **shorter** line inward, since a taller line might increase area.
- Repeat until both pointers meet.

### 🧠 Intuition:
> Since the area is limited by the shorter line, we move it to search for a potentially better container.

---

## ⏱️ Time & Space Complexity

| Approach       | Time Complexity | Space Complexity |
|----------------|------------------|------------------|
| Brute-force    | O(n²)            | O(1)             |
| Two Pointers   | O(n)             | O(1)             |