package lt.codeacademy.tadasproject;

import lt.codeacademy.tadasproject.controller.ProductController;
import lt.codeacademy.tadasproject.model.Product;
import lt.codeacademy.tadasproject.security.CustomUserDetailsService;
import lt.codeacademy.tadasproject.security.jwt.JwtProvider;
import lt.codeacademy.tadasproject.service.ProductService;
import lt.codeacademy.tadasproject.service.ProductServiceImpl;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDateTime;
import java.util.Arrays;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(ProductController.class)
public class ProductControllerTests {

    @MockBean
    ProductService productServiceImpl;

    @MockBean
    CustomUserDetailsService customUserDetailsService;

    @MockBean
    JwtProvider jwtProvider;

    @Autowired
    MockMvc mockMvc;

    @Test
    public void testProductReturnFromControllerJsonList() throws Exception {
        //"Citroen", "Auto rally", 12.99, LocalDateTime.now()
        Product product = new Product(); 
        product.setName("Citroen");
        product.setDescription("Auto Rally");
        product.setPrice(12.99);
        product.setCreateTime(LocalDateTime.now());
        List<Product> products = Arrays.asList(product);

        Mockito.when(productServiceImpl.findAllProducts()).thenReturn(products);

        mockMvc.perform(get("/api/product"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", Matchers.hasSize(1)))
                .andExpect(jsonPath("$[0].name", Matchers.is("Citroen")));
    }
}
