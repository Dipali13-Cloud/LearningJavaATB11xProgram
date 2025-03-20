package ex_09_Switch;

public class Lab084_InterviewQue {
    public static void main(String[] args) {
        long a11 = 301;
        switch ((int) a11)
        {
//            switch only works with int, char, byte, short, String, and enum, but not long.
//            (int) a11 converts the long value 100 to int, so the switch statement works.
//            Since 100 fits in int range, there's no issue in this case.
//            If a11 had a very large value (bigger than int range), casting could cause wrong values due to overflow.
//            If long values are needed, use if-else instead of switch.
        }
    }
}
