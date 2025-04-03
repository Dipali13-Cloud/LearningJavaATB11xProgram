package ex_19_OOps_Inheritance.single_inheritance;

public class TestCase2 extends CommonToAll{
    void runningTC2(){
        startBrowser();
        System.out.println("Running TseCase2");
        readExcelFile();
        readDataBaseFile();
        closeBrowser();

    }
}
