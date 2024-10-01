import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;
        String trash = "";

        System.out.println("Enter your Birth Month[1-12]: ");
        if(in.hasNextInt()) {
            birthMonth = in.nextInt();
            in.nextLine();
            if(birthMonth >= 1 && birthMonth <= 12)
            {
                System.out.println("You said your Birth Month " + birthMonth);
            }
            else
                System.out.println("Enter a Valid input " + birthMonth + "is not a valid month");

        }
        else
        {
            trash = in.nextLine();
            System.out.println("your entered " + trash + " is not a valid input") ;
            System.out.println("Run the program again with a correct input ");
        }
    }
}