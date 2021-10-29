import java.util.Scanner;

public class addSubDivMulRem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number here: ");

        int num1 = input.nextInt();

        System.out.println("Enter the number here: ");
        int num2 = input.nextInt();
        int add = num1+num2;
        int sub = num1-num2;
        int div = num1/num2;
        int rem = num1%num2;
        System.out.println("add =" +add);
        System.out.println("sub =" +sub);
        System.out.println("div =" +div);
        System.out.println("rem =" +rem);


    }
}
