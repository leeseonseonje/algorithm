package work;


public class Sleep {

    private SleepStatus status;

    public Sleep(SleepStatus status) {
        this.status = status;
    }

    public void wakeUp() {
        if (alreadyWake()) {
            return;
        }
        wake();
        System.out.println("기상");
    }

    private void wake() {
        this.status = SleepStatus.WAKE;
    }

    private boolean alreadyWake() {
        return status == SleepStatus.WAKE;
    }
}
