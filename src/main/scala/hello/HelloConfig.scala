package hello

import org.springframework.context.annotation.Configuration
import org.springframework.boot.autoconfigure._
import org.springframework.context.annotation.ComponentScan
import org.springframework.boot._
import org.springframework.web.bind.annotation._
import org.springframework.stereotype._

/**
 * This config class will trigger Spring @annotation scanning and auto configure Spring context.
 *
 * @author saung
 * @since 1.0
 */
@Controller
@EnableAutoConfiguration
class HelloConfig {
	@RequestMapping(Array("/"))
	@ResponseBody
	def print() : String = {
		return "Hello World!"
	}
}