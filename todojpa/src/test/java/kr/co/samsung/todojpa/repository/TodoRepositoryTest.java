package kr.co.samsung.todojpa.repository;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.transaction.annotation.Transactional;

import kr.co.samsung.todojpa.config.ApplicationConfig;

@ExtendWith(SpringExtension.class)
@SpringJUnitConfig(classes = ApplicationConfig.class)
@DisplayName("todo jpa 테스트")
@Transactional
public class TodoRepositoryTest {
	private static Logger logger = LoggerFactory.getLogger(TodoRepository.class);
	
	
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
	
}
