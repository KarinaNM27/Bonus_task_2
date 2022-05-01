public class Main {
    public static void main(String[] args) {
        int initialAccount = 100;
        int replenishmentAmount = 1100;


        int bonus = replenishmentAmount / 100;
        int balance;
        if (replenishmentAmount <= 1000) {
            bonus = 0;
            balance = initialAccount + replenishmentAmount;
        } else {
            balance = initialAccount + replenishmentAmount + bonus;
        }

        System.out.println("Итоговый счёт: " + balance);
        System.out.println("Количество бонусных рублей: " + bonus);
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}

