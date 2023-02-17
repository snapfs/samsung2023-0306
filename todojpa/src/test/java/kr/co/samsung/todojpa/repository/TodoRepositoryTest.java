package kr.co.samsung.todojpa.repository;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.transaction.annotation.Transactional;

import kr.co.samsung.todojpa.config.ApplicationConfig;
import kr.co.samsung.todojpa.domain.Todo;

@ExtendWith(SpringExtension.class)
@SpringJUnitConfig(classes = ApplicationConfig.class)
@DisplayName("todo jpa 테스트")
@Transactional
public class TodoRepositoryTest {
	private static Logger logger = LoggerFactory.getLogger(TodoRepository.class);
	
	@Autowired
	private TodoRepository todoRepository;
	
	@BeforeAll
	static void setUp() {
		logger.info("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@BeforeAll 실행");
	}
	
	@AfterAll
	static void tearDown() {
		logger.info("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@AfterAll 실행");
	}
	
	@BeforeEach
	void init() {
		logger.info("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@BeforeEach 실행");
	}
	
	@AfterEach
	void dispose() {
		logger.info("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@AfterEach 실행");
	}
	
	@Test
	void test() {
		logger.info("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@test메소드  실행");
	}
	
	@Test
	void test2() {
		logger.info("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@test2메소드  실행");
	}
	
	@Test
	@DisplayName("test")
	void save() throws Exception{
		logger.info("save~~");
		Todo todo = new Todo();
		todo.setTodo("junit test 실습");
		
		todo = todoRepository.save(todo);
		
		assertNotNull(todo.getId());
	}
	
}
