package mvc.enums;

public enum Stress {
    /**
     * 压力过大
     */
    TOOMUCH("过大"),
    /**
     * 压力正常
     */
    NORMAL("正常"),
    /**
     * 放松状态
     */
    RELAX("放松");

    /**
     * Stress显示信息
     */
    private final String title;

    /**
     * @Description TODO: Stress构造函数
     * @return
     * @param title
     * @Author Tzrea1
     * @Date 2022/12/07 10:31
     * @Version 1.0
     **/
    Stress(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
