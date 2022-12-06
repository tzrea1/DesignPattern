package templatemethod;

/**
 * @Description 抽象类，定义抽象的原语操作，实现一个模板方法，定义算法（炒菜过程）的骨架
 * @Author Ice Cream
 * @Date 2022/12/7 2:09
 */
public abstract class FryVegetable {
    /**
     * 模板方法定义（即固定的炒菜步骤）
     */
    public final void fryProcess() {
        pourOil();
        heatOil();
        addVegetable();
        addSeasoning();
        fry();
    }

    /**
     * 第一步：倒入油是一样的，所以直接实现
     */
    public void pourOil() {
        System.out.println("[ 倒入食用油... ]");
    }

    /**
     * 第二步：热油是一样的，所以直接实现
     */
    public void heatOil() {
        System.out.println("[ 加热食用油... ]");
    }

    /**
     * 第三步：放入蔬菜是不一样的（一个下番茄，一个是下土豆），交给具体子类实现
     */
    public abstract void addVegetable();

    /**
     * 第四步：添加的调味料是不一样的，交给具体子类实现
     */
    public abstract void addSeasoning();

    /**
     * 第五步：翻炒是一样的，所以直接实现
     */
    public void fry(){
        System.out.println("[ 专心翻炒中... ]");
        System.out.println("[ 完美的炒菜! ]");
    }
}
