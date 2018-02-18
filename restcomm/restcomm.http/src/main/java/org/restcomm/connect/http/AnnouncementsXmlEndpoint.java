package org.restcomm.connect.http;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import org.restcomm.connect.commons.annotations.concurrency.ThreadSafe;

/**
 * @author <a href="mailto:gvagenas@gmail.com">George Vagenas</a>
 */
@Path("/Accounts/{accountSid}/Announcements")
@ThreadSafe
public final class AnnouncementsXmlEndpoint extends AnnouncementsEndpoint {
    public AnnouncementsXmlEndpoint() {
        super();
    }

    @POST
    public Response putAnnouncement(@PathParam("accountSid") final String accountSid, final MultivaluedMap<String, String> data) throws Exception {
        return putAnnouncement(accountSid, data, retrieveMediaType());
    }
}
