import com.example.demo.ArraySume;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayTest {
    ArraySume ArraySum = new ArraySume();
    @Test
    public void testSumPositiveElements() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(15, ArraySum.sum(arr));
    }

    @Test
    public void testSumSingleElement() {
        int[] arr = {5};
        assertEquals(5, ArraySum.sum(arr));
    }

    @Test
    public void testSumEmptyArray() {
        int[] arr = {9,0};
        assertEquals(0, ArraySum.sum(arr));
    }


    @Test
    public void testSumMixedElements() {
        int[] arr = {-2, 0, 3, -1, 2};
        assertEquals(2, ArraySum.sum(arr));
    }
    @Test
    public void SumNull(){
        Assertions.assertThrows(
                IllegalArgumentException.class, ()-> ArraySum.sum(new int[]{})
        );
    }
}
