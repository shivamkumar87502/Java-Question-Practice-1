package F02_Functions;

import java.util.Scanner;

public class Q04_Define_a_method_that_return_all_the_prime_number_between_any_two_numbers {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        // Define a method that return all the prime number between any two numbers

        System.out.print("Enter the starting point : ");
        int num1 = in.nextInt();
        System.out.print("Enter the ending point : ");
        int num2 = in.nextInt();
        for(int i=num1; i<=num2; i++){
            boolean check = true;
            for(int j=2; j<i; j++){
                if(i%j==0){
                    check = false;
                }
            }
            if(check==true){
                System.out.print(i + ", ");
            }
        }
    }
}
