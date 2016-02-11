package org.norrman.rest.client.repository;

import java.util.HashMap;
import java.util.Map;

import org.norrman.rest.client.model.Message;

public class MessageRepository {

    private static Map<Long, Message> messages = new HashMap<>();

    public static Map<Long, Message> getMessages() {
        return messages;
    }
}
