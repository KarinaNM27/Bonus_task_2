public class Main {
    public static void main(String[] args) {
        int account = 100;
        int replenishment = 1100;


        int bonus = replenishment / 100;
        int balance;
        if (replenishment <= 1000) {
            bonus = 0;
            balance = account + replenishment;
        } else {
            balance = account + replenishment + bonus;
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

