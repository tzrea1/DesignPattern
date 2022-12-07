package visitor;

/**
 * @Description 访问者，在此中为每个具体要访问的目标声明一个访问操作
 * @Author Ice Cream
 * @Date 2022/12/7 9:43
 */
public interface Person {
    //访问京东取件区
    void visit(JDLocker jdLocker);
    //访问顺丰取件区
    void visit(SFLocker sfLocker);
}
