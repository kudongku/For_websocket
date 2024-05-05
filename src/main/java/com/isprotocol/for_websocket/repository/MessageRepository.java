package com.isprotocol.for_websocket.repository;

import com.isprotocol.for_websocket.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {

}
