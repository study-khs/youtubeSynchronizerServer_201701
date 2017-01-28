package study.khs.api.message.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class MessageServiceImpl implements MessageService {

	public String makeReply(String message) {
		
		log.info("makeReply message=[{}]", message);

		return "You said " + message + "!!!!";
	}
}
