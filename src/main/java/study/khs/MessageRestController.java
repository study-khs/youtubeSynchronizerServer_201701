package study.khs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message/{path_message}")
public class MessageRestController {
	//private final String message;

	@Autowired
	MessageRestController() {
	}
//	MessageRestController(String message) {
//		this.message = message;
//	}

	private String makeReply(String message) {
		return "You said "+ message + ".";
	}
	
	@RequestMapping(method = RequestMethod.GET)
	String get_replyMessages(@PathVariable String pathMessage) {
		String replyMessage = makeReply(pathMessage);
		System.out.println("GET : "+pathMessage + " Result : " + replyMessage);
		return replyMessage;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	String post_replyMessages(@RequestBody String requestMessage) {
		String replyMessage = makeReply(requestMessage);
		System.out.println("POST : "+requestMessage + " Result : " + replyMessage);
		return replyMessage;
	}
}