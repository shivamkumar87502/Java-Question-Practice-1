package F02_Functions;

import java.util.Scanner;

public class Q03_Define_a_method_to_find_NCR_and_NPR {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        // Define a method to find the NCR and NPR

        // nCr - 
        System.out.print("Enter the total number of things : ");
        int n1 = in.nextInt();
        System.out.print("Enter the number of things to be chosen out of n things : ");
        int r1 = in.nextInt();
        int ncr = (factorial(n1))/(factorial(r1)*factorial(n1-r1));
        System.out.println(ncr);

        // nPr - 
        System.out.print("Enter the total number of things : ");
        int n2 = in.nextInt();
        System.out.print("Enter the number of things to be chosen out of n things : ");
        int r2 = in.nextInt();
        int npr = (factorial(n2))/(factorial(n2-r2));
        System.out.println(npr);
    }

    static int factorial(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact *= i;
        }
        return fact;
    }
}
