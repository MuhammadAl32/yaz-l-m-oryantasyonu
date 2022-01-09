
package karsilastirma;
import java.util.Scanner;
public class Karsilastirma {

    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("A sayini girinz: ");
double A = input.nextDouble();

System.out.println("B sayini giriniz: ");
double B = input.nextDouble();

if(A > B){
System.out.println("A BUYUK");
}
else if(A < B){
System.out.println("B BUYUK");
}
else{
System.out.println("A ESIT B");
}


    }
    
}
