package refacotring.tdd;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TddTest {

    @Test
    public void test_cal(){

        Calculator calculator = new Calculator();
        assertEquals(10, calculator.cal(Arrays.asList(5,2), "*"));

    }

    @Test
    void test_cal_minus(){
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.cal_minus(4,2));
        assertEquals(4, calculator.cal_minus(5,1));
    }

    @Test
    void test_getCount(){
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.getCount("ABABAB", "AB"));
        assertEquals(4, calculator.getCount("BBBB", "B"));


    }



}