package com.isprotocol.for_websocket.service;

import com.isprotocol.for_websocket.dto.MessageRequestDto;
import com.isprotocol.for_websocket.dto.MessageResponseDto;
import com.isprotocol.for_websocket.entity.Message;
import com.isprotocol.for_websocket.repository.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class MessageService {

    private final MessageRepository messageRepository;

    @Transactional
    public MessageResponseDto createMessage(MessageRequestDto messageRequestDto) {
        Message message = new Message(messageRequestDto);
        messageRepository.save(message);
        return new MessageResponseDto(message);
    }
}
