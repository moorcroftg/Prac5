package com.MoorcroftG.Prac5;

/**
 * Created by enusa on 2017/03/31.
 */
public class Concat {
    private String string1;
    private String string2;
    private String result;

    public Concat () {};
    public Concat (String s1, String s2)
    {
        string1 = s1;
        string2 = s2;
    }

    public String concatMethod()
    {
        result = string1 + string2;
        return result;
    }
}
