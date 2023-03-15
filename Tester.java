public class Tester {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        System.out.println("New Acc No. " + acc.genAccNum());
        acc.deposit(2000000, "savings");
        acc.deposit(10000, "checking");
        acc.totalBal();

        acc.withdraw(500, "checking");
        acc.withdraw(100, "savings");
        acc.totalBal();

        System.out.println("-----------------------------------");

        BankAccount acc2 = new BankAccount();
        System.out.println("New Acc No. " + acc2.genAccNum());
        acc2.deposit(500000, "savings");
        acc2.deposit(10000, "checking");
        acc2.totalBal();
        acc2.withdraw(100, "checking");
        acc2.totalBal();
    }
}