public class Main {
    public static void main(String[] args) {
        BonusMilesService bonusMilesService = new BonusMilesService();
        int price = 10_000;
        int miles = bonusMilesService.calculate(price); // должно получиться 500
        System.out.println("Кол-во бонусных мил = " + miles);

        BmiService service = new BmiService();
        double rost = 1.87;
        int massa = 98;
        double index = service.calculate(rost, massa);
        System.out.println("Индекс массы тела = " + (int) index);
    }
}