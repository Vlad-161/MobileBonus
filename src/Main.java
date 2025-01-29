public class Main {
    public static void main(String[] args) {

        int amount = 100;
        int replenishment1 = 850;
        int replenishment2 = 650;

        int balance = amount + replenishment1 + replenishment2;
        System.out.println("Balance:" + balance + " RUB");

        if (balance > 1000) {
            int bonus = balance / 100;
            System.out.println("Total bonus:" + bonus + " RUB");
        } else {
            System.out.println("Total bonus:none");
        }
    }
}
