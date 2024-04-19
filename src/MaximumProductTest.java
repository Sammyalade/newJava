import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MaximumProductTest {

     @Test
    public void testMaximumProduct() {
        int[] array = {3,-1};
        int[] array2 = {3, 6, 7, 9, 1};
        assertThat(MaximumProduct.getHighestProduct(array), is(-3));
        assertThat(MaximumProduct.getHighestProduct(array2), is(63));
        assertThat(MaximumProduct.getHighestProduct(new int[]{}), is(0));
        assertThat(MaximumProduct.getHighestProduct(new int[]{-1, -3, -5, -10}), is(50));
    }

    @Test
    public void testMaximumProduct2() {
        int[] array = {3,-1};
        int[] array2 = {3, 6, 7, 9, 1};
        assertThat(MaximumProduct.getHighestProduct2(array), is(-3));
        assertThat(MaximumProduct.getHighestProduct2(array2), is(63));
        assertThat(MaximumProduct.getHighestProduct2(new int[]{}), is(0));
        assertThat(MaximumProduct.getHighestProduct2(new int[]{-1, -3, -5, -10}), is(50));
    }
}
