package com.isprotocol.for_websocket.dto;

import com.isprotocol.for_websocket.entity.Message;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MessageResponseDto {

    private String content;

    public MessageResponseDto(Message message) {
        this.content = message.getContent();
    }

}
