import java.util.Scanner;

class segitiga {
    public static void main(String[] args) {
        int i, j;
        int panjang;
        Scanner input = new Scanner(System.in);
        System.out.printf("Masukkan Jumlah Karakter : ");
        panjang = input.nextInt();
        System.out.print("-----------------------------------");
        System.out.println();

        // Segitiga siku kiri atas
        System.out.println("Segitiga Kiri Atas");
        for(i=0;i<=panjang;i++) {
            for(j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println();
        
        //Segitiga kiri bawah
        System.out.println("Segitiga Kiri Bawah");
        for(i=0;i<panjang;i++) {
            for(j=i;j<panjang;j++) {
                System.out.print("*");
            }
        System.out.println();
        }
       
    }
}