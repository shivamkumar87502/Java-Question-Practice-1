package F01_basic_question;

import java.util.Scanner;

public class Q05_Take_the_integer_input_till_the_user_enter_0_and_print_the_sum_of_all_numbers {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        // Take the integer input till the user eneter 0 and print the sum of all numbers
        System.out.println("Enter a number : ");
        int num = in.nextInt();
        int total = num;
        while(num>0){
            num = in.nextInt();
            total += num;
        }
        System.out.println(total);
        
    }
}
