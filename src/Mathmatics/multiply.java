package Mathmatics;

public class multiply {
    public int multiply(int num1, int num2) {
        int sum = 0;
        if (num2 <= 0) {
            return sum;
        }
        sum += num1;
        return sum + multiply(num1, num2 - 1);
    }
}
