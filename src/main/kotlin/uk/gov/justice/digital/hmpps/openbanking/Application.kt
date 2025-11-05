package uk.gov.justice.digital.hmpps.openbanking

import org.springframework.boot.runApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = ["uk.gov.justice.digital.hmpps.openbanking", "uk.gov.justice.digital.hmpps.openbanking.api", "uk.gov.justice.digital.hmpps.openbanking.model"])
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
