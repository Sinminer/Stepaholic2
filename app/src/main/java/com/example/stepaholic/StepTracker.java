package com.example.stepaholic;
//StepTracker class takes all of the variables and does the math and returns it to Main.
class StepTracker {
    private final static float STEPS = 0;
    float steps = STEPS;
    float miles = steps / 2000;
    float kilometres = steps / 1500;

    float getSteps() {
        return steps;
    }

    void setSteps(float steps) {
        this.steps = steps;
    }
}
