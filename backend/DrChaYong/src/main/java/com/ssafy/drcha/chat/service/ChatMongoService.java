package com.ssafy.drcha.chat.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.ssafy.drcha.chat.dto.ChatMessageParam;
import com.ssafy.drcha.chat.entity.ChatMessage;
import com.ssafy.drcha.chat.repository.ChatMessageRepository;
import com.ssafy.drcha.chat.repository.ChatRoomMemberRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class ChatMongoService {
	private final ChatMessageRepository chatMessageRepository;
	private final ChatRoomMemberRepository chatRoomMemberRepository;

	/*
	  메시지 저장
	 */
	public ChatMessage saveChatMessage(ChatMessage chatMessage) {
		chatMessageRepository.save(chatMessage);
		return chatMessage;
	}

	/*
  	 대화 내용 AI서버로
 	*/
	public String getConversationByChatRoomId(Long chatRoomId) {
		List<ChatMessage> messages = chatMessageRepository.findByChatRoomId(String.valueOf(chatRoomId));
		return messages.stream()
			.map(ChatMessage::getContent)
			.collect(Collectors.joining("\n"));
	}

	/*
	 무한 스크롤
	 */
	public List<ChatMessage> getChatScrollMessages(String chatRoomId, ChatMessageParam param) {
		Long topId = param != null ? param.getTop() : null;
		return chatMessageRepository.getChatMessagesAllByChatRoomAndTopId(chatRoomId, topId);
	}

	/*
	  채팅방 입장 시 메시지 호출
	 */
	public List<ChatMessage> getRecentChatMessages(String chatRoomId, int limit) {
		return chatMessageRepository.findByChatRoomIdOrderByCreatedAtDesc(chatRoomId, PageRequest.of(0, limit));
	}
}