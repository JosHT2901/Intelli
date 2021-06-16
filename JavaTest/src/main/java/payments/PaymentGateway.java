package payments;

public interface PaymentGateway
{
   PaymentResponse requestPayment(PaymentsRequest request);
}
