package dev.silva.notificacionconspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {


    @Autowired
    SimpleMessagingTemplate simpleMessagingTemplate;

    //mapeado como app/application

    @MessageMapping("/application")
    @SendTo("/all/messages")
    public Message send(final Message message) throws Exception{
        return message;
    }

    //Mapeado como /app/private

    public void sendToSpecificUser(@Payload Message message){
        simpleMessagingTemplate.convertAndSendToUser(Message.getTo(), "/specific", message);
    }

}
