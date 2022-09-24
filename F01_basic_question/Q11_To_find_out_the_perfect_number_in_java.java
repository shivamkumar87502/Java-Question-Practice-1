package F01_basic_question;

import java.util.Scanner;

public class Q11_To_find_out_the_perfect_number_in_java {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        // To find out the perfect number in java

        System.out.print("Enter a number : ");
        int num = in.nextInt();
        boolean check = false;
        for(int i=1; i<num; i++){
            if(i*i==num){
                check = true;
                break;
            }
        }
        if(check==false){
            System.out.println("Not Perfect");
        }
        else{
            System.out.println("Perfect");
        }
    }
}
