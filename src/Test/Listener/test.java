package Test.Listener;

public class test {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.setListener(new MyRobotListener());
        robot.working();
        robot.dancing();
    }
}
