package com.customerservice.customerserviceAPI;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class CustomerserviceApiApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void getCustomers() throws Exception {
		mockMvc.perform(get("/api/customers"))
				.andExpect(status().isOk());
				//.andExpect(content().)
	}
	@Test
	public void getCustomerByIDResponse() throws Exception {
		mockMvc.perform(get("/api/customers/41acbb7a-ebc8-40b7-8281-70635e3466b8"))
				.andExpect(status().isOk());
	}



}
