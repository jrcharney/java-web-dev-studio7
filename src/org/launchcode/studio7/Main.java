package org.launchcode.studio7;


public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        // CD makeYourself = new CD();   // Incubus, Make Yourself, 1999
        // DVD twister = new DVD();     // Twister, 1996
        //ArrayList<Media> items = new ArrayList<Media>();
        BaseDisc cd = new CD();
        BaseDisc dvd = new DVD();

        cd.spinDisc();
        dvd.spinDisc();

        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
