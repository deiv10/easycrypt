package it.davedella.easycrypt

import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertNotNull
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(classes = arrayOf(EasyCryptApplication::class),
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class EasyCryptApplicationTest {

    @Autowired
    lateinit var testRestTemplate: TestRestTemplate

    @Test
    fun whenCalled_shouldReturnStringRot13Encrypted() {
        val result = testRestTemplate
                // ...
                .getForEntity("/rot13/crypt", String::class.java)

        assertNotNull(result)
        assertEquals(result?.statusCode, HttpStatus.OK)
        assertEquals(result?.body, "uryyb jbeyq")
    }

    @Test
    fun whenCalled_shouldReturnStringRot13Decrypted() {
        val result = testRestTemplate
                // ...
                .getForEntity("/rot13/decrypt", String::class.java)

        assertNotNull(result)
        assertEquals(result?.statusCode, HttpStatus.OK)
        assertEquals(result?.body, "hello world")
    }
}