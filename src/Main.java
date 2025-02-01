public class Main {
    public static void main(String[] args) {

        int amount = 100;
        int replenishment = 1100;

        int balance = amount + replenishment;

        if (replenishment > 1000) {
            int bonus = replenishment / 100;
            System.out.println("Total bonus:" + bonus + " RUB");
            System.out.println("Balance:" + (balance + bonus) + "RUB");
        } else {
            System.out.println("Total bonus:none");
            System.out.println("Balance:" + balance + "RUB");
        }
    }
}
