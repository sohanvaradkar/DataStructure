package com.pattern.factory;

public class SmsNotification implements  Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sms Notification Sent");
    }
}
