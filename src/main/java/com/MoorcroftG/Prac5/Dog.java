package com.MoorcroftG.Prac5;

/**
 * Created by enusa on 2017/04/02.
 */
public class Dog implements Animals {
    public String makeNoise() {
        String sound;
        sound = "Woof. Please play with me";
        sound += "\nThrow the ball";
        return sound;
    }
}
