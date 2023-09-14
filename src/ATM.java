public class ATM {
    int banknote20;
    int banknote50;
    int banknote100;

    public ATM(int banknote20, int banknote50, int banknote100) {
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
    }

    public void addMoney(int banknote20, int banknote50, int banknote100) {
        this.banknote20 += banknote20;
        this.banknote50 += banknote50;
        this.banknote100 += banknote100;
    }

    public boolean withdrawMoney(int amount) {
        int remainingAmount = amount;


        int banknote100ToWithdraw = Math.min(remainingAmount / 100, banknote100);
        remainingAmount -= banknote100ToWithdraw * 100;

        int banknote50ToWithdraw = Math.min(remainingAmount / 50, banknote50);
        remainingAmount -= banknote50ToWithdraw * 50;

        int banknote20ToWithdraw = Math.min(remainingAmount / 20, banknote20);
        remainingAmount -= banknote20ToWithdraw * 20;


        if (remainingAmount != 0) {
            System.out.println("Unable to withdraw the exact amount.");
            return false;
        }


        this.banknote20 -= banknote20ToWithdraw;
        this.banknote50 -= banknote50ToWithdraw;
        this.banknote100 -= banknote100ToWithdraw;


        System.out.println("Withdrawn amount breakdown:");
        System.out.println("100-bills: " + banknote100ToWithdraw);
        System.out.println("50-bills: " + banknote50ToWithdraw);
        System.out.println("20-bills: " + banknote20ToWithdraw);

        return true;
    }
}
