package com.evernota;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


import com.evernota.controllers.ContaController;
import com.evernota.models.Usuario;
import com.evernota.repositories.UsuarioRepository;

//import org.junit.Test;
import org.hamcrest.Matchers;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest {

	@Mock
	private UsuarioRepository usuarioRepository;

	@Autowired
	private ContaController contaController;

	@Autowired
	private MockMvc mockMvc;

	@org.junit.jupiter.api.Test
	public void contexLoads() throws Exception {
		assertThat(contaController).isNotNull();
	}

	 @Test
	 public void TestLoginPage() throws Exception {
	 	mockMvc.perform(get("/login"))
	 		.andDo(print())
	 		.andExpect(status().isOk())
	 		.andExpect(content().string(containsString("Gerenciador de tarefas")));
	 }

	@Test
	public void testNewUsuario() throws Exception {

		mockMvc.perform(get("/registration"))
			.andExpect(status().isOk())
			.andExpect(view().name("conta/registrar"))
			.andExpect(model().attribute("usuario", Matchers.instanceOf(Usuario.class)));
	}

}