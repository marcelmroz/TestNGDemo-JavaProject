import org.testng.annotations.Test;

public class TestCases {

    @Test
    void setup(){
        System.out.println("inside setup");
    }

    @Test
    void testSteps(){
        System.out.println("inside testSteps");
    }

    @Test
    void tearDown(){
        System.out.println("inside tearDown");
    }

}
