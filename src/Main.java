public class Main {
    public static void main(String[] args) {

        int amount = 100;
        int replenishment1 = 850;
        int replenishment2 = 650;

        int balance = amount + replenishment1 + replenishment2;

        if (balance > 1000) {
            int Bonus = balance / 100;
            System.out.println("Total bonus:" + Bonus + " RUB");
        } else {
            System.out.println("Total bonus:none");
        }
    }
}
