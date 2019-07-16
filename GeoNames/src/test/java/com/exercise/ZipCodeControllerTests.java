package com.exercise;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
public class ZipCodeControllerTests {
	private MockMvc mockMvc;

	@Test
	public void testZipCodeDetailsService() throws Exception {
		this.mockMvc.perform(get("/zip/07310")).andExpect(status().isOk());
	}

}
