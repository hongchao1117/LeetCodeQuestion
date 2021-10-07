package Test;

public class Test {
    public static void main(String[] args) {
//        long timestamp = System.currentTimeMillis();
//        Calendar calendar = Calendar.getInstance();
//        int year = calendar.get(Calendar.YEAR);
//        int month = calendar.get(Calendar.MONTH);
//        int day = calendar.get(Calendar.DATE);
//        Date date = new Date(year,month,day);
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();

//        System.out.println(simpleDateFormat.format(date));
//        String date = TimeStamp2Date(timestamp);
//        Date nowTime = getDateByString(date);
//        Date endTime = getDateByString("15:00:00");
//        System.out.println(nowTime.before(endTime));

//        Date date = new Date(); //取时间
//        Calendar calendar = new GregorianCalendar();
//        calendar.setTime(date);
//        calendar.add(calendar.DATE, 1); //把日期往后增加一天,整数  往后推,负数往前移动
//        date = calendar.getTime(); //这个时间就是日期往后推一天的结果
//        System.out.println(date);

    }

    private static String ReverseString(String s) {
        if (s == null || s.length()<=1)
            return s;
        else
            return ReverseString(s.substring(1)) + s.charAt(0);
    }

}
