package solid.dependencyinversionprinciple.googexample;

public class EmailNotificationImpl implements Notification{
    @Override
    public void sendNotification() {
        System.out.println("Email Notification is send");
    }
}
