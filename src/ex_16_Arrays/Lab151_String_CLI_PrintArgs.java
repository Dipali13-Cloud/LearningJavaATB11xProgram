package ex_16_Arrays;

public class Lab151_String_CLI_PrintArgs {
    public static void main(String[] args) {
//        for (int i = 0; i< args.length;i++)
//        {
//            System.out.println(args[i]);        // pass the arguments from CLI
//        }

        if (args.length==0){
            System.out.println("No arguments passed..");
        }else {
            for (String arguments:args)
                System.out.println(arguments);
        }
    }
}
