package org.example.structural.tp.decorator;

public class Demo {
    public static void main(String[] args) {
        // Basic notification service
        NotificationService basicService = new BasicNotificationService();
        System.out.println("=== Basic Notification ===");
        basicService.send("Hello World", "user@example.com");

        // With logging
        NotificationService loggingService = new LoggingNotificationDecorator(basicService);
        System.out.println("\n=== With Logging ===");
        loggingService.send("Hello with logging", "user@example.com");

        // With encryption
        NotificationService encryptionService = new EncryptionNotificationDecorator(basicService);
        System.out.println("\n=== With Encryption ===");
        encryptionService.send("Secret message", "user@example.com");

        // With timing
        NotificationService timingService = new TimingNotificationDecorator(basicService);
        System.out.println("\n=== With Timing ===");
        timingService.send("Timed message", "user@example.com");

        // Combined decorators: logging + encryption + timing
        NotificationService fullService = new TimingNotificationDecorator(
                new EncryptionNotificationDecorator(
                        new LoggingNotificationDecorator(basicService)));
        System.out.println("\n=== Combined: Logging + Encryption + Timing ===");
        fullService.send("Full featured message", "user@example.com");
    }
}