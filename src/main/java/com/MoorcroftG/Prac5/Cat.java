package com.MoorcroftG.Prac5;

/**
 * Created by enusa on 2017/04/02.
 */
public class Cat implements Animals{

    public String makeNoise() {
        String sound;
        sound = "Meow. I'm hungry";
        sound += "\nPlease feed me";
        return sound;
    }
}
