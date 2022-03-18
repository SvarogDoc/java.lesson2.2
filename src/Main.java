public class Main {
    public static void main(String[] args) {

        // входные данные
        int bonusLevel; // единица начисления бонусов (1 рубль за каждые начисленные 100 руб)
        int account = 200;  // сумма на счёте
        int payment = 1400; // пополнение счёта
        boolean inActive = true;

        // логика программы
        int percent = (payment > 1000) ? 1 : 0;
        int bonus = payment / 100 * percent;

        int balance = account + payment + bonus;
        System.out.println("Здравствуйте, спасибо за ваш платеж. Ваш баланс: " + balance + " руб. Ваш бонус: " + bonus + " руб.");
    }
}