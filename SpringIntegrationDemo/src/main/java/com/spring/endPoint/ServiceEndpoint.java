package com.spring.endPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.spring.msg.Response;
import com.spring.msg.UserDetail;

@Component
public class ServiceEndpoint {
	//private Logger log = LoggerFactory.getLogger(this.getClass().getName());
	
	@Autowired
	RestTemplate restTemplate;
	
	public Message<?> get(Message<Response> msg) {
		Response payload = msg.getPayload();
        MessageHeaders headers=msg.getHeaders();
        
        System.out.println(payload);
        System.out.println(headers);
        
        /*
         * Call external service
         */
        //ResponseEntity<UserDetail>response= restTemplate.getForEntity("http://localhost:8090/getUserDetail/"+userName, UserDetail.class);
     
        /*
         * Construct and return the message
         */
        return MessageBuilder.withPayload(msg.getPayload())
            .copyHeadersIfAbsent(msg.getHeaders())
            .build();
    }
}