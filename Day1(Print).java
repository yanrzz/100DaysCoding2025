
package d0225003;

import java.util.Scanner;
public class Soal1 {
    public static void main(String[] args) {
    
        Scanner mn = new Scanner(System.in);
        System.out.print("masukkan variabel A");
        int a = mn.nextInt();
        System.out.print("masukkan Variabel B");
        int b = mn.nextInt();
        System.out.println("masukkan");
        int c = mn.nextInt();
        int hasilA= a + b + c;
        int hasilB = a - b - c;
        int hasilC = a * b * c;
        int hasilD = a / b / c;
        
         System.out.println("hasilA" + hasilA);
         System.out.println("hasilB" + hasilB);
         System.out.println("hasilC" + hasilC);
         System.out.println("hasilD" + hasilD);
           
    }
   
}
