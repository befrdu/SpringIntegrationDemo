package com.spring.transformer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.http.HttpStatus;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import com.spring.msg.CreditScoreRequest;
import com.spring.msg.ResponseMsg;
import com.spring.msg.UserDetail;

@Component
public class MessageTransformer {
	public Message<?> transformResponse(Message<UserDetail> message){
		
		UserDetail userDetail=message.getPayload();
		
		// Get currentTime
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String currentTime = dtf.format(now);
        
        /*
         * Transform the response by adding the current time stamp
         */
        ResponseMsg returnMsg = new ResponseMsg(userDetail, currentTime);
        
        /*
         * Construct and return the message
         */
        return MessageBuilder.withPayload(returnMsg)
            .copyHeadersIfAbsent(message.getHeaders())
            .setHeader("http_statusCode", HttpStatus.OK)
            .build();
	}
public Message<?> transformRequest(Message<UserDetail> message){
		
		UserDetail userDetail=message.getPayload();
		
        /*
         * Transform the response by adding the current time stamp
         */
        CreditScoreRequest request=new CreditScoreRequest();
        request.setName(userDetail.getFirstName()+" "+userDetail.getLastName());
        request.setSsn(userDetail.getSsn());
        /*
         * Construct and return the message
         */
        return MessageBuilder.withPayload(request)
            .copyHeadersIfAbsent(message.getHeaders())
            .setHeader("http_statusCode", HttpStatus.OK)
            .build();
	}
}
