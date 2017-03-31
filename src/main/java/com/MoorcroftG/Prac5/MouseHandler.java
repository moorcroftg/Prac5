package com.MoorcroftG.Prac5;

/**
 *
 */
public class MouseHandler extends AnimalHandler {
    public void handleRequest(AnimalE request)
    {
        if (request == AnimalE.Mouse)
        {
            System.out.println("Mouse is handled by CatHandler");
        }
        else
        {
            System.out.println("MouseHandler won't handle " + request);
            if (inheritor != null)
            {
                inheritor.handleRequest(request);
            }
        }
    }
}
