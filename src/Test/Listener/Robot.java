package Test.Listener;

public class Robot {
    private RobotListener listener;

    public void setListener(RobotListener listener) {
        this.listener = listener;
    }

    public void working(){
        if (listener!=null){
            Even even = new Even(this);
            this.listener.working(even);
        }
        System.out.println("机器人开始工作");
    }

    public void dancing(){
        if (listener!=null){
            Even even = new Even(this);
            this.listener.dancing(even);
        }
        System.out.println("机器人开始工作");
    }



    public interface RobotListener {
         void working(Even even);
         void dancing(Even even);
    }
}
