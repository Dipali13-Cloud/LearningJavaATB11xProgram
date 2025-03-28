package ex_16_Arrays;

public class Lab152_2D_Array {
    public static void main(String[] args) {
        // 1,2,3
        // 4,5,6
        // 7,8,9
        int[][] array2D = {{1,2,3},{4,5,6},{7,8,9}};

        // to understand array can write like
        int[][] array_2D = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        // 10,20
        // 30,40
        // 50,60
        int[][] array2DEx = {{10,20},{30,40},{50,60}};

        // R ->  3
        // C -> 3
        int[][] array_2d = new int[3][3];
        array_2d[0][0]=1;
        array_2d[0][1]=3;
        array_2d[0][2]=5;

        array_2d[1][0]=2;
        array_2d[1][1]=4;
        array_2d[1][2]=6;

        array_2d[2][0]=7;
        array_2d[2][1]=9;
        array_2d[2][2]=3;



    }
}
