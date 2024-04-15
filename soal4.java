import java.sql.SQLOutput;
import java.util.Scanner;

public class soal4 {
    public static void main(String[] args){
        String nama;
        int nilai;
        String score = "";

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan nama : ");
        nama = scan.nextLine();
        System.out.print("Masukan nilai : ");
        nilai = scan.nextInt();

        if (nilai >= 80){
            score = "A";
        } else if (nilai >=65 && nilai <=79) {
            score = "B";
        } else if (nilai >=50 && nilai <= 64) {
            score ="C";
        } else if (nilai >=35 && nilai <= 49) {
            score = "D";
        } else{
            score = "E";
        }

        System.out.println("Nama : "+ nama+"; Score : "+ score);
    }
}
