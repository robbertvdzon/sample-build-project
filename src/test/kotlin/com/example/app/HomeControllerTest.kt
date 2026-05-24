package com.example.app

import org.hamcrest.Matchers.containsString
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

@SpringBootTest
@AutoConfigureMockMvc
class HomeControllerTest(@Autowired val mockMvc: MockMvc) {

    @Test
    fun `GET slash returns 200 with required content`() {
        mockMvc.get("/")
            .andExpect { status { isOk() } }
            .andExpect { content { string(containsString("Test web app")) } }
            .andExpect { content { string(containsString("dit is een test web applicatie")) } }
    }
}
