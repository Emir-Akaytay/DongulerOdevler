
 import java.util.Scanner;
 public class KucukBuyukSiralama {
     public static void main(String[] args) {

         Scanner input = new Scanner(System.in);
         int number;
         int numberOfNumber;
         int whichNumber = 0;
         int max=-2147483648 , min=2147483647;
         System.out.print("Kaç Sayı Gireceksiniz ? : ");
         numberOfNumber = input.nextInt();

         for (int i = 1 ; i <= numberOfNumber ; i++) {
             whichNumber++;
             System.out.print(whichNumber+". Sayıyı Giriniz: ");
             number = input.nextInt();
             if (max < number) {
                 max = number;
             }
             if (number < min ) {
                 min = number;
             }
         }
         System.out.println("En büyük değer = "+max);
         System.out.println("En küçük değer = "+min);
     }
 }
