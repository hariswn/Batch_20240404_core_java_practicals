package core.oops;

class MessageSender {
    public void sendMessage(String message) {
        System.out.println("Sent message : " + message);
    }

    public void prepareMessage(String message) {
        System.out.println("Preparing message : " + message);
    }
}

class SMSMessageSender {
    private MessageSender messageSender = new MessageSender();

    public void sendSms(String message) {
        this.messageSender.prepareMessage(message);
        this.messageSender.sendMessage(message);
    }
}

public class InheritanceTest {

    public static void main(String[] args) {
        SMSMessageSender smsMessageSender = new SMSMessageSender();
        smsMessageSender.sendSms("Hi Java, how are you?");
    }
}
