package practices.practice04;

public class Q05_Method_NotificationSystem {

    /*
    Notification App Implementation with Method Overloading
        Three types of notifications:
        Email: This notification requires the recipient's email address, a subject, and a message.
        SMS: This notification requires the recipient's phone number (using long) and a message.
        Push Notification: This notification only requires a message, since no contact information is needed.
     */

    public static void main(String[] args) {

        String emailResult = sendNotification("johndoe@gmail.com", "Order Update", "Your order has been shipped." );
        System.out.println("emailResult = " + emailResult);

        String smsResult = sendNotification(1345488789L, "Your package is out for delivery.");
        System.out.println("smsResult = " + smsResult);

        String pushResult = sendNotification( "Don't miss our special offers!" );
        System.out.println("pushResult = " + pushResult);
    }

    //Method to send notification via email with subject and message content
    public static String sendNotification(String email, String subject, String messageContent){
        return "Email sent to " + email + " with subject: " + subject + " and message: " + messageContent;
    }

    public static String sendNotification (long phoneNumber, String messageContent ){
        return "SMS sent to phone number " + phoneNumber + " with message: " + messageContent;
    }

    public static String sendNotification (String messageContent){
        return "Push notification sent with message: " + messageContent;
    }
}














