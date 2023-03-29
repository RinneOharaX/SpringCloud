import java.time.ZonedDateTime;

/**
 * @PROJECT_NAME: SpringCloud
 * @DESCRIPTION:
 * @USER: Administrator
 * @DATE: 2023/3/20 21:27
 */
public class Time {
    public static void main(String[] args) {
        //获取当前时间进行断言测试
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);
    }
}
