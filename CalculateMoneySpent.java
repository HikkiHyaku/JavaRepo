import java.util.Scanner;

public class CalculateMoneySpent{ 
    public static void main(String[] args) {
        String name;
        int moneySpent;
        double average;
        int total;
        int totalDay = 7;

        Scanner input = new Scanner(System.in);

        System.out.println("Calculate Your Money!!!\n");

        System.out.println("Hey, What is your name?");
        name = input.nextLine();

        System.out.println("How much money did you spend at the club on Senin"); 
        moneySpent = input.nextInt();

        total = moneySpent;

        System.out.println("How much money did you spend at the club on Selasa"); 
        moneySpent = input.nextInt();
        
        total = total + moneySpent;

        System.out.println("How much money did you spend at the club on Rabu"); 
        moneySpent = input.nextInt();
        
        total = total + moneySpent;

        System.out.println("How much money did you spend at the club on Kamis"); 
        moneySpent = input.nextInt();
        
        total = total + moneySpent;

        System.out.println("How much money did you spend at the club on Jum'at"); 
        moneySpent = input.nextInt();
        
        total = total + moneySpent;

        System.out.println("How much money did you spend at the club on Sabtu"); 
        moneySpent = input.nextInt();
        
        total = total + moneySpent;

        System.out.println("How much money did you spend at the club on Minggu"); 
        moneySpent = input.nextInt();
        
        total = total + moneySpent;

        average = (double) total/totalDay;

        System.out.println("The Calculation Results:");

        System.out.println("Hi Ikhsan");
        System.out.println("Your total expenditure at the club this week is " + total);
        System.out.println("With an Average daily expenditure of Rp " + average);
    }
}