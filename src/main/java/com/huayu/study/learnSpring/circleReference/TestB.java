package com.huayu.study.learnSpring.circleReference;

/**
 * Created by zhaohuayu on 17/4/12.
 */
public class TestB {

    TestC testC;
    public void b() {
        testC.c();
    }

    public TestC getTestC() {
        return testC;
    }

    public void setTestC(TestC testC) {
        this.testC = testC;
    }
}
