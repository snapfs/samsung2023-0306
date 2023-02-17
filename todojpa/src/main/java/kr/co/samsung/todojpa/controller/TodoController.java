package kr.co.samsung.todojpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.samsung.todojpa.domain.Todo;
import kr.co.samsung.todojpa.service.TodoService;

@Controller
@RequestMapping("/todo/")
public class TodoController {
	
	@Autowired
	private TodoService todoService;
	
	@GetMapping("/list")
	public String getTodos(Model model) {
		List<Todo> todos = todoService.getTodos();
		
		model.addAttribute("todoList", todos);
		
		return "todo/list";
	}
	
	@GetMapping("/update")
	public String updateTodo(@RequestParam("id") Long id) {
		todoService.updateTodo(id);
		return "redirect:/todo/list";
	}
	
	@GetMapping("/delete")
	public String deleteTodo(@RequestParam("id") Long id) {
		todoService.deleteTodo(id);
		return "redirect:/todo/list";
	}
	
	@PostMapping("/add")
	public String add(Todo todo) {
		todoService.addTodo(todo.getTodo());
		return "redirect:/todo/list";
	}
	
	@ResponseBody
	@GetMapping("/test")
	public String test() {
		return "testtest";
	}

}
