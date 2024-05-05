package com.isprotocol.for_websocket.controller;

import com.isprotocol.for_websocket.dto.MessageRequestDto;
import com.isprotocol.for_websocket.dto.MessageResponseDto;
import com.isprotocol.for_websocket.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@RequiredArgsConstructor
@Controller
public class MessageController {

    private final MessageService messageService;

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public MessageResponseDto createMessage(MessageRequestDto messageRequestDto) {
        return messageService.createMessage(messageRequestDto);
    }

}
