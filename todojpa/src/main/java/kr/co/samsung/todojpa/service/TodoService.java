package kr.co.samsung.todojpa.service;

import java.util.List;
import java.util.Optional;

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
	
	@Transactional
	public void deleteTodo(Long id) {
		Optional<Todo>  result  = todoRepository.findById(id);
		if(result.isEmpty())
			return;
		todoRepository.delete(result.get());
	}

	public List<Todo> getTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addTodo(String todo) {
		// TODO Auto-generated method stub
		
	}
	
}
