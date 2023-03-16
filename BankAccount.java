import java.util.Random;

public class BankAccount {
    // DEFINING VARIABLE TYPES
    private long accNum;
    private double checking;
    private double savings;
    private static int numAccountsCreated = 0;
    private static double totalBal = 0;

    // CONSTRUCTOR METHOD
    public void account(String accNum, Double checking, Double savings) {
        this.accNum = genAccNum();
        this.checking = checking;
        this.savings = savings;
        numAccountsCreated++;
    }

    // GETTER METHOD FOR CHECKING
    public double getCheckingBal() {
        return checking;
    }

    // GETTER METHOD FOR SAVINGS
    public double getSavingsBal() {
        return savings;
    }

    // DEPOSITING MONEY INTO EITHER ACC
    public void deposit(double amnt, String accType) {
        if (accType.equals("checking")) {
            checking += amnt;
        }
        else if (accType.equals("savings")) {
            savings += amnt;
        } 
    }

    // WITHDRAWING MONEY FROM EITHER ACC
    public void withdraw(double amnt, String accType) {
        if (accType.equals("checking")) {
            if (checking < amnt) {
                throw new IllegalArgumentException("Insufficient checking account balance");
            }
            checking -= amnt;
        } else if (accType.equals("savings")) {
            if (savings < amnt) {
                throw new IllegalArgumentException("Insufficient savings account balance");
            }
            savings -= amnt;
        }
    }

    // DISPLAY TOTAL ACC BAL
    public void totalBal() {
        System.out.println(String.format("Checking: %.2f\nSavings: %.2f", this.checking, this.savings));
    }

    // GENERATE RANDOM ACC NUMBER
    public static int genAccNum() {
        Random rand = new Random();
        int accNum = rand.nextInt(2000000000) + 999999999;
        accNum = Math.abs(accNum);
        return accNum;
    }
}