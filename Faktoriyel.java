
package faktoriyel;
import java.util.Scanner;
public class Faktoriyel {

    public static void main(String[] args) {
Scanner input = new Scanner(System.in);


System.out.println("lutfen uc sayi giriniz: ");
double sayi1 = input.nextDouble();
double sayi2 = input.nextDouble();
double sayi3 = input.nextDouble();


double ortalama = (sayi1 + sayi2 + sayi3)/3;

System.out.println(sayi1 + " ," + sayi2 + " ," + sayi3 + "ortalama : " + ortalama);



        
    }
    
}
