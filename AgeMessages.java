import java.util.Scanner;

public class AgeMessages {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int umur;

        System.out.print ("Berapa umur kamu? ");
        umur = input.nextInt();

        if (umur >= 18) {
            System.out.println("Kamu dapat membuat Surat Izin Mengemudi (SIM) ");
        }
    }
}