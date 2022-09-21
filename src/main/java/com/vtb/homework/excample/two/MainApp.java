package com.vtb.homework.excample.two;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {

        List<RunAndJump> runAndJumps = new ArrayList<>();
        runAndJumps.add(new Cat("Tom", 500, 1));
        runAndJumps.add(new Human("Bob", 2000, 2));
        runAndJumps.add(new Robot("Wally", 5000, 3));

        List<Barrier> barrierList = new ArrayList<>();
        barrierList.add(new Wall(2));
        barrierList.add(new Trainer(1000));
        barrierList.add(new Wall(3));

        for (RunAndJump runAndJump : runAndJumps) {
            for (Barrier barrier : barrierList) {
                if (!(barrier.contest(runAndJump))) {
                    break;
                }
            }
        }
    }
}

