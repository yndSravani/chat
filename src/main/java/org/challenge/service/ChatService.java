package org.challenge.service;

import org.challenge.dto.Chat;
import org.challenge.dto.Message;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by sravz on 6/25/2017.
 */
public class ChatService {

    private List<ChatService> list(){
        List<Chat> chats=new ArrayList<>();
        Chat chat=new Chat(1);
        chats.add(chat);
        chat=new Chat(2);
        chats.add(chat);
        chat=new Chat(3);
        chats.add(chat);
        chat=new Chat(4);
        chats.add(chat);

        List<Message> messages = new ArrayList<>();
        Message message1=new Message(1,1,"Hello",new Date(),"sravz","kishore");
        messages.add(message1);
        message1=new Message(2,1,"Hi",new Date(),"sravz","kishore");
        messages.add(message1);
        message1=new Message(3,1,"Eating",new Date(),"sravz","kishore");
        messages.add(message1);
        message1=new Message(4,1,"Sleeping",new Date(),"sravz","kishore");
        messages.add(message1);
        message1=new Message(5,1,"Walking",new Date(),"sravz","kishore");
        messages.add(message1);
        message1=new Message(6,2,"Cooking",new Date(),"sravz","kishore");
        messages.add(message1);
        message1=new Message(7,2,"Seriously",new Date(),"sravz","kishore");
        messages.add(message1);
        message1=new Message(8,2,"Really",new Date(),"sravz","kishore");
        messages.add(message1);
        message1=new Message(9,2,"Finally",new Date(),"sravz","kishore");
        messages.add(message1);
        message1=new Message(10,2,"Jogging",new Date(),"sravz","kishore");
        messages.add(message1);
        message1=new Message(11,3,"Dieting",new Date(),"sravz","kishore");
        messages.add(message1);
        message1=new Message(12,3,"Hello",new Date(),"sravz","kishore");
        messages.add(message1);
        message1=new Message(13,3,"Hello",new Date(),"sravz","kishore");
        messages.add(message1);
        message1=new Message(14,3,"Hello",new Date(),"sravz","kishore");
        messages.add(message1);
        message1=new Message(15,3,"Hello",new Date(),"sravz","kishore");
        messages.add(message1);
        message1=new Message(16,4,"Hello",new Date(),"sravz","kishore");
        messages.add(message1);
        message1=new Message(17,4,"Hello",new Date(),"sravz","kishore");
        messages.add(message1);
        message1=new Message(18,4,"Hello",new Date(),"sravz","kishore");
        messages.add(message1);
        message1=new Message(19,4,"Hello",new Date(),"sravz","kishore");
        messages.add(message1);
        message1=new Message(20,4,"Hello",new Date(),"sravz","kishore");
        messages.add(message1);
        return null;
    }
}
