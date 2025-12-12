package org.example.structural.tp.decorator;

public class TimingNotificationDecorator implements NotificationService {
    private NotificationService notificationService;

    public TimingNotificationDecorator(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Override
    public void send(String message, String recipient) {
        long startTime = System.currentTimeMillis();
        notificationService.send(message, recipient);
        long endTime = System.currentTimeMillis();
        System.out.println("TIME: Message sent in " + (endTime - startTime) + "ms");
    }
}