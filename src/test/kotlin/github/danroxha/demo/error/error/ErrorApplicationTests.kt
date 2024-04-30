package github.danroxha.demo.error.error

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.kafka.annotation.EnableKafka
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.kafka.test.context.EmbeddedKafka

@SpringBootTest
@EnableKafka
@EmbeddedKafka
class ErrorApplicationTests {
	@Autowired
	private lateinit var template: KafkaTemplate<String, Any>

	@Test
	fun contextLoads() {
		println("$template")
	}
}
