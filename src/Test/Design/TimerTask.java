package Test.Design;

public class TimerTask {

    private int taskId;

    //时间类型可以化为long,比如8小时对应 8 * 60 * 60 * 1000
    private long expiration;

    public TimerTask(int taskId) {
        this.taskId = taskId;
    }

    public TimerTask(long expiration) {
        this.expiration = expiration;
    }

    public TimerTask(int taskId, long expiration) {
        this.taskId = taskId;
        this.expiration = expiration;
    }

    public TimerTask() {
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public long getExpiration() {
        return expiration;
    }

    public void setExpiration(long expiration) {
        this.expiration = expiration;
    }
}
