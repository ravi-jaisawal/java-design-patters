package creational.factory.payment;

public class PaymentProcessorFactory {

    private final CreditCardPaymentProcessor creditCardPaymentProcessor;
    private final PaypalPaymentProcessor paypalPaymentProcessor;


    public PaymentProcessorFactory(CreditCardPaymentProcessor creditCardPaymentProcessor,
                                   PaypalPaymentProcessor paypalPaymentProcessor) {
        this.creditCardPaymentProcessor = creditCardPaymentProcessor;
        this.paypalPaymentProcessor = paypalPaymentProcessor;
    }

    public PaymentProcessorInterface createPaymentProcessor(String paymentMethod) {

        if (paymentMethod.equals("CREDIT_CARD")) {
            this.creditCardPaymentProcessor.processPayment();
        } else if (paymentMethod.equals("PAYPAL")) {
            this.paypalPaymentProcessor.processPayment();
        }
        throw new IllegalArgumentException("Invalid payment type" + paymentMethod);

    }
}
