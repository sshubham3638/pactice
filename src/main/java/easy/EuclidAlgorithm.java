package easy;
import java.util.Scanner;
public class EuclidAlgorithm {
        public static int euclid(int x, int y) {
            if (x == 0 || y == 0) {
                return 1;
            }
            if (x < y) {
                int t = x;
                x = y;
                y = t;
            }
            if (x % y == 0) {
                return y;
            } else {
                return euclid(y, x % y);
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("x: " );
            int x =sc.nextInt();
            System.out.println("y: ");
            int y = sc.nextInt();
            System.out.println("result: " + euclid(x, y));
        }
    }


