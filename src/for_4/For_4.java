package for_4;

import java.util.Scanner;

public class For_4 {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int baris, masuk, kolom, hitung;
        
        do
        {
            System.out.print("Maukkan Jumlah Perulangan = ");
            masuk = input.nextInt();
            
        }
        while(masuk < 1);
        
        System.out.println("");
        System.out.println("+-------Tugas For 4-------+");
        System.out.println("+-------------------------+");
        System.out.println("");
        
        for (baris = 1; baris <= masuk; baris++) 
        {
            for (kolom = 1; kolom <= masuk; kolom++) 
            {
                hitung = kolom * baris;
                System.out.printf("%4d ", hitung);
            }
            System.out.println(" ");
        }
        System.out.println("");
        System.out.println("+------- 025314020 -------+");
        System.out.println("+-------Program Java------+");
    }
    
}
