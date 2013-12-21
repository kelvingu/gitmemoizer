package com.github.memoize;

import com.github.memoize.aspect.Memoizable;

public class Calculator {

    @Memoizable
    public int sum(int a, int b) throws InterruptedException {
        Thread.sleep(500);
        return a + b;
    }

}
