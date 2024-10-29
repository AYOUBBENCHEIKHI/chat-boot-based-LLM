package org.enset_chatbot_rag.web;

import org.enset_chatbot_rag.services.ChatAiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chat")
public class ChatRestContoller {
	private ChatAiService chatAiService;

	public ChatRestContoller(ChatAiService chatAiService) {
		super();
		this.chatAiService = chatAiService;
	}
	@GetMapping("/ask")
	public String ask(String question) {
		return chatAiService.ragChat(question);
	}

}
