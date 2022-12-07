package interpreter;

public class InterpreterDemo {
    public static void startInterpreterDome(){
        System.out.println("---------------- [Pattern] Interpreter ----------------");
        System.out.println("欢迎光临动物竞赛园餐厅！");
        System.out.println("您点单的内容如下：");
        System.out.println("2份炒米饭，1份鲜草食，3份虫宴");
        String exp = "2 * "+ Const.FOOD_FRIEDRISE+" + 1 * "+Const.FOOD_GRASS+" + 3 * "+Const.FOOD_WORM;
        System.out.println("您应当付款：");
        try {
            System.out.println("                                        [ MatchExpression : match() : 接受表达式并进行语法树分析 ]");
            System.out.println("                                        [ MultipleExpression : interpret() : 完成左右元素的乘法操作 ]");
            System.out.println("                                        [ AddExpression : interpret() : 完成左右元素的加法操作 ]");

            System.out.println(MatchExpression.match(exp).interpret());
        } catch (MatchException e) {
            e.printStackTrace();
        }
        System.out.println("------------------------ END ------------------------");
        System.out.println("");

    }

}
