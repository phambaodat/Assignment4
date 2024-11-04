
package phambaodatbaitap2;
import java.util.Scanner;
public class PhamBaoDatbaitap2 {

    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao mot so nguyen: ");
        int n = scanner.nextInt();
        int sum = 0;
        int number = Math.abs(n); 
        while (number > 0) {
            int digit = number % 10; 
            sum += digit;            
            number /= 10;            
        }

        System.out.println("Tong cac chu so cua " + n + " la: " + sum);
    }
}
    
    

