import java.util.Scanner;

public class areaOfCircle {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius: ");
    double r = sc.nextDouble();
    double areaOfcir = Math.PI*r*r;
    double peri = Math.PI*2*r;
    System.out.println("Area: "+areaOfcir);
    System.out.println("peri: "+peri);

}
}
