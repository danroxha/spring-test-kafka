package github.danroxha.demo.error.error

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ErrorApplication

fun main(args: Array<String>) {
	runApplication<ErrorApplication>(*args)
}
