package solid.liskovsubstitutionprinciple;

public class LiskovSubstitutionPrincipleExample {

    /*
    * Liskov Substitution Principle
The Liskov substitution principle states that you must be able to replace a superclass
* object with a subclass object without affecting the correctness of the program.
    * */

    /*
    *
    * abstract class Bird{
   abstract void fly();
}

class Eagle extends Bird {
   @Override
   public void fly() { // some implementation }
}

class Ostrich extends Bird {
   @Override
   public void fly() { // dummy implementation }
}
    * */

    /*
    * In the above example, the Eagle class and the Ostrich class both extend
    * the Bird class and override the fly() method. However, the Ostrich class
    * is forced to provide a dummy implementation because it cannot fly, and
    * therefore it does not behave the same way if we replace the Bird class object with it.

This violates the Liskov substitution principle. To address this, we can create a separate
*  class for birds that can fly and have the Eagle extend it, while other birds can extend
*  a different class, which will not include any fly behavior.
    *
    * */
    public static void main(String[] args) {

    }
}
