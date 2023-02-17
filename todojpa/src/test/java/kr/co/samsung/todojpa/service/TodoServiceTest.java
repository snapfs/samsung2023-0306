package kr.co.samsung.todojpa.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.transaction.annotation.Transactional;

import kr.co.samsung.todojpa.config.ApplicationConfig;
import kr.co.samsung.todojpa.domain.Todo;

@SpringJUnitConfig(classes = ApplicationConfig.class)
@Transactional
public class TodoServiceTest {
	@Autowired
	TodoService todoService;
	
	@Test
	void updateTodo() {
		Todo todo =	todoService.updateTodo(6L);
		
		assertEquals(false, todo.isDone());
	}

}
