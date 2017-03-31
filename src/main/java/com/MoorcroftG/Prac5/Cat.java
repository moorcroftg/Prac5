package com.MoorcroftG.Prac5;

/**
 *
 */
public class Cat extends Animal {
        public Cat ()
        {
            name = "Oscar";
        }

        @Override
        public void sleep()
        {
            System.out.println("Oscar is sleeping");
        }
}
