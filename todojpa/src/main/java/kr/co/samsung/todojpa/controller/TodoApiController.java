package kr.co.samsung.todojpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.samsung.todojpa.domain.Todo;
import kr.co.samsung.todojpa.service.TodoService;

@RestController
@RequestMapping("/api/todos")
public class TodoApiController {
	@Autowired
	private TodoService todoService;
	
	
	@GetMapping("/bearerTest")
	public String bearerTest( @RequestHeader("Authorization") String key) {
		return key;
	}
	
	
	@GetMapping
	public List<Todo> getTodos(@RequestHeader("Authorization") String key){
		System.out.println("#########################key###########################"+key);
		return todoService.getTodos();
	}
	
//	@GetMapping("/{id}")
//	public Todo getTodo(@PathVariable("id")Long  id) {
//		return todoService.getTodo(id);
//	}
	
	@PatchMapping
	public String updateTodo(@RequestBody Todo todo) {
		todoService.updateTodo(todo.getId());
		return "ok";
	}
	
	@DeleteMapping
	public String deleteTodo(@RequestBody Todo todo) {
		todoService.deleteTodo(todo.getId());
		return "ok";
	}
	
//	@PostMapping
//	public Todo addTodo(@RequestBody Todo todo) {
//		return todoService.addTodo(todo.getTodo());
//	}

}
