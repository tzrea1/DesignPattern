package templatemethod;

/**
 * @Description 具体类，实现炒番茄的原语操作
 * @Author Ice Cream
 * @Date 2022/12/7 2:11
 */
public class FryTomato extends FryVegetable{
    public void addVegetable() {
        System.out.println("[ 番茄已下锅 ]");
    }

    public void addSeasoning() {
        System.out.println("[ 下锅的调料是甜酱汁 ]");
    }
}

