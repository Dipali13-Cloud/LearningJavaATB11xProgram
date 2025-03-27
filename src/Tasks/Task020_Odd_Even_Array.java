package Tasks;

public class Task020_Odd_Even_Array {
    public static void main(String[] args) {
//        int[] no = {10, 55, 36, 73, 81, 68, 99, 74, 92};
//        for (int i = 0; i < no.length; i++) {
//            if (no[i] % 2 == 0) {
//                System.out.println("Even no: " + no[i]);
//            } else {
//                System.out.println("Odd no: " + no[i]);
//            }
//        }


        int[] numbers = {99,100,21,38,79,60,53,49,51,86};
        for (int i:numbers){                                            // for each
            if (i%2==0){
                System.out.println(i+" is even number");
            }
            else {
                System.out.println(i+" is odd number");
            }
        }

    }
}
