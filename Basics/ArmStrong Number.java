public class ArmStrong {
    public static void main(String[] args) {
        int num = 370;
        int copy = num;
        int count = 0;
        int sum = 0;
        while(copy !=0){
            count++;
            copy = copy/10;
        }
        //System.out.println(count);
        copy = num;
        while(copy != 0){
            int digit = copy % 10;
            sum = sum + (int)Math.pow(digit,count);
            copy = copy/10;
        }
        System.out.println(num == sum?"ArmStrong Number":"Not an ArmStrong Number");
    }
}
