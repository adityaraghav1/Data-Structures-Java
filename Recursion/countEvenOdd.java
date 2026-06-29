public class CountEvenOdd {
    static int[] CountEvenOdd(int range){
        if(range ==0){
            int result[] = new int[2];
            return result;
        }
        int result[] = CountEvenOdd(range - 1);
        if(range % 2 == 0){
            result[0] = result [0] + 1;
        } else {
            result[1] = result[1] + 1;
        }
        return result;
    }
    static void CountEvenOdd(int range, int even, int odd){
        //Base Case
        if(range == 0){
            System.out.println("Even Count "+even+ " Odd Count "+odd);
            return;
        }
        if(range % 2 == 0){
            even++;
        } else {
            odd++;
        }
        CountEvenOdd(range - 1, even, odd); //Small Problem
    }
    public static void main(String[] args) {
        //CountEvenOdd(10, 0, 0);
        int[] arr = CountEvenOdd(11);
        System.out.println("Even Count "+ arr[0]);
        System.out.println("Odd Count "+ arr[1]);
    }
}
