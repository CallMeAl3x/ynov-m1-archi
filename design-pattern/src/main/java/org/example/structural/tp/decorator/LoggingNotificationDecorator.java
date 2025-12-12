package org.example.structural.tp.decorator;

public class LoggingNotificationDecorator implements NotificationService {
    private NotificationService notificationService;

    public LoggingNotificationDecorator(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Override
    public void send(String message, String recipient) {
        System.out.println("LOG: Sending message '" + message + "' to " + recipient);
        notificationService.send(message, recipient);
    }
}