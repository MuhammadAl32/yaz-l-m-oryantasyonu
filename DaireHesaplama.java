
package dairehesaplama;
import java.util.Scanner;
public class DaireHesaplama {

    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

double PI = 3.14159;

System.out.println("lutfen yaricap degerini girinz: ");
double yaricap = input.nextDouble();

double dairecevri= 2*PI*yaricap;
double dairealani = PI*yaricap*yaricap;

System.out.println("Daire Cevri: "  +dairecevri);
System.out.println("Daire Alani: " + dairealani);


    }
    
}
