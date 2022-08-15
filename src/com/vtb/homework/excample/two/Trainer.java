package com.vtb.homework.excample.two;

public class Trainer implements Barrier {
    int length;

    public Trainer(int length) {
        this.length = length;
    }

    @Override
    public boolean contest(RunAndJump runAndJump) {
        if (runAndJump.run(length)) {
            return true;
        }
        return false;
    }
}
