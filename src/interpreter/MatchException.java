package interpreter;


public class MatchException extends Exception{
    //异常处理
    public MatchException(String msg){
        System.out.println("Match Error Occur:"+msg);
    }
}
