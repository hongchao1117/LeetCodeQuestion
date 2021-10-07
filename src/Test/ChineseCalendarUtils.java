package Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 日期日历工具类（获取法定节假日、休息日、周末天数）
 *
 * @author Administrator
 */

public class ChineseCalendarUtils {

    // 法律规定的放假日期
    private List<String> lawHolidays = Arrays.asList(
            "2021-02-11", "2021-02-12", "2021-02-13", "2021-02-14",
            "2021-02-15", "2021-02-16", "2021-02-1",
            "2021-10-01", "2021-10-02", "2021-10-03", "2021-10-04", "2021-10-05",
            "2021-10-06", "2021-10-07");

    /**
     * 判断是否是法定假日
     *
     * @param calendar
     * @return
     * @throws Exception
     */
    public boolean isLawHoliday(String calendar) throws Exception {
        this.isMatchDateFormat(calendar);
        if (lawHolidays.contains(calendar)) {
            return true;
        }
        return false;
    }

    /**
     * 判断是否是周末
     *
     * @param calendar
     * @return
     * @throws ParseException
     */
    public boolean isWeekends(String calendar) throws Exception {
        this.isMatchDateFormat(calendar);
        // 先将字符串类型的日期转换为Calendar类型
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(calendar);
        Calendar ca = Calendar.getInstance();
        ca.setTime(date);
        if (ca.get(Calendar.DAY_OF_WEEK) == 1
                || ca.get(Calendar.DAY_OF_WEEK) == 7) {
            return true;
        }
        return false;
    }

    /**
     * 判断是否是休息日（包含法定节假日和不需要补班的周末）
     *
     * @param calendar
     * @return
     * @throws Exception
     */
    public boolean isHoliday(String calendar) throws Exception {
        this.isMatchDateFormat(calendar);
        // 首先法定节假日必定是休息日
        if (this.isLawHoliday(calendar)) {
            return true;
        }
        // 排除法定节假日外的非周末必定是工作日
        if (!this.isWeekends(calendar)) {
            return false;
        }

        return true;
    }

    /**
     * 使用正则表达式匹配日期格式
     *
     * @throws Exception
     */
    private void isMatchDateFormat(String calendar) throws Exception {
        Pattern pattern = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");
        Matcher matcher = pattern.matcher(calendar);
        boolean flag = matcher.matches();
        if (!flag) {
            throw new Exception("输入日期格式不正确，应该为2017-12-19");
        }
    }
}