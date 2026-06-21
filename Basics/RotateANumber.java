public class RotateANumber {
    public static void main(String[] args) {
        int num = 67894;
        int count = 0;
        int rotations = 4;
        int copy = num;
        while(copy != 0){
            count++;
            copy = copy/10;
        }
        rotations = rotations % count;
        if(rotations<0){
            rotations = rotations + count;
        }
        int pow = (int)Math.pow(10, rotations);
        int lhs = num / pow;
        int rhs = num % pow;
       //System.out.println(lhs);
       //System.out.println(rhs);
       int pow2 = (int)Math.pow(10,count - rotations);
       int result = rhs * pow2 + lhs;
       System.out.println(result);
    }
}
