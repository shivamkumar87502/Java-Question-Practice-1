package F01_basic_question;

import java.util.Scanner;

public class Q04_Input_a_number_and_print_all_the_factors_of_that_number_using_loops {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        // Input a number and print all the factors of that number using loops

        System.out.print("Enter a number : ");
        int num = in.nextInt();

        for(int i=1; i<=num; i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
    }
}
