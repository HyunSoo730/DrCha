package com.ssafy.drcha.chat.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.ssafy.drcha.chat.entity.ChatMessage;


@Repository
public interface ChatMessageRepository extends MongoRepository<ChatMessage, Long> {
}
