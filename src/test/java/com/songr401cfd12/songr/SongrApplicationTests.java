package com.songr401cfd12.songr;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.autoconfigure.web.servlet.MockMvcAutoConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class SongrApplicationTests {
	@Autowired
	MockMvc mockMvc;

	@Test
	void testAlubmGet() throws Exception {
		mockMvc.perform(get("/albums"))
				.andDo(print())
				.andExpect(content().string(containsString("<legend>Add Album</legend>")))
				.andExpect(status().isOk());
	}

}
