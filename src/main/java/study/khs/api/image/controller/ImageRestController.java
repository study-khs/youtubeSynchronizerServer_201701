package study.khs.api.image.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import study.khs.api.image.domain.Image;

@RestController
@RequestMapping("/image")
public class ImageRestController {
	@Autowired
	
	ImageRestController() {
	}

	@RequestMapping(value = "/post", method = RequestMethod.POST)
    @ResponseBody
    public String create(@RequestBody Image image) {
		saveImg(image);
		
        return "success";
    }
	
	private void saveImg(Image image){
	}
}
