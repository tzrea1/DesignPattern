package mvc.enums;

public enum Sleep {
    /**
     * 睡眠过多
     */
    TOOMUCH("过多"),
    /**
     * 睡眠缺少
     */
    LACK("缺少"),
    /**
     * 睡眠健康
     */
    HEALTHY("健康");

    /**
     * Sleep显示信息
     */
    private final String title;

    /**
     * @Description TODO: Sleep的构造函数
     * @return
     * @param title
     * @Author Tzrea1
     * @Date 2022/12/07 10:30
     * @Version 1.0
     **/
    Sleep(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
