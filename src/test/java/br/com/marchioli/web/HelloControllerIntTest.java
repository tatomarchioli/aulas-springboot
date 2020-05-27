package br.com.marchioli.web;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import br.com.marchioli.web.HelloController;



@RunWith(SpringRunner.class)
@WebMvcTest(HelloController.class)
public class HelloControllerIntTest {
 
  @Autowired
  private MockMvc mvc;
 
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testHello() throws Exception {
    mvc.perform(get("/")
      .accept(MediaType.APPLICATION_JSON))
      .andDo(print())
      .andExpect(status().isOk());
    }


}