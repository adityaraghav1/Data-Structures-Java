public class FlipDigit{
    public static void main(String[] args) {
        int num = 32145;
        int position = 0;
        int sum = 0;
        while(num != 0){
        int singleDigit = num % 10; 
        position++;
        int pow = (int)Math.pow(10, singleDigit-1);
        sum = sum + position * pow;
        num = num/10; // make number smaller 
        }
        System.out.println(sum);
    }
}
