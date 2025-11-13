package uk.gov.justice.digital.hmpps.openbanking.api

import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.enums.*
import io.swagger.v3.oas.annotations.media.*
import io.swagger.v3.oas.annotations.responses.*
import io.swagger.v3.oas.annotations.security.*
import jakarta.validation.Valid
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*
import uk.gov.justice.digital.hmpps.openbanking.model.OBErrorResponse11
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteInternational3
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteInternationalResponse5
import uk.gov.justice.digital.hmpps.openbanking.model.OBWritePaymentDetailsResponse1

@RestController
@Validated
@RequestMapping("\${api.base-path:/open-banking/v4.0/aisp}")
class InternationalPaymentsApiController {

  @Operation(
    summary = "Create International Payments",
    operationId = "createInternationalPayments",
    description = """""",
    responses = [
      ApiResponse(responseCode = "201", description = "International Payments Created", content = [Content(schema = Schema(implementation = OBWriteInternationalResponse5::class))]),
      ApiResponse(responseCode = "400", description = "Bad request", content = [Content(schema = Schema(implementation = OBErrorResponse11::class))]),
      ApiResponse(responseCode = "401", description = "Unauthorized"),
      ApiResponse(responseCode = "403", description = "Forbidden", content = [Content(schema = Schema(implementation = OBErrorResponse11::class))]),
      ApiResponse(responseCode = "404", description = "Not found"),
      ApiResponse(responseCode = "405", description = "Method Not Allowed"),
      ApiResponse(responseCode = "406", description = "Not Acceptable"),
      ApiResponse(responseCode = "415", description = "Unsupported Media Type"),
      ApiResponse(responseCode = "429", description = "Too Many Requests"),
      ApiResponse(responseCode = "500", description = "Internal Server Error", content = [Content(schema = Schema(implementation = OBErrorResponse11::class))]),
    ],
    security = [ SecurityRequirement(name = "PSUOAuth2Security", scopes = [ ]) ],
  )
  @RequestMapping(
    method = [RequestMethod.POST],
    value = ["/international-payments"],
    produces = ["application/json; charset=utf-8", "application/json", "application/jose+jwe"],
    consumes = ["application/json; charset=utf-8", "application/json", "application/jose+jwe"],
  )
  fun createInternationalPayments(@Parameter(description = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750", `in` = ParameterIn.HEADER, required = true) @RequestHeader(value = "Authorization", required = true) authorization: kotlin.String, @Pattern(regexp = "^(?!\\s)(.*)(\\S)$") @Size(max = 40) @Parameter(description = "Every request will be processed only once per x-idempotency-key.  The Idempotency Key will be valid for 24 hours. ", `in` = ParameterIn.HEADER, required = true) @RequestHeader(value = "x-idempotency-key", required = true) xIdempotencyKey: kotlin.String, @Parameter(description = "A detached JWS signature of the body of the payload.", `in` = ParameterIn.HEADER, required = true) @RequestHeader(value = "x-jws-signature", required = true) xJwsSignature: kotlin.String, @Parameter(description = "Default", required = true) @Valid @RequestBody obWriteInternational3: OBWriteInternational3, @Pattern(regexp = "^(Mon|Tue|Wed|Thu|Fri|Sat|Sun), \\d{2} (Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) \\d{4} \\d{2}:\\d{2}:\\d{2} (GMT|UTC)$") @Parameter(description = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-auth-date", required = false) xFapiAuthDate: kotlin.String?, @Parameter(description = "The PSU's IP address if the PSU is currently logged in with the TPP.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-customer-ip-address", required = false) xFapiCustomerIpAddress: kotlin.String?, @Parameter(description = "An RFC4122 UID used as a correlation id.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-interaction-id", required = false) xFapiInteractionId: kotlin.String?, @Parameter(description = "Indicates the user-agent that the PSU is using.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-customer-user-agent", required = false) xCustomerUserAgent: kotlin.String?): ResponseEntity<OBWriteInternationalResponse5> = ResponseEntity(HttpStatus.NOT_IMPLEMENTED)

  @Operation(
    summary = "Get International Payments",
    operationId = "getInternationalPaymentsInternationalPaymentId",
    description = """""",
    responses = [
      ApiResponse(responseCode = "200", description = "International Payments Read", content = [Content(schema = Schema(implementation = OBWriteInternationalResponse5::class))]),
      ApiResponse(responseCode = "400", description = "Bad request", content = [Content(schema = Schema(implementation = OBErrorResponse11::class))]),
      ApiResponse(responseCode = "401", description = "Unauthorized"),
      ApiResponse(responseCode = "403", description = "Forbidden", content = [Content(schema = Schema(implementation = OBErrorResponse11::class))]),
      ApiResponse(responseCode = "404", description = "Not found"),
      ApiResponse(responseCode = "405", description = "Method Not Allowed"),
      ApiResponse(responseCode = "406", description = "Not Acceptable"),
      ApiResponse(responseCode = "429", description = "Too Many Requests"),
      ApiResponse(responseCode = "500", description = "Internal Server Error", content = [Content(schema = Schema(implementation = OBErrorResponse11::class))]),
    ],
    security = [ SecurityRequirement(name = "TPPOAuth2Security", scopes = [ ]) ],
  )
  @RequestMapping(
    method = [RequestMethod.GET],
    value = ["/international-payments/{InternationalPaymentId}"],
    produces = ["application/json; charset=utf-8", "application/json", "application/jose+jwe"],
  )
  fun getInternationalPaymentsInternationalPaymentId(@Parameter(description = "InternationalPaymentId", required = true) @PathVariable("InternationalPaymentId") internationalPaymentId: kotlin.String, @Parameter(description = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750", `in` = ParameterIn.HEADER, required = true) @RequestHeader(value = "Authorization", required = true) authorization: kotlin.String, @Pattern(regexp = "^(Mon|Tue|Wed|Thu|Fri|Sat|Sun), \\d{2} (Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) \\d{4} \\d{2}:\\d{2}:\\d{2} (GMT|UTC)$") @Parameter(description = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-auth-date", required = false) xFapiAuthDate: kotlin.String?, @Parameter(description = "The PSU's IP address if the PSU is currently logged in with the TPP.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-customer-ip-address", required = false) xFapiCustomerIpAddress: kotlin.String?, @Parameter(description = "An RFC4122 UID used as a correlation id.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-interaction-id", required = false) xFapiInteractionId: kotlin.String?, @Parameter(description = "Indicates the user-agent that the PSU is using.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-customer-user-agent", required = false) xCustomerUserAgent: kotlin.String?): ResponseEntity<OBWriteInternationalResponse5> = ResponseEntity(HttpStatus.NOT_IMPLEMENTED)

  @Operation(
    summary = "Get Payment Details",
    operationId = "getInternationalPaymentsInternationalPaymentIdPaymentDetails",
    description = """""",
    responses = [
      ApiResponse(responseCode = "200", description = "Payment Details Read", content = [Content(schema = Schema(implementation = OBWritePaymentDetailsResponse1::class))]),
      ApiResponse(responseCode = "400", description = "Bad request", content = [Content(schema = Schema(implementation = OBErrorResponse11::class))]),
      ApiResponse(responseCode = "401", description = "Unauthorized"),
      ApiResponse(responseCode = "403", description = "Forbidden", content = [Content(schema = Schema(implementation = OBErrorResponse11::class))]),
      ApiResponse(responseCode = "404", description = "Not found"),
      ApiResponse(responseCode = "405", description = "Method Not Allowed"),
      ApiResponse(responseCode = "406", description = "Not Acceptable"),
      ApiResponse(responseCode = "429", description = "Too Many Requests"),
      ApiResponse(responseCode = "500", description = "Internal Server Error", content = [Content(schema = Schema(implementation = OBErrorResponse11::class))]),
    ],
    security = [ SecurityRequirement(name = "TPPOAuth2Security", scopes = [ ]) ],
  )
  @RequestMapping(
    method = [RequestMethod.GET],
    value = ["/international-payments/{InternationalPaymentId}/payment-details"],
    produces = ["application/json; charset=utf-8", "application/json", "application/jose+jwe"],
  )
  fun getInternationalPaymentsInternationalPaymentIdPaymentDetails(@Parameter(description = "InternationalPaymentId", required = true) @PathVariable("InternationalPaymentId") internationalPaymentId: kotlin.String, @Parameter(description = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750", `in` = ParameterIn.HEADER, required = true) @RequestHeader(value = "Authorization", required = true) authorization: kotlin.String, @Pattern(regexp = "^(Mon|Tue|Wed|Thu|Fri|Sat|Sun), \\d{2} (Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) \\d{4} \\d{2}:\\d{2}:\\d{2} (GMT|UTC)$") @Parameter(description = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-auth-date", required = false) xFapiAuthDate: kotlin.String?, @Parameter(description = "The PSU's IP address if the PSU is currently logged in with the TPP.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-customer-ip-address", required = false) xFapiCustomerIpAddress: kotlin.String?, @Parameter(description = "An RFC4122 UID used as a correlation id.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-interaction-id", required = false) xFapiInteractionId: kotlin.String?, @Parameter(description = "Indicates the user-agent that the PSU is using.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-customer-user-agent", required = false) xCustomerUserAgent: kotlin.String?): ResponseEntity<OBWritePaymentDetailsResponse1> = ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
}
