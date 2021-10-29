import java.util.Scanner;

class addNumbers {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Input your first number: ");
        int num1 = input.nextInt();
        System.out.print("Input your 2nd number: ");
        int num2 = input.nextInt();
        System.out.println();
        System.out.println(num1+num2);
    }
}