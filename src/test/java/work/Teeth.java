package work;

public class Teeth implements ReadyForGoToWork {

    @Override
    public WorkStatus action() {
        return WorkStatus.COMPLETION;
    }
}
