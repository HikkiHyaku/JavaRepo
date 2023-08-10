import java.util.Scanner;

public class Relationship {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String hati;

        System.out.print ("Jika Aku: ");
        hati = input.nextLine();

        if (hati.equals ("Diterima")) {
            System.out.println("Saya Akan Menjadi Pacarnya.");
            }else if (hati.equals ("Temenan Aja")) {
            System.out.println("Saya Hanya Sebatas Teman Dengannya.");
            }else if (hati.equals("Digantung") || hati.equals("Diberi Kesempatan")) {
            System.out.println("Saya Tetap Mengejar Dia.");
            }else{
            System.out.println("Saya Tertolak");
        }
    }
}
