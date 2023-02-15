package kr.co.samsung.todomvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.co.samsung.todomvc.domain.Todo;

@Repository
public class TodoDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Todo> getTodos(){
		
		String sql = "select id, todo, done from todos order by id desc";
		
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper(Todo.class));
		
	}
	
}
