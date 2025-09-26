import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("----------------------------------------------------------------");
        System.out.println("|Note! Do not use any symbols when inputting data! (no $ or %) |");
        System.out.println("----------------------------------------------------------------");
        System.out.print("Enter your Bill($): ");
        double billSmall = scan.nextDouble();
        System.out.print("Tip Percent: ");
        int percent = scan.nextInt();
        System.out.print("Number of People: ");
        int people = scan.nextInt();
        System.out.println();
        int bill = (int) (billSmall * 100);
        int tipInt = bill * percent;
        double tip = (double) tipInt / 10000;
        if ((tip % .01 != 0) & ((tip % .01) >= .005))
            tip = (int) ((tip * 100) + 1) / 100.0;
        else if (tip % .01 != 0)
            tip = (int) (tip * 100) / 100.0;
        double totalBill = (int) ((billSmall + tip) * 100) / 100.0;
        double tipPerPerson = (int) ((tip * 100) / people) / 100.0;
        double billPerPerson = (int) ((totalBill * 100) / people) / 100.0;
        System.out.println("----------------------------");
        if (((tip * 100) % 10) == 0)
            System.out.println("|Total Tip Amount: $" + tip + "0    |");
        else
            System.out.println("|Total Tip Amount: $" + tip + "    |");
        System.out.println("----------------------------");
        if (((totalBill * 100) % 10) == 0)
            System.out.println("|Total bill cost: $" + totalBill + "0    |");
        else
            System.out.println("|Total bill cost: $" + totalBill + "    |");
        System.out.println("----------------------------");
        if (((tipPerPerson * 100) % 10) == 0)
            System.out.println("|Tip per person: $" + tipPerPerson + "0      |");
        else
            System.out.println("|Tip per person: $" + tipPerPerson + "      |");
        System.out.println("----------------------------");
        if (((billPerPerson * 100) % 10) == 0)
            System.out.println("|Total bill per person: $" + billPerPerson + "0  |");
        else
            System.out.println("|Total bill per person: $" + billPerPerson + "  |");
        System.out.println("----------------------------");

        scan.close();
    }
}