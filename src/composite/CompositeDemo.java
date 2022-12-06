package composite;

/**
 * @Description Composite测试类
 * @Author MXY
 * @Date 2022/12/6 21:14
 **/
public class CompositeDemo {
    /**
     * @param
     * @Description Composite测试，在main函数中调用进行文件创建测试
     * @return void
     * @Author
     * @Date 2022/12/6 21:48
     **/
    public static void startCompositeDemo(){
        System.out.println("---------------- [Pattern] Composite ----------------");
        System.out.println("利用文件目录条目来演示composite的设计模式");
        System.out.println("Making system entries...");
        Directory rootdir = new Directory("root");
        Directory bindir = new Directory("bin");
        Directory tmpdir = new Directory("tmp");
        Directory usrdir = new Directory("usr");
        rootdir.add(bindir);
        rootdir.add(tmpdir);
        rootdir.add(usrdir);
        bindir.add(new File("vi", 10000));
        bindir.add(new File("latex", 20000));
        rootdir.printList();

        System.out.println("");
        System.out.println("Making user entries...");
        Directory hw1 = new Directory("hw1");
        Directory hw2 = new Directory("hw2");
        Directory hw3 = new Directory("hw3");
        usrdir.add(hw1);
        usrdir.add(hw2);
        usrdir.add(hw3);
        hw1.add(new File("browse.html", 100));
        hw2.add(new File("test.tex", 300));
        hw3.add(new File("article.doc", 400));
        rootdir.printList();
        System.out.println("------------------------ END ------------------------");
        System.out.println("");
    }

}
