package com.vtb.homework.excample.two;

public class Wall implements Barrier {
    int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean contest(RunAndJump runAndJump) {
        if (runAndJump.jump(height)) {
            return true;
        }
        return false;
    }
}
