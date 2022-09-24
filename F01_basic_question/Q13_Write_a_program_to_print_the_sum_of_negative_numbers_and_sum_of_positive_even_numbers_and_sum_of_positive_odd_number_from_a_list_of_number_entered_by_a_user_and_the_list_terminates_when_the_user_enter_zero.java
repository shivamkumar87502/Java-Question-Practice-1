package F01_basic_question;

import java.util.Scanner;

public class Q13_Write_a_program_to_print_the_sum_of_negative_numbers_and_sum_of_positive_even_numbers_and_sum_of_positive_odd_number_from_a_list_of_number_entered_by_a_user_and_the_list_terminates_when_the_user_enter_zero {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        // Write a program to print the sum of negative numbers and sum of positive even numbers and sum of positive off number form a list of number entered by a user and the list terminates when the user enter zero?

        System.out.print("Enter the number : ");
        int num = in.nextInt();
        int neg_sum = 0;
        int pos_even_sum = 0;
        int pos_odd_sum = 0;
        while(num!=0){
            if(num<0){
                neg_sum += num;
            }
            else if(num>0 && num%2==0){
                pos_even_sum += num;
            }
            else{
                pos_odd_sum  += num;
            }
            num = in.nextInt();
        }
        System.out.println(neg_sum);
        System.out.println(pos_even_sum);
        System.out.println(pos_odd_sum);
    } 
}
