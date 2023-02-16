package kr.co.samsung.todomvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import kr.co.samsung.todomvc.domain.Todo;
import kr.co.samsung.todomvc.service.TodoService;

@RestController
@RequestMapping("/api/todos")
public class TodoApiController {
	@Autowired
	private TodoService todoService;
	
	@ApiOperation(value = "Todo 목록 읽어옵니다.", notes = "todo 를 읽어옵니다.  여기에 api 사용시 필요한 상세한 설명이 있다면 기술해주세요.")
	@ApiResponses({
		@ApiResponse(
				code = 200,
				message = "성공^^"
				)
	})
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
	
	@DeleteMapping
	public String deleteTodo(@RequestBody Todo todo) {
		todoService.deleteTodo(todo.getId());
		return "ok";
	}
	
	@PostMapping
	public Todo addTodo(@RequestBody Todo todo) {
		return todoService.addTodo(todo.getTodo());
	}

}
