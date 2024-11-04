
package phambaodatbaitap3;


public class PhamBaoDatbaitap3 {


    public static void main(String[] args) {
      System.out.println("Cac so nguyen to tu 1 den 100 la:");

    
        for (int i = 2; i <= 100; i++) {
           
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    
    public static boolean isPrime(int n) {

        if (n < 2) return false;

        for (int j = 2; j * j <= n; j++) {
            if (n % j == 0) return false;
        }

        return true;
    }
}
