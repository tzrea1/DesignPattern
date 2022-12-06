package templatemethod;

/**
 * @Description 具体类，实现炒土豆的原语操作
 * @Author Ice Cream
 * @Date 2022/12/7 2:11
 */
public class FryPotato extends FryVegetable{
    public void addVegetable() {
        System.out.println("[ 土豆已下锅 ]");
    }

    public void addSeasoning() {
        System.out.println("[ 下锅的调料是辣椒 ]");
    }
}
