package mvc.enums;

public enum HeartRate {
    /**
    * 心率过快
    */
    TOOFAST("过快"),

    /**
     * 心率过慢
     */
    TOOSLOW("过慢"),

    /**
     * 心率正常
     */
    NORMAL("正常");

    /**
     * HeartRate显示内容
     */
    private String title;

    /**
     * @Description TODO: HeartRate的构造函数
     * @return
     * @param title
     * @Author Tzrea1
     * @Date 2022/12/07 10:28
     * @Version 1.0
     **/
    HeartRate(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
