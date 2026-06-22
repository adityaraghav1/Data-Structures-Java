public class StrongNumber {
    static int fact(int digit){
        int result = 1;
        while(digit>1){
            result = result * digit;
            digit--;
        }
        return result;
    }
    public static void main(String[] args) {
        int num = 145;
        int copy = num;
        int sum = 0;
        while(copy !=0){
            int digit = copy % 10;
            sum = sum + fact(digit);
            copy = copy /10;
        }
        System.out.println(num == sum?"Strong Number": "Not a Strong Number");

    }
}
