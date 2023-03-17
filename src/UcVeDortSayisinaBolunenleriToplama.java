
import java.util.Scanner;
public class UcVeDortSayisinaBolunenleriToplama {
    public static void main(String[] args) {
        double number,total = 0,totalPlus = 0 ;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        number = input.nextInt();

        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                totalPlus += i;
                total++;
            }
        }
        double average = totalPlus / total;
        System.out.println("Ortalama: "+ average );
    }
}
