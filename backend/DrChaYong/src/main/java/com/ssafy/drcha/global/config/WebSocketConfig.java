package com.ssafy.drcha.global.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
	@Value("${spring.rabbitmq.host}")
	private String rabbitHost;

	@Value("${spring.rabbitmq-stomp.port}")
	private int rabbitStompPort;

	@Value("${spring.rabbitmq.username}")
	private String username;

	@Value("${spring.rabbitmq.password}")
	private String passcode;

	@Override
	public void configureMessageBroker(MessageBrokerRegistry config) {
		config.setPathMatcher(new AntPathMatcher(".")); // url을 chat/room/3 -> chat.room.3으로 참조하기 위한 설정
		config.enableStompBrokerRelay("/queue", "/topic", "/exchange", "/amq/queue")
			.setRelayHost(rabbitHost)
			.setRelayPort(rabbitStompPort)
			.setSystemLogin(username)
			.setSystemPasscode(passcode)
			.setClientLogin(username)
			.setClientPasscode(passcode);

		// 클라이언트로부터 메시지를 받을 api의 prefix를 설정함
		// publish
		config.setApplicationDestinationPrefixes("/pub");
		log.info("STOMP Broker 설정 완료: " + rabbitHost + ":" + rabbitStompPort);


	}

	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) {
		registry.addEndpoint("/ws")
			.setAllowedOrigins("http://127.0.0.1:5500", "http://localhost:5500")
			.withSockJS();
	}
}