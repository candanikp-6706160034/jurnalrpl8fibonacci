import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int ab, fibo = 1, awalan = 0;

        System.out.println("input : ");
        ab = in.nextInt();

        if (ab > 0){
            for (int i = 0; i < ab ; i++) {
                System.out.print(fibo + ", ");
                int temp = fibo;
                fibo += awalan;
                awalan = temp;
            }
        }
    }
}
