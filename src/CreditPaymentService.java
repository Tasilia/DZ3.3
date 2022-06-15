public class CreditPaymentService {
    public double calculate(int credit, float percent, int year) {
        int month = year * 12; // кол-во месяцев
        float percentForMonth = percent / 12 / 100; // ежемесячная процентная ставка
        double payment = credit * (percentForMonth * Math.pow(1 + percentForMonth, month)
                / (Math.pow(1 + percentForMonth, month) - 1)); // ежемесячный платёж
        return payment;
    }
}
