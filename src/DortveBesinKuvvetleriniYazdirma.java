
 import java.util.Scanner;
 public class  DortveBesinKuvvetleriniYazdirma {
     public static void main(String[] args) {
         int number,i;

         Scanner input = new Scanner(System.in);
         System.out.print("Sayı Giriniz: ");
         number = input.nextInt();

         System.out.print("4'ün Kuvvetleri : ");
         for (i = 1 ; i <= number ; i *= 4) {
             System.out.print(i + " ");
         }
         System.out.print("\n5'in Kuvvetleri : ");
         for ( i = 1 ; i <= number ; i *= 5 ) {
             System.out.print(i + " ");
         }
     }
 }
