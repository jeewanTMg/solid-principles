package solid.dependencyinversionprinciple.googexample;

public class Employee {

    Notification notification;
    public Employee(Notification notification) {
         this.notification = notification;
    }

    public void notificationSendToEmployee() {
        notification.sendNotification();
    }

    public static void main(String[] args) {
        //Here we are using the higher module with higher module
        EmailNotificationImpl emailNotification = new EmailNotificationImpl();
        Employee employeeNotification = new Employee(emailNotification);
        employeeNotification.notificationSendToEmployee();
    }
}
