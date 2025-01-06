package solid.opencloseprinciple.goodexample;

public class EmailNotificationServiceImpl implements NotificationService{
    @Override
    public void sendNotification(String medium) {
        //using the email notification for the customer
    }

    @Override
    public void sendTransaction(String medium) {
     //using the email transaction notification.
    }
}
