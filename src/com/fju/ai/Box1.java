package com.fju.ai;

public class Box1 extends Box{
    public Box1(){
        super(10,10,10);
    }

    @Override
    public boolean isFit(int length, int width, int height) {
        return super.isFit(10, 10, 10);
    }
}
