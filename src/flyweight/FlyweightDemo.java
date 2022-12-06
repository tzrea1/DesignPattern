package flyweight;
import java.util.Random;

/**
 * @Description flyweight测试demo类
 * @Author MXY
 * @Date 2022/12/7 1:17
 * @Version 1.0
 **/
public class FlyweightDemo {
    public static void startFlyweightDemo(){
        System.out.println("---------------- [Pattern] Flyweight ----------------");
        System.out.println("利用五子棋颜色和位置的特性来演示Flyweight的设计模式");
        // 创建五子棋工厂
        ChessmanFactory fiveChessmanFactory = ChessmanFactory.getInstance();
        Random random = new Random();
        int radom = 0;
        AbstractChessman abstractChessman = null;
        // 随机获得棋子
        for (int i = 0; i < 10; i++) {
            radom = random.nextInt(2);
            switch (radom) {
                // 获得黑棋
                case 0:
                    abstractChessman = fiveChessmanFactory.getChessmanObject('B');
                    break;
                // 获得白棋
                case 1:
                    abstractChessman = fiveChessmanFactory.getChessmanObject('W');
                    break;
            }
            if (abstractChessman != null) {
                abstractChessman.point(i, random.nextInt(15));
            }
        }
        System.out.println("------------------------ END ------------------------");
        System.out.println("");
    }
}
