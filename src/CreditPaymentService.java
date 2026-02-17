public class CreditPaymentService {
    public double calculate(double loanAmount, double loanTerm) { // сумма кредита, количество месяцев
        double h = 9.99; // годовая процентная ставка
        double p = h / 12 / 100; // месячная процентная ставка
        double monthlyPayment = loanAmount * (p * Math.pow((1 + p), loanTerm)) / (Math.pow((1 + p), loanTerm) - 1);
        return (int) monthlyPayment;
    }
}
