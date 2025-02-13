import org.example.ConvertidorArray;
import org.junit.Test;

import static org.junit.Assert.*;


public class ArrayTest {

    @Test
    public void ArraySinObjetos() {
        Object[] input= {1,2,3,4};
        Object[] output = {1,2,3,4};
        assertArrayEquals(output, ConvertidorArray.convertidorArray(input));

    }

    @Test
    public void ArrayUnObjeto() {
        Object[] input= {1,2, new Object[]{"3","4"}};
        Object[] output = {1,2, "3", "4"};
        assertArrayEquals(output, ConvertidorArray.convertidorArray(input));

    }

    @Test
    public void ArrayObjetoCadenaYEntero(){
        Object[] input = {1,2, new Object[]{"a", "b", new Object[]{5,6}}};
        Object[] output = {1, 2 , "a", "b", 5, 6};
        assertArrayEquals(output, ConvertidorArray.convertidorArray(input));
    }

    @Test
    public void ArrayDosObjetosEnteros(){
        Object[] input = {1,2, new Object[]{3, 4, new Object[]{5,6}}};
        Object[] output = {1, 2 , 3, 4,  5, 6};
        assertArrayEquals(output, ConvertidorArray.convertidorArray(input));
    }

    @Test
    public void ArrayCuatroObjetos(){
        Object[] input = {1, 2, new Object[]{3,4}, new Object[]{5, 6 , new Object[]{7,8, new Object[]{9,10}}}};
        Object[] output = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertArrayEquals(output, ConvertidorArray.convertidorArray(input));
    }

}
