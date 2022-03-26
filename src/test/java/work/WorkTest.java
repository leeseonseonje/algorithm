package work;

import org.junit.jupiter.api.Test;

public class WorkTest {

    @Test
    void goToWork() {
        ReadyForGoToWork ready = new Shower();
        Sleep sleep = new Sleep(SleepStatus.SLEEP);
        Seon seon = new Seon(sleep, ready);
        WorkStatus workStatus = seon.goToWork();
        System.out.println(workStatus);
    }
}
