package kr.co.samsung.todojpa;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import kr.co.samsung.todojpa.config.ApplicationConfig;
import kr.co.samsung.todojpa.domain.Todo;
import kr.co.samsung.todojpa.repository.TodoRepository;
import kr.co.samsung.todojpa.service.TodoService;

public class JpaRun {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		TodoRepository todorepo = context.getBean(TodoRepository.class);
		
		TodoService todoService = context.getBean(TodoService.class);
		
		//1.저장
//		Todo todo = new Todo();
//		todo.setTodo("spirng jpa 이용해보기!!");   //비영속 
//		
//		todorepo.save(todo);
		
		//2. 한 건 조회 
//		Todo findTodo = todorepo.findById(1L).orElseThrow();
//		System.out.println(findTodo);
		
//		3. 수정 
//		
//		System.out.println("service 호출");
//		System.out.println(todoService.updateTodo(3L));
//		System.out.println("service 종료");
		
		//4. 삭제 
//		todoService.deleteTodo(3L);
		
		//5. 여러건 조회 
//		List<Todo> todos = todorepo.findAll();
//		System.out.println(todos.size());
//		
//		Pageable pageable = PageRequest.of(1, 5, Sort.by("id").descending());
//		List<Todo> todos2 = todorepo.findAll(pageable).getContent();
//		
//		for (Todo todo : todos2) {
//			System.out.println(todo);
//		}
		
		//6. findByTodo 이용한 조회
//		System.out.println(todorepo.findByTodo("test").get());
		
//		List<Todo> todoList = todorepo.findByTodoContaining("test");
		
		//7. jpql을 이용한 쿼리 테스트 
		
		
//		List<Todo> todoList = todorepo.findTodos("test");
		
		//8. native 쿼리를 이용한 
		
		List<Todo> todoList =  todorepo.findTodoNative("test");
		
		for (Todo todo : todoList) {
			System.out.println(todo);
		}
	}

}
