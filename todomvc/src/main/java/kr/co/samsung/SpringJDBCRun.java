package kr.co.samsung;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.samsung.todomvc.config.ApplicationConfig;
import kr.co.samsung.todomvc.dao.TodoDao;
import kr.co.samsung.todomvc.domain.Todo;

public class SpringJDBCRun {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		TodoDao dao = context.getBean(TodoDao.class);
		
		List<Todo> todos = dao.getTodos();
		
		for (Todo todo : todos) {
			System.out.println(todo);
		}
	}

}
