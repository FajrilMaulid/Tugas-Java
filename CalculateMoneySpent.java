import java.util.Scanner;

public class CalculateMoneySpent{
    public static void main(String[] args) {
        String name;
        int moneySpent;
        double average;
        int total;
        int totalDay = 7;

        Scanner input = new Scanner(System.in);

        System.out.println("Hitung Duit Mu Cuy!!!\n");
        
        System.out.println("Nama Mu Siapa?");
        name = input.nextLine();

        System.out.println("Berapa duit yang kau habis kan hari Senin?");
        moneySpent = input.nextInt();

        total = moneySpent;

        System.out.println("Berapa duit yang kau habis kan hari Selasa?");
        moneySpent = input.nextInt();

        total = total + moneySpent;
        
        System.out.println("Berapa duit yang kau habis kan hari Rabu?");
        moneySpent = input.nextInt();

        total = total + moneySpent;
        
        System.out.println("Berapa duit yang kau habis kan hari Kamis?");
        moneySpent = input.nextInt();

        total = total + moneySpent;

        System.out.println("Berapa duit yang kau habis kan hari Jumat?");
        moneySpent = input.nextInt();
    
        total = total + moneySpent;

        System.out.println("Berapa duit yang kau habis kan hari Sabtu?");
        moneySpent = input.nextInt();
    
        total = total + moneySpent;

        System.out.println("Berapa duit yang kau habis kan hari Minggu?");
        moneySpent = input.nextInt();
    
        total = total + moneySpent;

        average = (double) total/totalDay;

        System.out.println("Hasil Perhitungan");

        System.out.println("Hi Merlin.");
        System.out.println("Ini total pengeluaran mu minggu ini " + total);
        System.out.println("Rata rata pengeluaran mu per hari " + average);
    }
}