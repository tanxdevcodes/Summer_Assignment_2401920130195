import java.util.*;

class DailyTemperatures {

    public static int[] dailyTemperatures(int[] temps) {

        int[] results = new int[temps.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < temps.length; i++) {

            // while current temp is greater than stack top index temp
            while (!stack.isEmpty() && temps[stack.peek()] < temps[i]) {

                int index = stack.pop();
                results[index] = i - index;
            }

            stack.push(i);
        }

        return results;
    }

    public static void main(String[] args) {

        int[] temps = {73, 74, 75, 71, 69, 72, 76, 73};

        int[] ans = dailyTemperatures(temps);

        System.out.println(Arrays.toString(ans));
    }
}
