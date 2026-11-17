public class MainTwo {
    public static void main(String[] args) {
        int initBalance = 100;
        int addAmount = 300;
        int bonus = 0;

        if (addAmount > 1000) {
            bonus = addAmount / 100;
        }

        int finalBalance = initBalance + addAmount + bonus;
        System.out.println("итог баланс " + finalBalance);
        System.out.println("Начисленно бонусов = " + bonus);

    }
}
