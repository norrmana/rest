package org.norrman.rest.client.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.norrman.rest.client.model.Message;
import org.norrman.rest.client.model.Profile;
import org.norrman.rest.client.repository.MessageRepository;
import org.norrman.rest.client.repository.ProfileRepository;

public class MessageService {

    private Map<Long, Message> messages = MessageRepository.getMessages();
    private Map<Long, Profile> profiles = ProfileRepository.getProfiles();

    public MessageService() {
        // List<Message> messages = new ArrayList<Message>();
        messages.put(1L, new Message(1, "Hello Worldx", "norrmana"));
        messages.put(2L, new Message(2, "Hello Jerseyx", "norrmana"));
        // return messages;
    }

    public List<Message> getMessages() {
        return new ArrayList<Message>(messages.values());

    }

    public Message getMessage(long id) {
        return messages.get(id);
    }

    public Message addMessage(Message message) {
        message.setId(messages.size() + 1);
        messages.put(message.getId(), message);
        return message;
    }

    public Message updateMessage(Message message) {
        if (message.getId() < 0) {
            return null;
        }
        messages.put(message.getId(), message);
        return message;
    }

    public Message removeMessage(Message message) {
        return messages.remove(message.getId());
    }

}
