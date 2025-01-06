package solid.interfacesegregationprinciple.goodexample;


// here we are working on the small build, focus on the interface
// that doesn't force the client to implement that is not required.
public class Cylinder implements VolumeCalculator{
    @Override
    public void calculateVolume() {

    }
}
