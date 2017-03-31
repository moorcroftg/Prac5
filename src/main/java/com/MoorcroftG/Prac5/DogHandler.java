package com.MoorcroftG.Prac5;

/**
 *
 */
public class DogHandler extends AnimalHandler {
    public void handleRequest(AnimalE request)
    {
        if (request == AnimalE.Dog)
        {
            System.out.println("Dog is handled by DogHandler");
        }
        else
        {
            System.out.println("DogHandler won't handle " + request);
            if (inheritor != null)
            {
                inheritor.handleRequest(request);
            }
        }
    }
}
