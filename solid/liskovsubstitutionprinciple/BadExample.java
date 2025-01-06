package solid.liskovsubstitutionprinciple;

public class BadExample {

/*
* In the below example we are breaking the liskovsubstitution principle
* as it state that we must replace the superclass object with subclass object
* with affecting the correctness of the programming
*
*
*
* Ostrich could not fly so we need to override the dummy method for the Ostrich class.
*
* in the goodexample we are implementing it.
*
* */

}

abstract class Bird {
    abstract void fly();
}

abstract class Eagle extends Bird {
    @Override
    public void fly() { // some implementation
         }
}

abstract class Ostrich extends Bird {
    @Override
    public void fly() {
        // some implementation
    }
}
