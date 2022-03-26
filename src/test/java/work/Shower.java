package work;

public class Shower implements ReadyForGoToWork {

    @Override
    public WorkStatus action() {
        System.out.println("출근 준비 완료");
        return WorkStatus.COMPLETION;
    }
}
