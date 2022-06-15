public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int credit = 1_000_000; // сумма кредита
        float percent = 9.99F; // годовая процентная ставка
        int monthlyPayment1 = (int) service.calculate(credit, percent, 1);
        int monthlyPayment2 = (int) service.calculate(credit, percent, 2);
        int monthlyPayment3 = (int) service.calculate(credit, percent, 3);
        System.out.println("При сумме кредита 1.000.000 руб. и годовой процентной ставке 9.99%" +
                " ежемесячный платёж составит: ");
        System.out.println(monthlyPayment1 + " руб. при сроке кредита на 1 год;");
        System.out.println(monthlyPayment2 + " руб. при сроке кредита на 2 года;");
        System.out.println(monthlyPayment3 + " руб. при сроке кредита на 3 года.");
    }
}
