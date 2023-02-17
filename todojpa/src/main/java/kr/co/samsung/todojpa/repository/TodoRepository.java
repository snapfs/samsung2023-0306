package kr.co.samsung.todojpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.samsung.todojpa.domain.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
