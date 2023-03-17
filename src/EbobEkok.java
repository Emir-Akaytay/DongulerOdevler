
 import java.util.Scanner;
 public class EbobEkok {
     public static void main(String[] args) {

         Scanner input = new Scanner(System.in);
         int num1,num2,lowest,hcf,lcm;

         do {
             hcf = 0;
             lcm = 0;
             lowest = 0;
             System.out.print("1. Sayıyı Giriniz: ");
             num1 = input.nextInt();
             System.out.print("2. Sayıyı Giriniz: ");
             num2 = input.nextInt();
             if (num1 == 0 || num2 == 0) {
                 System.out.print("0'ın EBOB'u ve EKOK'u Hesaplanamaz !!!");
                 System.out.println();
                 continue;
             } else if (num1 < 0 || num2 < 0) {
                 System.out.print("Lütfen Pozitif Değerler Giriniz !!!");
                 System.out.println();
                 continue;
             } else lowest = Math.min(num2 , num1);
             for (int i = 1 ; i <= lowest ; i++) {
                 if (num1 % i == 0 && num2 % i == 0) {
                     hcf = i;
                 }
             }
             lcm = (num1 * num2)/hcf;
             System.out.println("EBOB: "+hcf);
             System.out.println("EKOK: "+lcm);
         } while (true);
     }
 }
