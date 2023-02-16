package kr.co.samsung.todomvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kr.co.samsung.todomvc.domain.Todo;
import kr.co.samsung.todomvc.service.TodoService;

@RestController
@RequestMapping("/api/todos")
public class TodoApiController {
	@Autowired
	private TodoService todoService;
	
	@GetMapping
	public List<Todo> getTodos(){
		return todoService.getTodos();
	}
	
	@GetMapping("/{id}")
	public Todo getTodo(@PathVariable("id")Long  id) {
		return todoService.getTodo(id);
	}
	
	@PatchMapping
	public String updateTodo(@RequestBody Todo todo) {
		todoService.updateTodo(todo.getId());
		return "ok";
	}

}
