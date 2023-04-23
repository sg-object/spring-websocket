package com.sg.websocket.controller;

import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class MsgController {

	private final SimpMessagingTemplate template;

	@ResponseBody
	@GetMapping("msg")
	public void send(final String id) {
		this.template.convertAndSend("topic/" + id, "this is test");
	}
}
