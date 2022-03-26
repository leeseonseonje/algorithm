package work;

public class Seon {

    private WorkStatus status;
    private Sleep sleep;
    private ReadyForGoToWork ready;

    public Seon(WorkStatus status, Sleep sleep, ReadyForGoToWork ready) {
        this.status = status;
        this.sleep = sleep;
        this.ready = ready;
    }

    public WorkStatus goToWork() {
        if (isReadyCompletion()) {
            return status;
        }
        sleep.wakeUp();
        return readyComplete();
    }

    private boolean isReadyCompletion() {
        return status == WorkStatus.COMPLETION;
    }

    private WorkStatus readyComplete() {
        this.status = ready.action();
        System.out.println("출근");
        return this.status;
    }
}
