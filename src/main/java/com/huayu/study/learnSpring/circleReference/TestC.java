package com.huayu.study.learnSpring.circleReference;

/**
 * Created by zhaohuayu on 17/4/12.
 */
public class TestC {

    TestA testA;
    public void c(){
        testA.a();
    }

    public TestA getTestA() {
        return testA;
    }

    public void setTestA(TestA testA) {
        this.testA = testA;
    }
}
