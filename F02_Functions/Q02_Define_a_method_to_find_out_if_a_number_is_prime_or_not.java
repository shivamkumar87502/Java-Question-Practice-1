package F02_Functions;

import java.util.Scanner;

public class Q02_Define_a_method_to_find_out_if_a_number_is_prime_or_not {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        // Define a method to find out if a number is prime or not

        prime(13);
    }

    static void prime(int num){
        boolean check = true;
        for(int i=2; i<num; i++){
            if(num%i==0){
                check = false;
                break;
            }
        }
        if(check==true){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}
