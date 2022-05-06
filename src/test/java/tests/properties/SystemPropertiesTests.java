package tests.properties;

import org.junit.jupiter.api.Test;

public class SystemPropertiesTests {
    @Test
    void someTest2(){
        String browser = System.getProperty("browser");
        System.out.println(browser); //null

    }
    @Test
    void someTest3(){
        String browser = System.getProperty("browser", "opera");
        System.out.println(browser); //opera

}
    @Test
    void someTest4(){
        System.setProperty("browser", "safari");
        String browser = System.getProperty("browser", "opera");
        System.out.println(browser); //safari


    }
    @Test
    void someTest5(){

        String browser = System.getProperty("browser", "chrome");
        String version = System.getProperty("version","100");
      String browserSize = System.getProperty("version","1920x1080");


//


        System.out.println(browser);
        System.out.println(version);
        System.out.println(browserSize);



    }


}















