package demos;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCalculator {
    private Calculator calculator;


    @BeforeClass
    public void setup(){
        calculator= new Calculator();
    }
    @Test
    @Parameters({"num1","num2"})
    public void testAdd(int num1 , int num2){
        Assert.assertEquals(num1,num2);
        }
    

}
