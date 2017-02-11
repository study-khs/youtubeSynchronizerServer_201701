package study.khs.api.message.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import study.khs.api.message.domain.Message;
import study.khs.api.message.repository.MessageRepository;

@Slf4j
@RestController
@RequestMapping("/api/message")
public class MessageRestController {

	@Autowired
	private MessageRepository messageRepository;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody Message getMessage(@PathVariable String id) {

		log.info("getMessage id=[{}]", id);

		Message message = messageRepository.findById(id);

		log.info("getMessage message=[{}]", message);

		return message;
	}

	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Message postMessage(@RequestBody Message message) {

		log.info("postMessage message=[{}]", message);

		Message saveMessage = messageRepository.save(message);

		log.info("postMessage saveMessage=[{}]", saveMessage);

		return saveMessage;
	}

	@RequestMapping(method = RequestMethod.PUT)
	public @ResponseBody Message putMessage(@RequestBody Message message) {

		log.info("putMessage message=[{}]", message);

		Message saveMessage = messageRepository.save(message);

		log.info("putMessage saveMessage=[{}]", saveMessage);

		return saveMessage;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteMessage(@PathVariable String id) {

		log.info("deleteMessage id=[{}]", id);

		messageRepository.deleteById(id);
	}
}
