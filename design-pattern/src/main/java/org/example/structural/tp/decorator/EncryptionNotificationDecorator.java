package org.example.structural.tp.decorator;

public class EncryptionNotificationDecorator implements NotificationService {
    private NotificationService notificationService;

    public EncryptionNotificationDecorator(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Override
    public void send(String message, String recipient) {
        String encryptedMessage = encrypt(message);
        notificationService.send(encryptedMessage, recipient);
    }

    private String encrypt(String message) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : message.toCharArray()) {
            encrypted.append((char) (c + 1));
        }
        return encrypted.toString();
    }
}