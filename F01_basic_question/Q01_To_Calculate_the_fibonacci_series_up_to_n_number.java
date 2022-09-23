package F01_basic_question;

import java.util.Scanner;

public class Q01_To_Calculate_the_fibonacci_series_up_to_n_number{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        // To calculate the fibonacci series up to n numbers?

        System.out.print("Enter the value of n : ");
        int n = in.nextInt();

        int a = 0;
        int b = 1;
        System.out.print(a+", "+b+", ");
        for(int i=0; i<n-2; i++){
            int c = a + b;
            System.out.print(c + ", ");
            a = b;
            b = c;
        }
    }
}