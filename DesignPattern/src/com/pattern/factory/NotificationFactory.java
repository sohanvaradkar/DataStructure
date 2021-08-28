package com.pattern.factory;

public class NotificationFactory {

	public Notification createNotification(String channel)
	{
		
		if(channel==null||channel.isEmpty())
		return null;
		else if(channel.equals("SMS1"))
		return	new SmsNotification();
		else if(channel.equals("EMAIL"))
		return	new EmailNotification();
		else if(channel.equals("PUSH"))
		return	new PushNotification();
		return null;
	}
}
