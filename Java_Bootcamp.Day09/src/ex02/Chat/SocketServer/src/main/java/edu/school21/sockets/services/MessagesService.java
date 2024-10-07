package edu.school21.sockets.services;

import edu.school21.sockets.models.Chatroom;
import edu.school21.sockets.models.Message;
import edu.school21.sockets.models.User;

import java.util.List;

public interface MessagesService {
    void saveMessage(Message message);
    User getAuthor(Message message);
    List<Message> getLastMessagesInRoom(Chatroom chatroom);
}
