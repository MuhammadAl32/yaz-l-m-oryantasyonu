
package notlar;
import java.util.Scanner;
public class Notlar {

    
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("lutfen sinav notunizu giriniz: ");
int not = input.nextInt();

if(not>=90 && not<=100){
System.out.println("Tebrikler, AA ile gectiniz");
    }
else if(not>=85 && not<90){
System.out.println("Tebrikler, BA ile gectiniz");
}
else if(not>=80 && not<85){
System.out.println("Tebrikler , BB ile gectiniz");
}
else if(not>=75 && not<80){
System.out.println("Tebrikler, CB ile gectiniz");
}
else if(not>=65 && not<75){
System.out.println("Tebrikler, CC ile gectiniz");
}
else if(not>=55 && not<65){
System.out.println("Tebrikler DC ile gectiniz");
}
else if(not>=45 && not<55){
System.out.println("Tebrikler, DD ile gectiniz");
}
else if(not<45){
System.out.println("FF ile kaldiniz");
}
else{
System.out.println("lutfen gecerli bir puan girinz");
}
        








    }
    
}
