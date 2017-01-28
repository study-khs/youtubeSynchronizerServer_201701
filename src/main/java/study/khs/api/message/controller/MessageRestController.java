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
	MessageService messageService;

	@RequestMapping(value = "/{pathMessage}", method = RequestMethod.GET)
	String get_replyMessages(@PathVariable String message) {

		log.info("get_replyMessages message=[{}]", message);

		String replyMessage = messageService.makeReply(message);

		log.info("replyMessage=[{}]", replyMessage);

		return replyMessage;
	}

	@RequestMapping(method = RequestMethod.POST)
	String post_replyMessages(@RequestBody Message message) {

		log.info("post_replyMessages message=[{}]", message);

		String replyMessage = messageService.makeReply(message.getMessage());

		log.info("replyMessage=[{}]", message);

		return replyMessage;
	}
}
