import java.util.Scanner;
public class nilai{
    public static void garis() {
        System.out.println("===============================");
    }
    public static void main(String[] args) {
        String nama;
        int NIM, nilai;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan NIM   : ");
        NIM = input.nextInt();
        System.out.print("Masukan Nama  : ");
        nama = input.next();
        System.out.print("Masukan Nilai : ");
        nilai = input.nextInt();
        if (nilai > 80 && nilai <= 100){
            garis();
            System.out.println("NIM            = " + NIM);
            System.out.println("Nama           = " + nama);
            System.out.println("Mendapat nilai = A");
            
        }else if (nilai >70 && nilai < 80){
            garis();
            System.out.println("NIM            = " + NIM);
            System.out.println("Nama           = " + nama);
            System.out.println("Mendapat nilai = B");
            
        }else if (nilai > 60 && nilai < 70){
            garis();
            System.out.println("NIM            = " + NIM);
            System.out.println("Nama           = " + nama);
            System.out.println("Mendapat nilai = C");
            
        }else if (nilai > 50 && nilai < 60){
            garis();
            System.out.println("NIM            = " + NIM);
            System.out.println("Nama           = " + nama);
            System.out.println("Mendapat nilai = D");
            
        }else{
            garis();
            System.out.println("NIM            = " + NIM);
            System.out.println("Nama           = " + nama);
            System.out.println("Mendapat nilai = E");
            
        }        
    }
}