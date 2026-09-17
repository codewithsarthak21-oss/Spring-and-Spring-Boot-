package in.codewithsarthak.notification;

public class EmailService implements NotificationService{

    @Override
    public void sendNotification(){
        // actual notification sent
        System.out.println("Email Notification Sent");
    }
}
