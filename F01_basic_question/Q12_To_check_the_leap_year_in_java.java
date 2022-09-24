package F01_basic_question;

import java.util.Scanner;

public class Q12_To_check_the_leap_year_in_java {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        // To check the leap year in java

        System.out.print("Enter a year : ");
        int year = in.nextInt();

        if(year%4==0){
            System.out.println("Leap Year");
        }
        else if(year%100==0 && year%4==0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a Leap year");
        }
    }
}
