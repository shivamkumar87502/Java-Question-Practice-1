package F01_basic_question;

import java.util.Scanner;

public class Q07_Reverse_a_string {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        // Reverse a string

        System.out.print("Enter a string : ");
        String str = in.next();
        String new_str = "";
        int n = str.length();
        for(int i=0; i<n; i++){
            new_str += str.charAt(n-(i+1));
        }
        System.out.println(new_str);
    }
}
