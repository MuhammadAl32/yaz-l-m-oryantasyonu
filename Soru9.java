
package soru9;
import java.util.Scanner;
public class Soru9 {

    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("lutfen bir sayi giriniz: ");
int sayi = input.nextInt();

if(sayi % 2 == 0){
System.out.println(sayi + ": Cift");
}
else{
System.out.println(sayi + ": Tek");
}




    }
    
}
