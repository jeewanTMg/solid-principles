package solid.singlersponsibilityprinciple;

public class BadExample {
    /*
    * This is the bad example of the single responsiblity principle because this
    * class is doing everthing printData, insertingIntoDB, mapping Data so
    * according to the single responsibility principle each method should have their
    * own class to do the things. which are in the good example directory.
    * */
    public void printdata(String data) {
        System.out.println(data);
    }

    public void insertDataIntoDB(Object data){
        //saving the data into the DB.
    }

    public void mappingData(Object data) {
        // mapping the data into object
    }

}
