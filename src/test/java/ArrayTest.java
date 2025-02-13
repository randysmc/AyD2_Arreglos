import org.example.ConvertidorArray;
import org.junit.Test;

import static org.junit.Assert.*;


public class ArrayTest {

    @Test
    public void Array() {
        Object[] input= {1,2,3,4};
        Object[] expected = {1,2,3,4};
        assertArrayEquals(expected, ConvertidorArray.arreglo(input));

    }

    @Test
    public void ArrayUnObjetoAnidado() {
        Object[] input= {1,2, new Object[]{"3","4"}};
        Object[] expected = {1,2, "3", "4"};
        assertArrayEquals(expected, ConvertidorArray.arreglo(input));

    }

    @Test
    public void


}
