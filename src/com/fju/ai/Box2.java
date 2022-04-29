package com.fju.ai;

public class Box2 extends Box{
    public Box2(int length, int width, int height){
        super(length, width, height);
    }
    public Box2(){
        this(0,0,0);
    }

    @Override
    public boolean isFit(int length, int width, int height) {
        return super.isFit(20, 20, 20);
    }
}
