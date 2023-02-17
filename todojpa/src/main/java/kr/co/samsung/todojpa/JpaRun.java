package kr.co.samsung.todojpa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.samsung.todojpa.config.ApplicationConfig;
import kr.co.samsung.todojpa.domain.Todo;
import kr.co.samsung.todojpa.repository.TodoRepository;
import kr.co.samsung.todojpa.service.TodoService;

public class JpaRun {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		TodoRepository todorepo = context.getBean(TodoRepository.class);
		
		//1.저장
//		Todo todo = new Todo();
//		todo.setTodo("spirng jpa 이용해보기!!");   //비영속 
//		
//		todorepo.save(todo);
		
		//2. 한 건 조회 
//		Todo findTodo = todorepo.findById(1L).orElseThrow();
//		System.out.println(findTodo);
		
//		3. 수정 
		TodoService todoService = context.getBean(TodoService.class);
		System.out.println("service 호출");
		System.out.println(todoService.updateTodo(3L));
		System.out.println("service 종료");
		
	
		
	}

}
