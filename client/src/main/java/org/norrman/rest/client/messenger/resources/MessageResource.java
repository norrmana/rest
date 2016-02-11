package org.norrman.rest.client.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.norrman.rest.client.model.Message;
import org.norrman.rest.client.service.MessageService;

@Path("/messages")
public class MessageResource {

    private MessageService ms = new MessageService();

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Message> getIt() {
        return ms.getMessages();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_XML)
    public Message getId(@PathParam("id") long id) {
        return ms.getMessage(id);
    }
}