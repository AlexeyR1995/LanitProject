import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;

public class CalculatorTest {
    @DataProvider
    public Object[][] testObjectPositive() {
        return new Object[][]{
                {3, 2, "-", 1},
                {24, 56, "+", 80},
                {5, 5, "/", 1},
                {101, 31, "*", 3131}
        };
    }

    @DataProvider
    public Object[][] testObjectNegative() {
        return new Object[][]{
                {11, 5, "+", 2},
                {156, 11, "-", 0},
                {13, 4, "*", 1},
                {10, 2, "/", 11}
        };
    }

    @DataProvider
    public Object[][] testObjectsEquals() {
        return new Object[][]{
                {2147483647, 1, "+", -2147483648},
                {-2147483648, 1, "-", 2147483647},
                {-1, -1, "-", 0}

        };
    }

    @Test(dataProvider = "testObjectPositive")
    public void testEqualsPositive(int one, int two, String sign, int result) {
        Assert.assertEquals(result, Calculator.runCalc(one, two, sign), "Значения не равны");
    }


    @Test(dataProvider = "testObjectNegative")
    public void testEqualsNegative(int one, int two, String sign, int result) {
        Assert.assertNotEquals(result, Calculator.runCalc(one, two, sign), "Значения равны");
    }


    @Test(dataProvider = "testObjectsEquals")
    public void testEqualsResult(int one, int two, String sign, int result) {
        Assert.assertEquals(result, Calculator.runCalc(one, two, sign), "Значения не равны");
    }
}
