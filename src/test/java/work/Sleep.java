package work;


public class Sleep {

    private SleepStatus status;

    public Sleep(SleepStatus status) {
        this.status = status;
    }

    public void wakeUp() {
        if (isSleepStatus()) {
            setStatus(SleepStatus.WAKE);
        }
        System.out.println("기상");
    }

    private void setStatus(SleepStatus status) {
        this.status = status;
    }

    private boolean isSleepStatus() {
        return status == SleepStatus.SLEEP;
    }

    public SleepStatus getStatus() {
        return status;
    }
}
