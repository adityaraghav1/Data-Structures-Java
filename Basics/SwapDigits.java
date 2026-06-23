public class SwapDigits{
    public static void main(String[] args) {
        int num = 27894;
        int last = num % 10;
        int count = 0;
        int first = num;
        int copy = num;
        while(copy!=0){
            count++;
            copy = copy/10;
        }
        while(first>=10){
            first = first/10;
        }
        int pow = (int)Math.pow(10, count-1);
        int middle = (num % pow)/10;
        int result = last * pow + middle * 10 + first;
        System.out.println(result);
    }
}
