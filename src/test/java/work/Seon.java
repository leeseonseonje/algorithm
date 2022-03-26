package work;

public class Seon {

    private WorkStatus status = WorkStatus.PREPARE;
    private Sleep sleep;
    private ReadyForGoToWork ready;

    public Seon(Sleep sleep, ReadyForGoToWork ready) {
        this.sleep = sleep;
        this.ready = ready;
    }

    public WorkStatus goToWork() {
        if (isReadyCompletion()) {
            return status;
        }
        sleep.wakeUp();
        WorkStatus status = ready.action();
        System.out.println("출근");
        return readyComplete(status);
    }

    private boolean isReadyCompletion() {
        return status == WorkStatus.COMPLETION;
    }

    private WorkStatus readyComplete(WorkStatus status) {
        this.status = status;
        return status;
    }
}
