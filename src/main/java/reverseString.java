import java.util.Scanner;

public class reverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string which you want to revert: ");
        char[] text = sc.nextLine().toCharArray();
        int length =text.length;
        System.out.println(length);
        System.out.print("Reverse string: ");
        for (int i=length-1; i>=0;i--) {
            System.out.print(text[i]);
        }

    }
}
