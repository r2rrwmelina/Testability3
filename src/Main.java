public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double loanAmount = 1_000_000; // сумма кредита
        double loanTerm;
        loanTerm = 12; // количество месяцев
        double monthlyPayment = service.calculate(loanAmount, loanTerm);
        System.out.println("Ежемесячный платеж равен: " + monthlyPayment);

        System.out.println();
        loanTerm = 24;
        monthlyPayment = service.calculate(loanAmount, loanTerm);
        System.out.println("Ежемесячный платеж равен: " + monthlyPayment);

        System.out.println();
        loanTerm = 36;
        monthlyPayment = service.calculate(loanAmount, loanTerm);
        System.out.println("Ежемесячный платеж равен: " + monthlyPayment);

    }
}