package flyweight;

/**
 * @Description 抽象棋子类
 * @Author MXY
 * @Date 2022/12/7 1:03
 * @Version 1.0
 **/
public abstract class AbstractChessman {
    /**
     * 棋子x坐标
     */
    protected int x;
    /**
     * 棋子y坐标
     */
    protected int y;
    /**
     * 棋子类别(黑/白)
     */
    protected String chess;
    /**
     * @param chess
     * @Description 棋子类构造函数，对颜色赋值
     * @return null
     * @Author MXY
     * @Date 2022/12/7 1:04
     **/
    public AbstractChessman(String chess) {
        this.chess = chess;
    }
    /**
     * @param x
     * @param y
     * @Description 设置棋子点坐标
     * @return void
     * @Author MXY
     * @Date 2022/12/7 1:05
     **/
    public abstract void point(int x, int y);
    /**
     * @param
     * @Description 显示棋子坐标
     * @return void
     * @Author MXY
     * @Date 2022/12/7 1:05
     **/
    public void show() {
        System.out.println(this.chess + "(" + this.x + "," + this.y + ")");
    }
}


