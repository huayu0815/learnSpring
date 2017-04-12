package com.huayu.study.learnSpring.circleReference;

/**
 * Created by zhaohuayu on 17/4/12.
 */
public class TestA {

    TestB testB;

    public void a() {
        testB.b();
    }

    public TestB getTestB() {
        return testB;
    }

    public void setTestB(TestB testB) {
        this.testB = testB;
    }
}
