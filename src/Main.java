import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Имеющиеся деньги: ");
        int money = in.nextInt();
        System.out.print("Цена за шоколадку: ");
        int price = in.nextInt();
        System.out.print("Количество обёрток для бонусной шоколадки: ");
        int wrap = in.nextInt();

        int chocolates = money / price;
        int wrappers = chocolates;

        while (wrappers >= wrap) {
            chocolates += (wrappers / wrap);
            wrappers = wrappers % wrap + (wrappers / wrap);
        }

        System.out.println("Максимум шоколадок: " + chocolates);
    }
}