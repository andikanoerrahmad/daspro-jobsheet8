import java.util.Scanner;

public class Tugas2_05 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        int total = 0;
        int hasilKali;
        
       for (int i = 1; i <= n; i++) {
         for (int j = 1; j <= n; j++) {
            hasilKali = i * j;
            System.out.print(hasilKali +"\t");
            total = total + hasilKali;
        }
        System.out.println();
       }
       System.out.println("Jumlah seluruh angka: " + total);
       sc.close();
    }
}
