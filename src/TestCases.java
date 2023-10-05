import org.testng.annotations.Test;

public class TestCases {

    @Test(priority = 1)
    void setup(){
        System.out.println("inside setup");
    }

    @Test(priority = 2)
    void testSteps(){
        System.out.println("inside testSteps");
    }

    @Test(priority = 3)
    void tearDown(){
        System.out.println("inside tearDown");
    }

}
