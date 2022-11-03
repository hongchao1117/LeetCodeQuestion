package Test;

public class time_coincide {
    public static String time_coincide(int time) {
        String originTime = time + ":";
        if (time > 12 && time < 24) {
            time -= 12;
        }
        double S_H = 360.0 / 60, S_M = 30.0 / 60;
        int t = (int) Math.round(30 * time / (S_H - S_M));
        String newTime = t + "";
        if (t < 10) {
            newTime = "0" + newTime;
        }
        return originTime + newTime;
    }


    public static void main(String[] args) {
        System.out.println(time_coincide(2));
    }

    public static String getStuID(String students_data) {
        StringBuilder res = new StringBuilder();
        String[] strings = students_data.trim().split(" ");
        for (int i = 0; i < strings.length; i++) {
            String temp = strings[i];
            for (int j = strings[i].length() - 1; j >= 0; j--) {
                if (!Character.isDigit(strings[i].charAt(j))) {
                    temp = strings[i].substring(0, j);
                }
            }
            res.append(temp);
            if (i < strings.length - 1) {
                res.append(" ");
            }
        }
        return res.toString();

    }

}
