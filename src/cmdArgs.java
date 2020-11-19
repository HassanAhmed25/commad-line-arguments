import java.util.Scanner;

public class cmdArgs {
    public static void main(String[] args) {

        char op = 'x';
        if (args.length >= 3)
        {

            //Char conversion;
            char a = args[0].charAt(0);
            System.out.println("Char " + a);

            //Double conversion;
            double x = Double.parseDouble(args[1]) ;
            System.out.println("Double " + x);

            //Integer array conversion;
            int[] intArray = new int[args.length - 2];
            int j = 2;
            for (int i = 0; i < intArray.length; i++)
            {
                intArray[i] = Integer.parseInt(args[j]);
                j++;
            }

            for (int i = 0; i < intArray.length; i++)
            {
                System.out.println("Integer Array " + intArray[i]);
            }

            System.out.println("Choose option:");
            System.out.println("Select a for print all int values multiplied by the double.");
            System.out.println("Select b for print all int values divided by the double.");
            System.out.println("Select c for print all int values added by the double.");
            System.out.print("Your option: ");

            Scanner s = new Scanner(System.in);
            op = s.next().charAt(0);

            switch (op)
            {
                case 'a':
                    for (int i = 0; i < intArray.length; i++) {
                        int mul1 = (int) (intArray[i] * x);
                        System.out.println("Value " + mul1);
                    }
                    break;

                case 'b':
                    for (int i = 0; i < intArray.length; i++) {
                        int div = (int) (intArray[i] / x);
                        System.out.println("Value " + div);
                    }
                    break;

                case 'c':
                    for (int i = 0; i < intArray.length; i++) {
                        int add = (int) (intArray[i] + x);
                        System.out.println("Value " + add);
                    }
                    break;

                default:
                    System.out.println("Invalid Selection");
                    break;
            }
        }
        else {

            System.out.println("More parameters required! Run again" );
        }
    }
}
