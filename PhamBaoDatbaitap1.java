package phambaodatbaitap1;


public class PhamBaoDatbaitap1 {

    public static void main(String[] args) {
       int Tongcacsole = 0, Tongcacsochan = 0;
       for(int i =1; i<=100; i++){
           if ( i % 2 == 0){
               Tongcacsochan +=i;
           }else{
               Tongcacsole +=i;
           }
       }
       System.out.println("Tong cac so chan tu 1 den 100: " + Tongcacsochan);
       System.out.println("Tong cac so le tu 1 den 100: " + Tongcacsole);
    }
    
}
