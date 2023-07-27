import java.util.Scanner;

public class ForgetfulMachine{
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Siapakah Orang Yang Kamu Suka? ");
    keyboard.next();

    System.out.println("Apa Kamu Menganggapnya Istimewa? ");
    keyboard.next();

    System.out.println("Apa Dia Menganggapmu Ada? ");
    keyboard.next();

    System.out.println("Ada Lagi Yang Mau Diketik? "); 
    keyboard.next();
    }
}