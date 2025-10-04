package com.features;

import com.features.record.*;
import com.features.switchpattern.Account;
import com.features.switchpattern.InputProcessing;
import com.features.switchpattern.TestSwitchPattern;
import com.features.unnamed.UnnamedVariableAndPattern;
import com.features.virtualThreads.VirtualThreadFeatures;

public class Java21FeaturesTest {
    static void main() {
        InputProcessing.processInputOld("Yes");
        InputProcessing.processInputNew("No");

        System.out.println("--------------------------");
        Vehicle vehicle = new Vehicle("C24", 4);
        TestRecordFeatures.beforeRecordPattern(vehicle);
        TestRecordFeatures.afterRecordPattern(vehicle);

        System.out.println("--------------------------");
        Task task = new Task(Status.PENDING);
        RandomTask randomTask = new RandomTask(task);
        TestRecordFeatures.getRandomTaskStatus(randomTask);

        System.out.println("--------------------------");
        VirtualThreadFeatures.testVirtualThread();


        UnnamedVariableAndPattern unnamedVariableAndPattern = new UnnamedVariableAndPattern();
        unnamedVariableAndPattern.testUnnamedVariable();
        unnamedVariableAndPattern.testUnnamedPattern();

        System.out.println("--------------------------");
        System.out.println(TestSwitchPattern.getBalanceWithoutSwitchPattern(new Account()));
        System.out.println(TestSwitchPattern.getBalanceWithSwitchPattern(new Account()));
    }
}
