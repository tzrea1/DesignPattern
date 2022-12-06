package templatemethod;

/**
 * @Description 用于演示TemplateMethod设计模式的类
 * @Author Ice Cream
 * @Date 2022/12/7 2:11
 */
public class TemplateMethodDemo {
    public static void startTemplateMethodDemo() {
        //开始阶段提示
        System.out.println("------------- [Pattern] TemplateMethod -------------");
        /*炒菜过程*/
        //炒土豆
        System.out.println("[ 开始炒土豆 ]");
        FryPotato fryPotato = new FryPotato();
        fryPotato.fryProcess();
        //炒番茄
        System.out.println("[ 开始炒番茄 ]");
        FryTomato fryTomato = new FryTomato();
        fryTomato.fryProcess();
        //结束阶段提示
        System.out.println("----------------------- END ------------------------");
    }
}
