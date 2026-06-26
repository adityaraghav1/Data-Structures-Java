public class SumofDigits {
    static int sumofDigit(int num){
        if(num == 0){
            return 0;
        }
        int sum = sumofDigit(num/10); // Small Problem
        int digit = num % 10;
        sum += digit;
        return sum;
    }
    static void sumOfDigit(int num, int sum) {
        if(num == 0) {
            System.out.println(sum); // Base Case
            return;
        }
        int digit = num % 10;
        sum += digit;
        sumOfDigit(num/10, sum);
    }
    public static void main(String[] args) {
        //sumOfDigit(123,0);
        System.out.println(sumofDigit(123));
    }
}
