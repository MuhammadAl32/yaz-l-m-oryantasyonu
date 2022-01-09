
package maas;
import java.util.Scanner;
public class Maas {

    public static void main(String[] args) {
Scanner input= new Scanner(System.in);

System.out.println("Sicil numaranizi giriniz");
String sicil = input.nextLine();

System.out.println("Calisma saati giriniz: ");
int calisma = input.nextInt();

System.out.println("Saatlik ucreti giriniz: ");
int saatlik = input.nextInt();

int maas;
maas = calisma*saatlik;

System.out.println("Sicil Numara: " + sicil + " Maas: " + maas);
    
    
    }
    
}
