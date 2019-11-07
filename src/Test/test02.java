package Test;

import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class test02 {
    public static void main(String[] args) {
        //如何取得年月日、小时分秒
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime.getYear());

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR));

        //如何取得1970到现在的毫秒数
        long time = Calendar.getInstance().getTimeInMillis();
        System.out.println(time);
        System.out.println(Clock.systemDefaultZone().millis());
        //如何取得某月的最后一天
        System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));

        //如何格式化日期
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime date = LocalDateTime.now();
        System.out.println(dateTimeFormatter.format(date));

        //当前时间
        LocalDateTime today = LocalDateTime.now();
        LocalDateTime yesterday = today.minusDays(1);
        System.out.println(yesterday);
    }
}
