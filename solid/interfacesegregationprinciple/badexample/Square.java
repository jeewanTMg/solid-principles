package solid.interfacesegregationprinciple.badexample;

public class Square implements ShapeAreaCalculators{
    @Override
    public void area() {
        // we can find the area of the square
    }

    @Override
    public void volume() {
   // We cannot find the volume of the square
    }


    // Here we have forcefully implementated the volume which is not required as interfaceswgrationprinciple
    //state that build small focus interface that do not force the client to implement behaviour
    // that does not required.
}
