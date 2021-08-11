public class Main {
    public static void main(String[] args) {
        int account = 100; // начальный счет
        int deposit = 1200; // сумма пополнения
        int bonus; // бонусные рубли
        int totalDeposit; // итоговый счет
        if (deposit > 1000) {
            bonus = deposit / 100;
            totalDeposit = account + deposit + bonus;
        } else {
            bonus = 0;
            totalDeposit = account + deposit;
        }
        System.out.println(bonus);
        System.out.println(totalDeposit);

    }
}