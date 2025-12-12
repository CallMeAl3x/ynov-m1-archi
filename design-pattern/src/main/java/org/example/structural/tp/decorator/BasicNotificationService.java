package org.example.structural.tp.decorator;

public class BasicNotificationService implements NotificationService {
    @Override
    public void send(String message, String recipient) {
        System.out.println("Sending notification to " + recipient + ": " + message);
    }
}