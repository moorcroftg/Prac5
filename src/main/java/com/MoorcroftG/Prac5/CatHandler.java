package com.MoorcroftG.Prac5;

/**
 *
 */
public class CatHandler extends AnimalHandler {
    public void handleRequest(AnimalE request)
    {
        if (request == AnimalE.Cat)
        {
            System.out.println("Cat is handled by CatHandler");
        }
        else
        {
            System.out.println("CatHandler won't handle " + request);
            if (inheritor != null)
            {
                inheritor.handleRequest(request);
            }
        }
    }
}
