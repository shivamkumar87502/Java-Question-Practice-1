package F01_basic_question;

import java.util.Scanner;

public class Q10_To_find_out_the_LCM_of_two_numbers {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        // To find out the LCM of two numbers

        System.out.print("Enter the first number : ");
        int num1 = in.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = in.nextInt();
        int mul=1;
        for(int i=1; i<num1; i++){
            for(int j=1; j<num2; j++){
                if(num1%i==0 && num2%i==0){
                    num1 /= i;
                    num2 /= i;
                    mul *= i;
                }
            }
        }
        System.out.println(mul*num1*num2);
    }
}
