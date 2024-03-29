// Вывести все простые числа от 1 до 1000
package HomeWork_java;

import java.util.Scanner;

public class Task2_s1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Простые целые числа от 1 до 1000:\n");
        for (int i = 1; i <= 1000; i++) {
            if(isSimplyNumber(i)){
                System.out.printf("%d\n", i);   
            }
        }
        iScanner.close();
    }

    public static boolean isSimplyNumber(int n){        
        for (int i=2; i<n; i++){
            if(n % i == 0) return false;     
        }            
        return true;
    }
}