import java.util.*;

public class Main {

    // Question 1: Majority Element
    public static int majorityElement(int[] nums) {
        int count = 0, candidate = 0;
        for (int num : nums) {
            if (count == 0) candidate = num;
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }

    // Question 2: Single Number
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) result ^= num;
        return result;
    }

    // Question 6: Pascal's Triangle
    public static List<List<Integer>> generatePascalTriangle(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>(Collections.nCopies(i + 1, 1));
            for (int j = 1; j < i; j++) {
                row.set(j, triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
            }
            triangle.add(row);
        }
        return triangle;
    }

    // Question 7: Remove Element
    public static int removeDuplicates(int[] nums) {
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) nums[index++] = nums[i];
        }
        return index;
    }

    // Question 8: Baseball Game
    public static int calPoints(String[] ops) {
        Stack<Integer> scores = new Stack<>();
        for (String op : ops) {
            if (op.equals("C")) scores.pop();
            else if (op.equals("D")) scores.push(scores.peek() * 2);
            else if (op.equals("+")) {
                int top = scores.pop();
                int newScore = top + scores.peek();
                scores.push(top);
                scores.push(newScore);
            } else scores.push(Integer.parseInt(op));
        }
        return scores.stream().mapToInt(Integer::intValue).sum();
    }

    // Question 10: Container With Most Water
    public static int maxArea(int[] height) {
        int maxArea = 0, left = 0, right = height.length - 1;
        while (left < right) {
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
            if (height[left] < height[right]) left++;
            else right--;
        }
        return maxArea;
    }

    // Question 11: Valid Sudoku
    public static boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    String num = "(" + board[i][j] + ")";
                    if (!seen.add(num + i) || !seen.add(j + num) || !seen.add(i / 3 + num + j / 3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    // Question 12: Jump Game II
    public static int jump(int[] nums) {
        int jumps = 0, currEnd = 0, currFarthest = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            currFarthest = Math.max(currFarthest, i + nums[i]);
            if (i == currEnd) {
                jumps++;
                currEnd = currFarthest;
            }
        }
        return jumps;
    }

    // Question 14: Design Circular Queue (Simplified)
    static class MyCircularQueue {
        private int size, front, rear, count;
        private int[] data;

        public MyCircularQueue(int k) {
            this.size = k;
            this.data = new int[k];
            this.front = 0;
            this.rear = -1;
            this.count = 0;
        }

        public boolean enQueue(int value) {
            if (isFull()) return false;
            rear = (rear + 1) % size;
            data[rear] = value;
            count++;
            return true;
        }

        public boolean deQueue() {
            if (isEmpty()) return false;
            front = (front + 1) % size;
            count--;
            return true;
        }

        public int Front() {
            return isEmpty() ? -1 : data[front];
        }

        public int Rear() {
            return isEmpty() ? -1 : data[rear];
        }

        public boolean isEmpty() {
            return count == 0;
        }

        public boolean isFull() {
            return count == size;
        }
    }

    public static void main(String[] args) {
        // Example: Test cases for a few functions
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority Element: " + majorityElement(nums));

        int[] single = {4, 1, 2, 1, 2};
        System.out.println("Single Number: " + singleNumber(single));

        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Max Area: " + maxArea(heights));

        MyCircularQueue queue = new MyCircularQueue(3);
        queue.enQueue(1);
        queue.enQueue(2);
        System.out.println("Circular Queue Front: " + queue.Front());
        System.out.println("Circular Queue Rear: " + queue.Rear());
    }
}
