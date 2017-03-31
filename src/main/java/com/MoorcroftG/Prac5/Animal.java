package com.MoorcroftG.Prac5;

/*
 */
public abstract class Animal implements Cloneable {
    private String iD;
    protected String name;

    abstract void sleep();

    public String getId()
    {
        return iD;
    }

    public String getName()
    {
        return name;
    }

    public void setId (String id)
    {
        iD = id;
    }

    public Object cloneMethod()
    {
        Object cloneMethod = null;

        try
        {
            cloneMethod = super.clone();
        } catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }

        return cloneMethod;
    }
}
