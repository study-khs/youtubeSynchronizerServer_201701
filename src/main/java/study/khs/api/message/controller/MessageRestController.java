package study.khs.api.message.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import study.khs.api.message.domain.Message;
import study.khs.api.message.service.MessageService;

@Slf4j
@RestController
@RequestMapping("/api/message")
public class MessageRestController {

	@Autowired
	private MessageService messageService;

	@RequestMapping(value = "/{message}", method = RequestMethod.GET)
	public String getReplyMessage(@PathVariable String message) {

		log.info("get_replyMessages message=[{}]", message);

		String replyMessage = messageService.makeReply(message);

		log.info("replyMessage=[{}]", replyMessage);

		return replyMessage;
	}

	@RequestMapping(method = RequestMethod.POST)
	public String postReplyMessage(@RequestBody Message message) {

		log.info("post_replyMessages message=[{}]", message);

		String replyMessage = messageService.makeReply(message.getMessage());

		log.info("replyMessage=[{}]", message);

		return replyMessage;
	}
}
