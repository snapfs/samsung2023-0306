package kr.co.samsung.todomvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import kr.co.samsung.todomvc.domain.Todo;

@Repository
public class TodoDao {
	public TodoDao() {
		System.out.println("todoDao 생성!! ");
	}
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private SimpleJdbcInsert simpleJdbcInsert;
	
	@PostConstruct
	public void init() {
		System.out.println("@PostConstruct  실행!!");
		simpleJdbcInsert = new SimpleJdbcInsert(jdbcTemplate).withTableName("todos").usingGeneratedKeyColumns("id");
	}
	
	@Transactional
	public Todo addTodo(String todo) {
		Map<String, Object> params = new HashMap();
		params.put("todo", todo);
		params.put("done", false);
		
		Number pk = simpleJdbcInsert.executeAndReturnKey(params);
		
		Todo newTodo = new Todo();
		newTodo.setId(pk.longValue());
		newTodo.setTodo(todo);
		newTodo.setDone(false);
		
		return newTodo;
	}
	
	@Transactional(readOnly = true)
	public List<Todo> getTodos(){
		
		String sql = "select id, todo, done from todos order by id desc";		
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper(Todo.class));
		
	}
	@Transactional
	public void insertTodo(String todo) {
		String sql = "insert into todos(todo,done) values (?,false)";
		jdbcTemplate.update(sql,todo);
	}
	@Transactional
	public void deleteTodo(Long id) {
		String sql = "delete from todos where id = ?";
		jdbcTemplate.update(sql,id);
	}
	@Transactional(readOnly = true)
	public Todo getTodo(Long id) {
		String sql = "select id, todo, done from todos where id = ?";
		return jdbcTemplate.queryForObject(sql,  new TodoMapper(),id);
	}
	@Transactional
	public int updateTodo(Todo todo) {
		String sql = "update todos set done = ? where id = ?";
		return jdbcTemplate.update(sql, todo.isDone(), todo.getId());
	}
	
	public static class TodoMapper implements RowMapper<Todo>{

		@Override
		public Todo mapRow(ResultSet rs, int rowNum) throws SQLException {
			Todo todo = new Todo();
			todo.setId(rs.getLong("id"));
			todo.setTodo(rs.getString("todo"));
			todo.setDone(rs.getBoolean("done"));
			return todo;
		}
		
	}
	
}
