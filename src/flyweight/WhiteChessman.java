package flyweight;

/**
 * @Description 白色棋子类
 * @Author MXY
 * @Date 2022/12/7 1:08
 * @Version 1.0
 **/
//白色棋子
public class WhiteChessman extends AbstractChessman {
    /**
     * @param
     * @Description 构造方法，初始化白色棋子
     * @return null
     * @Author MXY
     * @Date 2022/12/7 1:09
     **/
    public WhiteChessman() {
        super("○");
        System.out.println("--白色棋子创建实例!!!");
    }
    /**
     * @param x
     * @param y
     * @Description 设置棋子点坐标
     * @return void
     * @Author MXY
     * @Date 2022/12/7 1:09
     **/
    @Override
    public void point(int x, int y) {
        this.x = x;
        this.y = y;
        // 显示棋子内容
        show();
    }
}


