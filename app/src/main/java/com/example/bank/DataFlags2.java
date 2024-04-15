package com.example.bank;

public class DataFlags2 {
    private int dd1ID;
    private int dd2ID;
    private int dd3ID;
    private int dd4ID;

    public DataFlags2(int _dd1ID, int _dd2ID, int _dd3ID, int _dd4ID){
        dd1ID = _dd1ID;
        dd2ID = _dd2ID;
        dd3ID = _dd3ID;
        dd4ID = _dd4ID;
    }

    public int getdd1ID(){
        return dd1ID;
    }
    public int getdd2ID(){
        return dd2ID;
    }
    public int getdd3ID() {
        return dd3ID;
    }
    public int getdd4ID() {
        return dd4ID;
    }

}
