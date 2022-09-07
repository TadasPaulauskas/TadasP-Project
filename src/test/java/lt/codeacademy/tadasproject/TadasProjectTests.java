package lt.codeacademy.tadasproject;

import lt.codeacademy.tadasproject.controller.UserController;
import org.assertj.core.api.Assertions;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class TadasProjectTests {

	@Autowired
	UserController userController;

	@Test
	void contextLoads() {
		Assertions.assertThat(userController).isNotNull();
	}
}