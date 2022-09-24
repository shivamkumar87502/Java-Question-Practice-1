package F02_Functions;

import java.util.Scanner;

public class Q01_Define_two_methods_to_print_the_maximum_number_among_three_number {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        // Define the two methods to print the maximum number among three numbers

        System.out.println(maximum(2, 1, 15));
        System.out.println(minimum(2,3,1));
    }

    static int maximum(int a, int b, int c){
        int res = a;
        if(b>a){
            res = b;
            if(c>b){
                res = c;
            }
        }
        else{
            if(c>a){
                res=c;
            }
        }
        return res;
    }

    static int minimum(int a, int b, int c){
        int res = a;
        if(b<a){
            res = b;
            if(c<b){
                res = c;
            }
        }
        else{
            if(c<a){
                res=c;
            }
        }
        return res;
    }
}