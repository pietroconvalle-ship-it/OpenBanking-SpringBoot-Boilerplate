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
import uk.gov.justice.digital.hmpps.openbanking.model.OBDomesticVRPConsentRequest
import uk.gov.justice.digital.hmpps.openbanking.model.OBDomesticVRPConsentResponse
import uk.gov.justice.digital.hmpps.openbanking.model.OBErrorResponse14
import uk.gov.justice.digital.hmpps.openbanking.model.OBVRPFundsConfirmationRequest
import uk.gov.justice.digital.hmpps.openbanking.model.OBVRPFundsConfirmationResponse

@RestController
@Validated
@RequestMapping("\${api.base-path:/open-banking/v4.0/aisp}")
class DomesticVrpConsentsApiController {

  @Operation(
    summary = "Delete a domestic VRP",
    operationId = "domesticVrpConsentsDelete",
    description = """Delete a domestic VRP""",
    responses = [
      ApiResponse(responseCode = "204", description = "delete successful"),
      ApiResponse(responseCode = "400", description = "Bad request", content = [Content(schema = Schema(implementation = OBErrorResponse14::class))]),
      ApiResponse(responseCode = "401", description = "Unauthorized"),
      ApiResponse(responseCode = "403", description = "Forbidden", content = [Content(schema = Schema(implementation = OBErrorResponse14::class))]),
      ApiResponse(responseCode = "405", description = "Method Not Allowed"),
      ApiResponse(responseCode = "406", description = "Not Acceptable"),
      ApiResponse(responseCode = "415", description = "Unsupported Media Type"),
      ApiResponse(responseCode = "429", description = "Too Many Requests"),
      ApiResponse(responseCode = "500", description = "Internal Server Error", content = [Content(schema = Schema(implementation = OBErrorResponse14::class))]),
    ],
    security = [ SecurityRequirement(name = "TPPOAuth2Security", scopes = [ ]) ],
  )
  @RequestMapping(
    method = [RequestMethod.DELETE],
    value = ["/domestic-vrp-consents/{ConsentId}"],
    produces = ["application/json; charset=utf-8", "application/json", "application/jose+jwe"],
  )
  fun domesticVrpConsentsDelete(@Parameter(description = "ConsentId", required = true) @PathVariable("ConsentId") consentId: kotlin.String, @Parameter(description = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750", `in` = ParameterIn.HEADER, required = true) @RequestHeader(value = "Authorization", required = true) authorization: kotlin.String, @Pattern(regexp = "^(Mon|Tue|Wed|Thu|Fri|Sat|Sun), \\d{2} (Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) \\d{4} \\d{2}:\\d{2}:\\d{2} (GMT|UTC)$") @Parameter(description = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-auth-date", required = false) xFapiAuthDate: kotlin.String?, @Parameter(description = "The PSU's IP address if the PSU is currently logged in with the TPP.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-customer-ip-address", required = false) xFapiCustomerIpAddress: kotlin.String?, @Parameter(description = "An RFC4122 UID used as a correlation id.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-interaction-id", required = false) xFapiInteractionId: kotlin.String?, @Parameter(description = "Indicates the user-agent that the PSU is using.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-customer-user-agent", required = false) xCustomerUserAgent: kotlin.String?): ResponseEntity<Unit> = ResponseEntity(HttpStatus.NOT_IMPLEMENTED)

  @Operation(
    summary = "Confirm availability of funds for a VRP",
    operationId = "domesticVrpConsentsFundsConfirmation",
    description = """Confirm availability of funds for a VRP""",
    responses = [
      ApiResponse(responseCode = "201", description = "Default response", content = [Content(schema = Schema(implementation = OBVRPFundsConfirmationResponse::class))]),
      ApiResponse(responseCode = "400", description = "Bad request", content = [Content(schema = Schema(implementation = OBErrorResponse14::class))]),
      ApiResponse(responseCode = "401", description = "Unauthorized"),
      ApiResponse(responseCode = "403", description = "Forbidden", content = [Content(schema = Schema(implementation = OBErrorResponse14::class))]),
      ApiResponse(responseCode = "405", description = "Method Not Allowed"),
      ApiResponse(responseCode = "406", description = "Not Acceptable"),
      ApiResponse(responseCode = "415", description = "Unsupported Media Type"),
      ApiResponse(responseCode = "429", description = "Too Many Requests"),
      ApiResponse(responseCode = "500", description = "Internal Server Error", content = [Content(schema = Schema(implementation = OBErrorResponse14::class))]),
    ],
    security = [ SecurityRequirement(name = "TPPOAuth2Security", scopes = [ ]) ],
  )
  @RequestMapping(
    method = [RequestMethod.POST],
    value = ["/domestic-vrp-consents/{ConsentId}/funds-confirmation"],
    produces = ["application/json; charset=utf-8", "application/json", "application/jose+jwe"],
    consumes = ["application/json; charset=utf-8", "application/json", "application/jose+jwe"],
  )
  fun domesticVrpConsentsFundsConfirmation(@Parameter(description = "ConsentId", required = true) @PathVariable("ConsentId") consentId: kotlin.String, @Parameter(description = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750", `in` = ParameterIn.HEADER, required = true) @RequestHeader(value = "Authorization", required = true) authorization: kotlin.String, @Parameter(description = "A detached JWS signature of the body of the payload.", `in` = ParameterIn.HEADER, required = true) @RequestHeader(value = "x-jws-signature", required = true) xJwsSignature: kotlin.String, @Parameter(description = "Default", required = true) @Valid @RequestBody obVRPFundsConfirmationRequest: OBVRPFundsConfirmationRequest, @Pattern(regexp = "^(Mon|Tue|Wed|Thu|Fri|Sat|Sun), \\d{2} (Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) \\d{4} \\d{2}:\\d{2}:\\d{2} (GMT|UTC)$") @Parameter(description = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-auth-date", required = false) xFapiAuthDate: kotlin.String?, @Parameter(description = "The PSU's IP address if the PSU is currently logged in with the TPP.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-customer-ip-address", required = false) xFapiCustomerIpAddress: kotlin.String?, @Parameter(description = "An RFC4122 UID used as a correlation id.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-interaction-id", required = false) xFapiInteractionId: kotlin.String?, @Parameter(description = "Indicates the user-agent that the PSU is using.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-customer-user-agent", required = false) xCustomerUserAgent: kotlin.String?): ResponseEntity<OBVRPFundsConfirmationResponse> = ResponseEntity(HttpStatus.NOT_IMPLEMENTED)

  @Operation(
    summary = "Retrieve a domestic VRP consent",
    operationId = "domesticVrpConsentsGet",
    description = """Retrieve a domestic VRP consent""",
    responses = [
      ApiResponse(responseCode = "200", description = "Default response", content = [Content(schema = Schema(implementation = OBDomesticVRPConsentResponse::class))]),
      ApiResponse(responseCode = "400", description = "Bad request", content = [Content(schema = Schema(implementation = OBErrorResponse14::class))]),
      ApiResponse(responseCode = "401", description = "Unauthorized"),
      ApiResponse(responseCode = "403", description = "Forbidden", content = [Content(schema = Schema(implementation = OBErrorResponse14::class))]),
      ApiResponse(responseCode = "405", description = "Method Not Allowed"),
      ApiResponse(responseCode = "406", description = "Not Acceptable"),
      ApiResponse(responseCode = "415", description = "Unsupported Media Type"),
      ApiResponse(responseCode = "429", description = "Too Many Requests"),
      ApiResponse(responseCode = "500", description = "Internal Server Error", content = [Content(schema = Schema(implementation = OBErrorResponse14::class))]),
    ],
    security = [ SecurityRequirement(name = "TPPOAuth2Security", scopes = [ ]) ],
  )
  @RequestMapping(
    method = [RequestMethod.GET],
    value = ["/domestic-vrp-consents/{ConsentId}"],
    produces = ["application/json; charset=utf-8", "application/json", "application/jose+jwe"],
  )
  fun domesticVrpConsentsGet(@Parameter(description = "ConsentId", required = true) @PathVariable("ConsentId") consentId: kotlin.String, @Parameter(description = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750", `in` = ParameterIn.HEADER, required = true) @RequestHeader(value = "Authorization", required = true) authorization: kotlin.String, @Pattern(regexp = "^(Mon|Tue|Wed|Thu|Fri|Sat|Sun), \\d{2} (Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) \\d{4} \\d{2}:\\d{2}:\\d{2} (GMT|UTC)$") @Parameter(description = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-auth-date", required = false) xFapiAuthDate: kotlin.String?, @Parameter(description = "The PSU's IP address if the PSU is currently logged in with the TPP.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-customer-ip-address", required = false) xFapiCustomerIpAddress: kotlin.String?, @Parameter(description = "An RFC4122 UID used as a correlation id.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-interaction-id", required = false) xFapiInteractionId: kotlin.String?, @Parameter(description = "Indicates the user-agent that the PSU is using.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-customer-user-agent", required = false) xCustomerUserAgent: kotlin.String?): ResponseEntity<OBDomesticVRPConsentResponse> = ResponseEntity(HttpStatus.NOT_IMPLEMENTED)

  @Operation(
    summary = "Update a domestic VRP consent - only to be used for version migrations",
    operationId = "domesticVrpConsentsPatch",
    description = """Update a domestic VRP consent by submitting a JSON Patch payload - only to be used for version migrations""",
    responses = [
      ApiResponse(responseCode = "200", description = "Default response", content = [Content(schema = Schema(implementation = OBDomesticVRPConsentResponse::class))]),
      ApiResponse(responseCode = "400", description = "Bad request", content = [Content(schema = Schema(implementation = OBErrorResponse14::class))]),
      ApiResponse(responseCode = "401", description = "Unauthorized"),
      ApiResponse(responseCode = "403", description = "Forbidden", content = [Content(schema = Schema(implementation = OBErrorResponse14::class))]),
      ApiResponse(responseCode = "405", description = "Method Not Allowed"),
      ApiResponse(responseCode = "406", description = "Not Acceptable"),
      ApiResponse(responseCode = "409", description = "Conflict", content = [Content(schema = Schema(implementation = OBErrorResponse14::class))]),
      ApiResponse(responseCode = "415", description = "Unsupported Media Type"),
      ApiResponse(responseCode = "429", description = "Too Many Requests"),
      ApiResponse(responseCode = "500", description = "Internal Server Error", content = [Content(schema = Schema(implementation = OBErrorResponse14::class))]),
    ],
    security = [ SecurityRequirement(name = "TPPOAuth2Security", scopes = [ ]) ],
  )
  @RequestMapping(
    method = [RequestMethod.PATCH],
    value = ["/domestic-vrp-consents/{ConsentId}"],
    produces = ["application/json; charset=utf-8", "application/json", "application/jose+jwe"],
    consumes = ["application/json-patch+json"],
  )
  fun domesticVrpConsentsPatch(@Parameter(description = "ConsentId", required = true) @PathVariable("ConsentId") consentId: kotlin.String, @Parameter(description = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750", `in` = ParameterIn.HEADER, required = true) @RequestHeader(value = "Authorization", required = true) authorization: kotlin.String, @Pattern(regexp = "^(?!\\s)(.*)(\\S)$") @Size(max = 40) @Parameter(description = "Every request will be processed only once per x-idempotency-key.  The Idempotency Key will be valid for 24 hours. ", `in` = ParameterIn.HEADER, required = true) @RequestHeader(value = "x-idempotency-key", required = true) xIdempotencyKey: kotlin.String, @Parameter(description = "A detached JWS signature of the body of the payload.", `in` = ParameterIn.HEADER, required = true) @RequestHeader(value = "x-jws-signature", required = true) xJwsSignature: kotlin.String, @Parameter(description = "Default", required = true) @Valid @RequestBody body: kotlin.String, @Pattern(regexp = "^(Mon|Tue|Wed|Thu|Fri|Sat|Sun), \\d{2} (Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) \\d{4} \\d{2}:\\d{2}:\\d{2} (GMT|UTC)$") @Parameter(description = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-auth-date", required = false) xFapiAuthDate: kotlin.String?, @Parameter(description = "The PSU's IP address if the PSU is currently logged in with the TPP.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-customer-ip-address", required = false) xFapiCustomerIpAddress: kotlin.String?, @Parameter(description = "An RFC4122 UID used as a correlation id.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-interaction-id", required = false) xFapiInteractionId: kotlin.String?, @Parameter(description = "Indicates the user-agent that the PSU is using.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-customer-user-agent", required = false) xCustomerUserAgent: kotlin.String?): ResponseEntity<OBDomesticVRPConsentResponse> = ResponseEntity(HttpStatus.NOT_IMPLEMENTED)

  @Operation(
    summary = "Create a domestic VRP consent",
    operationId = "domesticVrpConsentsPost",
    description = """Create a domestic VRP consent""",
    responses = [
      ApiResponse(responseCode = "201", description = "Default response", content = [Content(schema = Schema(implementation = OBDomesticVRPConsentResponse::class))]),
      ApiResponse(responseCode = "400", description = "Bad request", content = [Content(schema = Schema(implementation = OBErrorResponse14::class))]),
      ApiResponse(responseCode = "401", description = "Unauthorized"),
      ApiResponse(responseCode = "403", description = "Forbidden", content = [Content(schema = Schema(implementation = OBErrorResponse14::class))]),
      ApiResponse(responseCode = "405", description = "Method Not Allowed"),
      ApiResponse(responseCode = "406", description = "Not Acceptable"),
      ApiResponse(responseCode = "409", description = "Conflict", content = [Content(schema = Schema(implementation = OBErrorResponse14::class))]),
      ApiResponse(responseCode = "415", description = "Unsupported Media Type"),
      ApiResponse(responseCode = "429", description = "Too Many Requests"),
      ApiResponse(responseCode = "500", description = "Internal Server Error", content = [Content(schema = Schema(implementation = OBErrorResponse14::class))]),
    ],
    security = [ SecurityRequirement(name = "TPPOAuth2Security", scopes = [ ]) ],
  )
  @RequestMapping(
    method = [RequestMethod.POST],
    value = ["/domestic-vrp-consents"],
    produces = ["application/json; charset=utf-8", "application/json", "application/jose+jwe"],
    consumes = ["application/json; charset=utf-8", "application/json", "application/jose+jwe"],
  )
  fun domesticVrpConsentsPost(@Parameter(description = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750", `in` = ParameterIn.HEADER, required = true) @RequestHeader(value = "Authorization", required = true) authorization: kotlin.String, @Pattern(regexp = "^(?!\\s)(.*)(\\S)$") @Size(max = 40) @Parameter(description = "Every request will be processed only once per x-idempotency-key.  The Idempotency Key will be valid for 24 hours. ", `in` = ParameterIn.HEADER, required = true) @RequestHeader(value = "x-idempotency-key", required = true) xIdempotencyKey: kotlin.String, @Parameter(description = "A detached JWS signature of the body of the payload.", `in` = ParameterIn.HEADER, required = true) @RequestHeader(value = "x-jws-signature", required = true) xJwsSignature: kotlin.String, @Parameter(description = "Default", required = true) @Valid @RequestBody obDomesticVRPConsentRequest: OBDomesticVRPConsentRequest, @Pattern(regexp = "^(Mon|Tue|Wed|Thu|Fri|Sat|Sun), \\d{2} (Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) \\d{4} \\d{2}:\\d{2}:\\d{2} (GMT|UTC)$") @Parameter(description = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-auth-date", required = false) xFapiAuthDate: kotlin.String?, @Parameter(description = "The PSU's IP address if the PSU is currently logged in with the TPP.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-customer-ip-address", required = false) xFapiCustomerIpAddress: kotlin.String?, @Parameter(description = "An RFC4122 UID used as a correlation id.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-interaction-id", required = false) xFapiInteractionId: kotlin.String?, @Parameter(description = "Indicates the user-agent that the PSU is using.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-customer-user-agent", required = false) xCustomerUserAgent: kotlin.String?): ResponseEntity<OBDomesticVRPConsentResponse> = ResponseEntity(HttpStatus.NOT_IMPLEMENTED)

  @Operation(
    summary = "Update a domestic VRP consent - only to be used for version migrations",
    operationId = "domesticVrpConsentsPut",
    description = """Update a domestic VRP consent by submitting a full consent resource body - only to be used for version migrations""",
    responses = [
      ApiResponse(responseCode = "200", description = "Default response", content = [Content(schema = Schema(implementation = OBDomesticVRPConsentResponse::class))]),
      ApiResponse(responseCode = "400", description = "Bad request", content = [Content(schema = Schema(implementation = OBErrorResponse14::class))]),
      ApiResponse(responseCode = "401", description = "Unauthorized"),
      ApiResponse(responseCode = "403", description = "Forbidden", content = [Content(schema = Schema(implementation = OBErrorResponse14::class))]),
      ApiResponse(responseCode = "405", description = "Method Not Allowed"),
      ApiResponse(responseCode = "406", description = "Not Acceptable"),
      ApiResponse(responseCode = "409", description = "Conflict", content = [Content(schema = Schema(implementation = OBErrorResponse14::class))]),
      ApiResponse(responseCode = "415", description = "Unsupported Media Type"),
      ApiResponse(responseCode = "429", description = "Too Many Requests"),
      ApiResponse(responseCode = "500", description = "Internal Server Error", content = [Content(schema = Schema(implementation = OBErrorResponse14::class))]),
    ],
    security = [ SecurityRequirement(name = "TPPOAuth2Security", scopes = [ ]) ],
  )
  @RequestMapping(
    method = [RequestMethod.PUT],
    value = ["/domestic-vrp-consents/{ConsentId}"],
    produces = ["application/json; charset=utf-8", "application/json", "application/jose+jwe"],
    consumes = ["application/json; charset=utf-8", "application/json", "application/jose+jwe"],
  )
  fun domesticVrpConsentsPut(@Parameter(description = "ConsentId", required = true) @PathVariable("ConsentId") consentId: kotlin.String, @Parameter(description = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750", `in` = ParameterIn.HEADER, required = true) @RequestHeader(value = "Authorization", required = true) authorization: kotlin.String, @Pattern(regexp = "^(?!\\s)(.*)(\\S)$") @Size(max = 40) @Parameter(description = "Every request will be processed only once per x-idempotency-key.  The Idempotency Key will be valid for 24 hours. ", `in` = ParameterIn.HEADER, required = true) @RequestHeader(value = "x-idempotency-key", required = true) xIdempotencyKey: kotlin.String, @Parameter(description = "A detached JWS signature of the body of the payload.", `in` = ParameterIn.HEADER, required = true) @RequestHeader(value = "x-jws-signature", required = true) xJwsSignature: kotlin.String, @Parameter(description = "Default", required = true) @Valid @RequestBody obDomesticVRPConsentRequest: OBDomesticVRPConsentRequest, @Pattern(regexp = "^(Mon|Tue|Wed|Thu|Fri|Sat|Sun), \\d{2} (Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) \\d{4} \\d{2}:\\d{2}:\\d{2} (GMT|UTC)$") @Parameter(description = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-auth-date", required = false) xFapiAuthDate: kotlin.String?, @Parameter(description = "The PSU's IP address if the PSU is currently logged in with the TPP.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-customer-ip-address", required = false) xFapiCustomerIpAddress: kotlin.String?, @Parameter(description = "An RFC4122 UID used as a correlation id.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-interaction-id", required = false) xFapiInteractionId: kotlin.String?, @Parameter(description = "Indicates the user-agent that the PSU is using.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-customer-user-agent", required = false) xCustomerUserAgent: kotlin.String?): ResponseEntity<OBDomesticVRPConsentResponse> = ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
}
