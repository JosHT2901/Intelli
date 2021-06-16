package payments;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {
    PaymentGateway paymentGateway;
    PaymentProcessor paymentProcessor;
    @Before
    public void Setup()
    {
       paymentGateway= Mockito.mock(PaymentGateway.class);
       paymentProcessor=new PaymentProcessor(paymentGateway);
    }

    @Test
    public void payment_is_correct()
    {
                Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                        .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.Ok));
        assertTrue(paymentProcessor.makePayment(1000));
    }

    @Test
    public void payment_is_wrong() {
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));
        PaymentProcessor paymentProcessor=new PaymentProcessor(paymentGateway);

        assertFalse(paymentProcessor.makePayment(1000));
    }
}