package uk.gov.justice.digital.hmpps.openbanking.api

import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.enums.*
import io.swagger.v3.oas.annotations.media.*
import io.swagger.v3.oas.annotations.responses.*
import io.swagger.v3.oas.annotations.security.*
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
@Validated
@RequestMapping("\${api.base-path:/open-banking/v4.0/aisp}")
class EventNotificationsApiController {

  @Operation(
    summary = "Send an event notification",
    operationId = "createEventNotification",
    description = """""",
    responses = [
      ApiResponse(responseCode = "202", description = "Accepted"),
    ],
  )
  @RequestMapping(
    method = [RequestMethod.POST],
    value = ["/event-notifications"],
    consumes = ["application/jwt"],
  )
  fun createEventNotification(@Parameter(description = "The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB.", `in` = ParameterIn.HEADER, required = true) @RequestHeader(value = "x-fapi-financial-id", required = true) xFapiFinancialId: kotlin.String, @Parameter(description = "Create an Callback URI", required = true) @Valid @RequestBody body: kotlin.String, @Parameter(description = "An RFC4122 UID used as a correlation id.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-interaction-id", required = false) xFapiInteractionId: kotlin.String?): ResponseEntity<Unit> = ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
}
