package flyweight;

/**
 * @Description 黑色棋子类
 * @Author MXY
 * @Date 2022/12/7 1:07
 * @Version 1.0
 **/
//黑色棋子类
public class BlackChessman extends AbstractChessman {
    /**
     * @param
     * @Description 构造方法，初始化黑色棋子
     * @return null
     * @Author MXY
     * @Date 2022/12/7 1:08
     **/
    public BlackChessman() {
        super("●");
        System.out.println("--黑色棋子创建实例!!!");
    }
    /**
     * @param x
     * @param y
     * @Description 设置棋子点坐标
     * @return void
     * @Author MXY
     * @Date 2022/12/7 1:08
     **/
    @Override
    public void point(int x, int y) {
        this.x = x;
        this.y = y;
        // 显示棋子内容
        show();
    }
}


