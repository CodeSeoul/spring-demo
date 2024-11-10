package com.codeseoul.demo.part3Abstraction

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component


interface IDeliveryNotification {
    fun notify(message: String)
}

@Component
@Qualifier("TEXT")
class NotifyByTextMessage : IDeliveryNotification {
    override fun notify(message: String) {
        println("Notified by text message, content: $message")
    }
}

@Component
@Qualifier("PUSH")
class NotifyByPushNotification : IDeliveryNotification {
    override fun notify(message: String) {
        println("Notified by push notification, content: $message")
    }
}

@Component
@Qualifier("EMAIL")
class NotifyByEmail : IDeliveryNotification {
    override fun notify(message: String) {
        println("Notified by email, content: $message")
    }
}
