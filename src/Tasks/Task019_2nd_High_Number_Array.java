package Tasks;

public class Task019_2nd_High_Number_Array {
    public static void main(String[] args) {
        int[] num = {78,89,90,95,100,85,73};
         int largestNo = num[0];
         int secLargestNo = num[0];

         for (int i =1;i<num.length;i++)
         {
             if (num[i]>largestNo)
             {
                 secLargestNo = largestNo;
                 largestNo = num[i];
             }else if (num[i]>secLargestNo && num[i]!=largestNo)
             {
                 secLargestNo = num[i];
             }
         }
        System.out.println("Second largest num is: "+secLargestNo);
    }
}
