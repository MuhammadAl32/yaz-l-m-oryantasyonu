
package soru8;
import java.util.Scanner;
public class Soru8 {

    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("lutfen baslangic degerini giriniz: ");
int basla = input.nextInt();

System.out.println("lutfen adet degerini giriniz: ");
int adet = input.nextInt();

System.out.println("lutfen artis degerini girniz: ");
int artis = input.nextInt();

for(int i=1; i<=adet; i++){
System.out.print(basla + ",");
basla = basla+artis;
}



    }
    
}
