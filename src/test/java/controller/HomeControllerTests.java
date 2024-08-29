package controller;

import com.northcoders.drinksapi.controller.HomeController;
import netscape.javascript.JSObject;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

import static net.bytebuddy.matcher.ElementMatchers.is;

@AutoConfigureMockMvc
@SpringBootTest(classes = HomeController.class)
public class HomeControllerTests {

    @Autowired
    private MockMvc mockMvcController;

    @Test
    public void testGetHome() throws Exception {

        String expectedContent = "Welcome to the Drinks API!";

        this.mockMvcController.perform(
                        MockMvcRequestBuilders.get("/"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(expectedContent));
    }

    @Test
    public void testGetCoffeeLover() throws Exception {

        String expectedContent = "I love coffee!";

        this.mockMvcController.perform(
                        MockMvcRequestBuilders.get("/coffeelover"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(expectedContent));
    }

    @Test
    public void coffeeValid() throws Exception {

        this.mockMvcController.perform(
                        MockMvcRequestBuilders.get("/coffee")
                                .param("name", "cappuccino"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(1))
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value("cappuccino"));

    }

    @Test
    public void coffeeInvalid() throws Exception{
        this.mockMvcController.perform(
                        MockMvcRequestBuilders.get("/coffee"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(2))
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value("latte"));


    }

}