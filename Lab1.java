import java.util.Scanner;
public class Lab1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        System.out.print("Enter m: ");
        int m = in.nextInt();
        System.out.print("Enter a: ");
        int a = in.nextInt();
        System.out.print("Enter b: ");
        int b = in.nextInt();
        int C = 9 % 3;
        double S = 0;
        for (int i = a; i <= n; i++) {
            for (int j = b; j <= m; j++) {
                S += ((double)(i-j)/(i-C));
            }
        }
        if (a == 0) {
            System.out.println("You can't divide by zero!");
        } else {
            System.out.println(S);
        }
    }
}
