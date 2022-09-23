package F01_basic_question;

import java.util.Scanner;

public class Q09_To_find_out_the_HCF_of_two_number {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        // To find out the HCF of two given number?]

        System.out.print("Enter the first number : ");
        int num1 = in.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = in.nextInt();
        if(num1<num2){
            while(num2%num1!=0){
                int rem = num2%num1;
                num2 = num1;
                num1 = rem;
            }
            System.out.println(num1);
        }
    }
}
