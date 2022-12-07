package visitor;

/**
 * @Description 具体访问者（快递员），在此中为每个具体要访问的目标的访问操作进行实现
 * @Author Ice Cream
 * @Date 2022/12/7 9:29
 */
public class Courier implements Person{
    /**
     * 快递员访问京东取件区
     * @param jdLocker 京东取件区实例
     */
    public void visit(JDLocker jdLocker){
        System.out.println("[ 快递员访问京东取件区 ]");
    }
    /**
     * 快递员访问顺丰取件区
     * @param sfLocker 顺丰取件区实例
     */
    public void visit(SFLocker sfLocker){
        System.out.println("[ 快递员访问顺丰取件区 ]");
    }
}
