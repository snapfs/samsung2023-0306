package kr.co.samsung.todomvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
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
	
	public Todo getTodo(Long id) {
		String sql = "select id, todo, done from todos where id = ?";
		return jdbcTemplate.queryForObject(sql,  new TodoMapper(),id);
	}
	
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
