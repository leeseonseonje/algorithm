package work;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static work.SleepStatus.*;
import static work.WorkStatus.*;

public class WorkTest {

    @Test
    void goToWork() {

        ReadyForGoToWork ready = new Shower();
        Sleep sleep = new Sleep(SLEEP);
        Seon seon = new Seon(PREPARE, sleep, ready);

        WorkStatus workStatus = seon.goToWork();

        assertThat(workStatus).isEqualTo(COMPLETION);
    }
}
