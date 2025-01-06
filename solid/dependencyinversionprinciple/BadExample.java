package solid.dependencyinversionprinciple;

public class BadExample {
/*
* In the below  example EmailNotification is lower module which is used in the higher module
* of the Employee which break the Dependencyinversion principle
*
* */
}

interface Notification {
    void sendNotify();
}

class EmailNotification implements Notification {

    @Override
    public void sendNotify() {
        //EmailNotification send
    }
}

class Employee {
    EmailNotification emailNotification;
    Employee(EmailNotification emailNotification) {
        this.emailNotification = emailNotification;
    }

    void notifyEmployee() {
        emailNotification.sendNotify();
    }
}
