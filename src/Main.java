public class Main {
    public static void main(String[] args) {
        int InitialAccount = 250;
        int ReplenishmentAmount = 1100;


        int bonus = ReplenishmentAmount / 100;
        int balance;
        if (ReplenishmentAmount <= 1000) {
            bonus = 0;
            balance = InitialAccount + ReplenishmentAmount;
        } else {
            balance = InitialAccount + ReplenishmentAmount + bonus;
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

