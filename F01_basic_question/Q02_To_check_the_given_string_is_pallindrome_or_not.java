package F01_basic_question;

import java.util.Scanner;

public class Q02_To_check_the_given_string_is_pallindrome_or_not {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        // To check the given string is pallindrome or not?

        System.out.print("Enter a String : ");
        String line = in.next();
        int n = line.length();
        boolean check = true;
        for(int i=0; i<(n-1)/2; i++){
            if(line.charAt(i)!=line.charAt(n-(i+1))){
                check = false;
            }
        }
        System.out.println(check);
    }
}
