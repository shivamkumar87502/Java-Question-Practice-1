package F01_basic_question;

import java.util.Scanner;

public class Q03_To_find_armstrong_number_between_given_two_number {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first given number : ");
        int num1 = in.nextInt();
        System.out.print("Enter the second given number : ");
        int num2 = in.nextInt();

        for(int i = num1; i<+num2; i++){
            int num = i;
            int old_num = num;
            int sum = 0;
            while(num>0){
                int rem = num%10;
                num = num/10;
                sum = sum + (rem*rem*rem);
            }
            if(old_num==sum){
                System.out.println("The pallindrome number is " + old_num);
            }
        }
    }
}
