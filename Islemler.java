
package islemler;
import java.util.Scanner;

public class Islemler {

    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("lutfen sayi1 giriniz: ");
double sayi1 = input.nextDouble();

System.out.println("lutfen sayi2 giriniz: ");
double sayi2 = input.nextDouble();
double carpma= sayi1*sayi2;
double toplama = sayi1 + sayi2;

double bolme = 1;
double cikarma = 1;

if(sayi1>=sayi2){
bolme = sayi1/sayi2;
cikarma = sayi1-sayi2;
}
else {
bolme = sayi2/sayi1;
cikarma = sayi2-sayi1;
}
System.out.println("Carpim: " + carpma);
System.out.println("Toplam: " + toplama);
System.out.println("Bolme: " + bolme);
System.out.println("Cikarma: "+  cikarma);
    }
    
}
