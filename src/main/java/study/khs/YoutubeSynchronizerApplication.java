package study.khs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CharacterEncodingFilter;

@SpringBootApplication
public class YoutubeSynchronizerApplication {

	public static void main(String[] args) {
		SpringApplication.run(YoutubeSynchronizerApplication.class, args);
	}

	@Bean
	public CharacterEncodingFilter characterEncodingFilter() {
		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
		characterEncodingFilter.setEncoding("EUC-KR");
		characterEncodingFilter.setForceEncoding(true);
		return characterEncodingFilter;
	}
}
