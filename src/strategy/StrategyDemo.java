package strategy;

public class StrategyDemo {
    public static void startStrategyDemo(){
        System.out.println("---------------- [Pattern] Strategy ----------------");
//        创建动物并进行进食、训练以及表演
        Rabbit rabbit = new Rabbit("兔斯基", "跑步");
        System.out.println("                                        [ Rabbit : eat() : 兔类进食策略 ]");
        rabbit.eat();
        Bird bird = new Bird("愤怒的小鸟", "竞速飞行");
        System.out.println("                                        [ Bird : eat() : 鸟类进食策略 ]");
        bird.eat();
        Fish fish = new Fish("小丑鱼", "花样游泳");
        System.out.println("                                        [ Fish : eat() : 鱼类进食策略 ]");
        fish.eat();
        System.out.println("                                        [ Rabbit : train() : 兔类训练策略 ]");
        rabbit.train();
        System.out.println("                                        [ Bird : train() : 鸟类训练策略 ]");
        bird.train();
        System.out.println("                                        [ Fish : train() : 鱼类训练策略 ]");
        fish.train();
        System.out.println("                                        [ Bird : perform() : 鸟类入场表演策略 ]");
        bird.perform();
        System.out.println("                                        [ Fish : train() : 鱼类入场表演策略 ]");
        fish.perform();
        System.out.println("                                        [ rabbit : perform() : 兔类入场表演策略 ]");
        rabbit.perform();
        System.out.println("------------------------ END ------------------------");
        System.out.println("");
    }
}
