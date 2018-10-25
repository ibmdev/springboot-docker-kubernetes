package fr.sma.hello;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import org.springframework.beans.factory.annotation.Autowired;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class HelloControllerTest {

    @Autowired
    private MockMvc mvc;


    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void contextLoads() {
    }

    @Test
    public void index() throws Exception {
        mvc.perform(get("/")).andExpect(status().isOk()).andExpect(content().string("Hello World IF DockerEE"));
    }

    @Test
    public void helloworld()  throws Exception {

        mvc.perform(get("/docker/helloworld"))
                .andExpect(status().isOk())
                .andExpect(content().string("{\"nameApplication\":\"IN - SVC - Prototype1\"}"));
    }
}