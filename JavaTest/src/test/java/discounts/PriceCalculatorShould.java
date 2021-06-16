package discounts;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.*;

public class PriceCalculatorShould {
    @Test
    public void total_zero() {
        PriceCalculator calculator=new PriceCalculator();
        assertThat(calculator.getTotal(), CoreMatchers.is(0.0));
    }

    @Test
    public void total_sum() {
        PriceCalculator calculator=new PriceCalculator();
        calculator.addPrice(10.2);
        calculator.addPrice(15.5);
        assertThat(calculator.getTotal(), CoreMatchers.is(25.7));
    }

    @Test
    public void apply_discount() {
        PriceCalculator calculator=new PriceCalculator();
        calculator.addPrice(100.0);
        calculator.addPrice(50.0);
        calculator.addPrice(50.0);
        calculator.setDiscount(25.0);
        assertThat(calculator.getTotal(), CoreMatchers.is(150.0));
    }
}