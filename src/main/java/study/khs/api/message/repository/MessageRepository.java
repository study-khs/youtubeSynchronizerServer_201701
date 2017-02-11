package study.khs.api.message.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import study.khs.api.message.domain.Message;

public interface MessageRepository extends CrudRepository<Message, Long> {

	Message findById(String id);

	@Transactional
	void deleteById(String id);
}
