package com.lambton;

public interface IDisplay {
    int CODE = 100;
    void display();
    default void print(){}
}
