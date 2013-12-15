package com.github.memoize;

import com.github.memoize.core.GitMemoizer;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

import java.io.File;
import java.lang.reflect.Method;

public class Tester {

    private static Logger logger = Logger.getLogger(Tester.class);

    public static void main(String[] args) throws Exception {
        BasicConfigurator.configure();
        Logger.getRootLogger().setLevel(Level.DEBUG);

        Calculator calc = new Calculator();
        logger.debug("First result: " + calc.sum(1, 2));
        logger.debug("Second result: " + calc.sum(1, 2));
    }
}