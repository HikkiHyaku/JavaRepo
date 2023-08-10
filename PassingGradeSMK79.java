import java.util.Scanner;

public class PassingGradeSMK79{
    public static void main(String[] args) {
        int matematika, bhsInggris, bhsIndonesia, ipa;//Variable untuk menyimpan Nilai Ujian. 
        int passingGradeSMK, passingGradeSastra, passingGradeTIK; //Variable untuk menyimpan nilai syarat kelulusan. 
        boolean isPassingSMK, isPassingSastra, isPassingTIK; //Variable bertipe boolean untuk menyimpan hasil kelulusan.
        double averageUjian, averageBahasa;

        Scanner input = new Scanner(System.in);

        //Inisialisasi dulu nilai variable untuk syarat kelulusan
        passingGradeSMK = 73;
        passingGradeSastra = 75;
        passingGradeTIK = 80;

        System.out.println("Masukan nilai Ujian Matematika :");
        matematika = input.nextInt();

        System.out.println("Masukan nilai Ujian Bhs.Indonesia :");
        bhsIndonesia = input.nextInt();

        System.out.println("Masukan nilai Ujian Bhs.Inggris :");
        bhsInggris = input.nextInt();

        System.out.println("Masukan nilai Ujian IPA :");
        ipa = input.nextInt();

        //menghitung ratarata nilai ujian
        averageUjian = (matematika +  bhsIndonesia + bhsInggris + ipa)/4;

        //menghitung ratarata nilai bahasa
        averageBahasa = (bhsIndonesia + bhsInggris)/2;

        //membuat boolean expression untuk menentukan kelulusan

        //Menentukan kelulusan masuk SMK
        isPassingSMK = averageUjian >= passingGradeSMK;

        //Menentukan kelulusan masuk Jurusan Sastra
        isPassingSastra = averageBahasa >= passingGradeSastra;

        //Menentukan kelulusan masuk Jurusan Teknik Komputer Jaringan
        isPassingTIK = matematika >= passingGradeTIK;

        System.out.println("\n\nHasil dari Simulasi untuk Persyaratan Penerimaan Calon Siswa di SMK Padepokan 79 adalah sebagai berikut :");
        System.out.println("============================================================================");
        System.out.println("Apakah anda memenuhi Syarat untuk Masuk ke SMK Padepokan 79 : " + isPassingSMK);
        System.out.println("Apakah anda memenuhi Syarat untuk Masuk ke Jurusan Sastra : " + isPassingSastra);
        System.out.println("Apakah anda memenuhi Syarat untuk Masuk ke Jurusan Teknik Komputer Jaringan : " + isPassingTIK);
    }
}
