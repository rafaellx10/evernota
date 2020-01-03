package com.evernota;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.evernota.models.Tarefa;
import com.evernota.models.Usuario;

@DisplayName("Testes para os usuarios.")
public class UsuarioTest {
	
	@Test
	@DisplayName("Test para verificar se uma tarefa foi adicionado ao usuario correto.")
	void testAddTaskToEachUser() {
		Usuario user1 = new Usuario();
		
		user1.setId(1L);
		user1.setEmail("rafaell10@gmail.com");
		user1.setSenha("123456");
		
		Usuario user2 = new Usuario();
		
		user2.setId(1L);
		user2.setEmail("fernando@gmail.com");
		user2.setSenha("654321");
		
		Tarefa task1 = new Tarefa();
		task1.setId(1L);
		
		Tarefa task2 = new Tarefa();
		task1.setId(2L);
		
		List<Tarefa> list1 = new ArrayList<Tarefa>();
		user1.setTarefas(list1);
		
		List<Tarefa> list2 = new ArrayList<Tarefa>();
		user2.setTarefas(list2);
		
		
		user1.getTarefas().add(task1);
		
		user2.getTarefas().add(task2);
		
		assertAll(
				() -> assertEquals("rafaell10@gmail.com", user1.getEmail()),
				() -> assertEquals(task1, user1.getTarefas().get(0)),
				() -> assertEquals("fernando@gmail.com", user2.getEmail()),
				() -> assertEquals(task2, user2.getTarefas().get(0))
				);
		
	}
}
