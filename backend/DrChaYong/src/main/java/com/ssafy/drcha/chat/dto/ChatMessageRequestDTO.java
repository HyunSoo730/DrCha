package com.ssafy.drcha.chat.dto;

import java.time.LocalDateTime;

import com.ssafy.drcha.chat.entity.ChatMessage;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ChatMessageRequestDTO {

	private Long chatRoomId;
	private String content;


	public ChatMessage toEntity(Long senderId) {
		return ChatMessage.builder()
			.chatRoomId(chatRoomId)
			.senderId(senderId)
			.content(content)
			.createdAt(LocalDateTime.now())
			.isRead(false)
			.build();
	}
}