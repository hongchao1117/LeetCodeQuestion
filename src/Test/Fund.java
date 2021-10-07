package Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 评测题目二: 用程序实现实际中的基金申购日与确认日之间的日期间隔计算，要考虑节假日包含春节、国庆。
 * // 例如：
 * // 1、周四15:00前购买基金，那么T日为周四，T+1日为周五，从购买到确认中间间隔1天；
 * // 2、周四15:00后购买基金，那么T日为周五，T+1日为下周一，从购买到确认中间间隔4天；
 * // 3、周五15:00前购买基金，那么T日为周五，T+1日为下周一，从购买到确认中间间隔3天；
 * // 4、周五15:00后购买基金，那么T日为下周一，T+1日为下周二，从购买到确认中间间隔4天。
 * /**
 * * map:为预制的时间集合，key：时间戳；value:true，工作日，false，休息日
 **/
public class Fund {
    public List<Integer> getTime(Map<Long, Boolean> map) {
        List<Integer> list = new ArrayList<>();
        if (map == null || map.size() == 0) return list;
        Date nowTime;
        Date endTime = getDateByString("15:00:00");
        ChineseCalendarUtils utils = new ChineseCalendarUtils();
        Set<Long> timestamps = map.keySet();
        for (long timestamp : timestamps) {
            //工作日
            int count = 1;
            String s = timeStamp2Str(timestamp);
            nowTime = getDateByString(s);
            if (map.get(timestamp)) {
                //是否超过了三点
                if (nowTime.before(endTime)) {
                    //确认下一天是否是工作日
                    Date date = getDate(nowTime, 1);
                    count = getCount(utils, count, date);
                    list.add(count);
                } else {
                    count++;
                    Date date = getDate(nowTime, 2);
                    getCount(utils, count, date);
                    list.add(count);
                }
            } else {
                count++;
                Date date = getDate(nowTime, 2);
                getCount(utils, count, date);
                list.add(count);
            }
        }
        return list;
    }

    private int getCount(ChineseCalendarUtils utils, int count, Date date) {
        try {
            while (utils.isHoliday(date2String(date)) || utils.isLawHoliday(date2String(date))
                    || utils.isWeekends(date2String(date))) {
                date = getDate(date, 1);
                count++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    public static String timeStamp2Str(long timestamp) {
        String date = new SimpleDateFormat("HH:mm:ss").format(new Date(timestamp));
        return date;
    }

    public static String date2String(Date date) {
        String time = new SimpleDateFormat("HH:mm:ss").format(date);
        return time;
    }

    public static Date getDateByString(String time) {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        Date newTime = null;
        try {
            newTime = format.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return newTime;
    }

    public Date getDate(Date time, int day) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(time);
        calendar.add(calendar.DATE, day); //把日期往后增加一天,整数  往后推,负数往前移动
        time = calendar.getTime(); //这个时间就是日期往后推一天的结果
        return time;
    }
}


