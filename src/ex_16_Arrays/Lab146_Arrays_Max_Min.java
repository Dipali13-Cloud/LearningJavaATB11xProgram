package ex_16_Arrays;

public class Lab146_Arrays_Max_Min {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        int maxvalue = max_no(array);
        System.out.println("Maximum no: "+maxvalue);

        int minvalue = min_no(array);
        System.out.println("Minimum no: "+minvalue);

    }

    static int max_no(int[] array){
            int max = array[0];
        for (int i = 1; i<array.length; i++)
        {
            if (array[i]>max)
            {
                max = array[i];
            }
        }
return max;

    }

    static int min_no(int[] array)
    {
        int min = array[0];
        for (int i = 1;i<array.length;i++)
        {
            if (array[i]<min)
            {
                min = array[i];
            }

        }
        return min;
    }
}
