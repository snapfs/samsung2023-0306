package kr.co.samsung.todojpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.samsung.todojpa.domain.Todo;
import kr.co.samsung.todojpa.repository.TodoRepository;

@Service
public class TodoService {
	@Autowired
	private TodoRepository todoRepository;
	
	@Transactional
	public Todo updateTodo(Long id) {	
		System.out.println("service update 시작");
		Todo updateTodo = null;
		try {
		
			updateTodo = todoRepository.findById(id).orElseThrow();
			updateTodo.setDone(!updateTodo.isDone());
			
		}finally {
			System.out.println("TodoService update 완료!!");
		}		
		return updateTodo;
	}
	
}
