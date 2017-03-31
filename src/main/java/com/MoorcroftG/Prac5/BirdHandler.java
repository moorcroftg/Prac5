package com.MoorcroftG.Prac5;

/**
 *
 */
public class BirdHandler extends AnimalHandler{
    public void handleRequest(AnimalE request)
    {
        if (request == AnimalE.Bird)
        {
            System.out.println("Bird is handled by BirdHandler");
        }
        else
        {
            System.out.println("BirdHandler won't handle " + request);
            if (inheritor != null)
            {
                inheritor.handleRequest(request);
            }
        }
    }
}
