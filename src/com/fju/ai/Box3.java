package com.fju.ai;

public class Box3 extends Box{
    public Box3(int length, int width, int height){
        super(length, width, height);
    }
    public Box3(){
        this(0,0,0);
    }
    @Override
    public boolean isFit(int length, int width, int height) {
        return super.isFit(30, 30, 30);
    }
}
