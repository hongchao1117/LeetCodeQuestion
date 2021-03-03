package Test.Listener;

public class MyRobotListener implements Robot.RobotListener {
    @Override
    public void working(Even even) {
        System.out.println("提示：开始工作");
    }

    @Override
    public void dancing(Even even) {
        System.out.println("提示：开始跳舞");
    }
}
