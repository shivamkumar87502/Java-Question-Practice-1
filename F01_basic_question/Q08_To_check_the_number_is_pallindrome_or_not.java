package F01_basic_question;

import java.util.Scanner;

public class Q08_To_check_the_number_is_pallindrome_or_not {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        // To check the number is pallindrome or not

        System.out.print("Enter a number : ");
        int num = in.nextInt();
        int old_num = num;
        int new_num = 0;
        while(num>0){
            int rem = num%10;
            num /= 10;
            new_num = (new_num*10) + rem;
        }

        if(new_num==old_num){
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("Not Pallindrom");
        }
    }
}
