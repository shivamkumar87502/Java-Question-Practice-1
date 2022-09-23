package F01_basic_question;

import java.util.Scanner;

public class Q06_Take_integer_input_till_the_user_enters_0_and_print_the_largest_number_from_all {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        // Take integer input till the user enter 0 and print the larges number form all

        System.out.println("Enter the number : ");
        int num = in.nextInt();
        int largest_num = num;
        while(num!=0){
            int new_num = in.nextInt();
            if(new_num>num){
                largest_num = new_num;
            }
            else if(new_num==0){
                break;
            }
        }
        System.out.println(largest_num);
    }
}
