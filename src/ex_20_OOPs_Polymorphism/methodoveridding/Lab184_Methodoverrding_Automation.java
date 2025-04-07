package ex_20_OOPs_Polymorphism.methodoveridding;

public class Lab184_Methodoverrding_Automation {
    public static void main(String[] args) {
        Chrome c = new Chrome();
        c.openBrowser();

        Firefox f = new Firefox();
        f.openBrowser();

        CommonToAll all = new CommonToAll();
        all.openBrowser();

        CommonToAll ch = new Chrome();
        ch.openBrowser();

        CommonToAll ff = new Firefox();
        ff.openBrowser();


    }
}
class CommonToAll{
    void openBrowser(){
        System.out.println("Open the IE browser!");
    }
}
class Chrome extends CommonToAll{
    void openBrowser(){
        System.out.println("Open the Chrome browser!");
    }
}
class Firefox extends CommonToAll{
    void openBrowser(){
        System.out.println("Open the Firebox browser!");
    }
}
