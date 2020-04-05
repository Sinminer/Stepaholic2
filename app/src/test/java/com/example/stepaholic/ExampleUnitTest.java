package com.example.stepaholic;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    private MainActivity mainActivity = new MainActivity();
    StepTracker stepTracker = new StepTracker();
    @Test
    public void stepCheck() {
        assertEquals(0,stepTracker.getSteps(),0.1);

}
@Test
public void extraStepCheck(){
        stepTracker.setSteps(50);
        assertEquals(50.0,stepTracker.getSteps(),0.1);
        stepTracker.setSteps(0);
}
@Test
    public void userRunningCheck(){
        assertFalse(mainActivity.isUserRunning());;
}
@Test
    public void setUserRunningCheck(){
        mainActivity.setUserRunning(true);
        assertTrue(mainActivity.isUserRunning());
}
}
