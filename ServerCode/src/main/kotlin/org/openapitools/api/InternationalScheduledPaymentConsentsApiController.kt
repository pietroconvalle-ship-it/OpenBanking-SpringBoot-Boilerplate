package org.openapitools.api

import org.openapitools.model.OBErrorResponse11
import org.openapitools.model.OBWriteFundsConfirmationResponse1
import org.openapitools.model.OBWriteInternationalScheduledConsent5
import org.openapitools.model.OBWriteInternationalScheduledConsentResponse6
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.enums.*
import io.swagger.v3.oas.annotations.media.*
import io.swagger.v3.oas.annotations.responses.*
import io.swagger.v3.oas.annotations.security.*
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size

import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
@RequestMapping("\${api.base-path:/open-banking/v4.0/aisp}")
class InternationalScheduledPaymentConsentsApiController() {

    @Operation(
        summary = "Create International Scheduled Payment Consents",
        operationId = "createInternationalScheduledPaymentConsents",
        description = """""",
        responses = [
            ApiResponse(responseCode = "201", description = "International Scheduled Payment Consents Created", content = [Content(schema = Schema(implementation = OBWriteInternationalScheduledConsentResponse6::class))]),
            ApiResponse(responseCode = "400", description = "Bad request", content = [Content(schema = Schema(implementation = OBErrorResponse11::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized"),
            ApiResponse(responseCode = "403", description = "Forbidden", content = [Content(schema = Schema(implementation = OBErrorResponse11::class))]),
            ApiResponse(responseCode = "404", description = "Not found"),
            ApiResponse(responseCode = "405", description = "Method Not Allowed"),
            ApiResponse(responseCode = "406", description = "Not Acceptable"),
            ApiResponse(responseCode = "409", description = "Conflict", content = [Content(schema = Schema(implementation = OBErrorResponse11::class))]),
            ApiResponse(responseCode = "415", description = "Unsupported Media Type"),
            ApiResponse(responseCode = "429", description = "Too Many Requests"),
            ApiResponse(responseCode = "500", description = "Internal Server Error", content = [Content(schema = Schema(implementation = OBErrorResponse11::class))]) ],
        security = [ SecurityRequirement(name = "TPPOAuth2Security", scopes = [  ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/international-scheduled-payment-consents"],
        produces = ["application/json; charset=utf-8", "application/json", "application/jose+jwe"],
        consumes = ["application/json; charset=utf-8", "application/json", "application/jose+jwe"]
    )
    fun createInternationalScheduledPaymentConsents(@Parameter(description = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750", `in` = ParameterIn.HEADER, required = true) @RequestHeader(value = "Authorization", required = true) authorization: kotlin.String,@Pattern(regexp="^(?!\\s)(.*)(\\S)$") @Size(max=40) @Parameter(description = "Every request will be processed only once per x-idempotency-key.  The Idempotency Key will be valid for 24 hours. ", `in` = ParameterIn.HEADER, required = true) @RequestHeader(value = "x-idempotency-key", required = true) xIdempotencyKey: kotlin.String,@Parameter(description = "A detached JWS signature of the body of the payload.", `in` = ParameterIn.HEADER, required = true) @RequestHeader(value = "x-jws-signature", required = true) xJwsSignature: kotlin.String,@Parameter(description = "Default", required = true) @Valid @RequestBody obWriteInternationalScheduledConsent5: OBWriteInternationalScheduledConsent5,@Pattern(regexp="^(Mon|Tue|Wed|Thu|Fri|Sat|Sun), \\d{2} (Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) \\d{4} \\d{2}:\\d{2}:\\d{2} (GMT|UTC)$") @Parameter(description = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-auth-date", required = false) xFapiAuthDate: kotlin.String?,@Parameter(description = "The PSU's IP address if the PSU is currently logged in with the TPP.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-customer-ip-address", required = false) xFapiCustomerIpAddress: kotlin.String?,@Parameter(description = "An RFC4122 UID used as a correlation id.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-interaction-id", required = false) xFapiInteractionId: kotlin.String?,@Parameter(description = "Indicates the user-agent that the PSU is using.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-customer-user-agent", required = false) xCustomerUserAgent: kotlin.String?): ResponseEntity<OBWriteInternationalScheduledConsentResponse6> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get International Scheduled Payment Consents",
        operationId = "getInternationalScheduledPaymentConsentsConsentId",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "International Scheduled Payment Consents Read", content = [Content(schema = Schema(implementation = OBWriteInternationalScheduledConsentResponse6::class))]),
            ApiResponse(responseCode = "400", description = "Bad request", content = [Content(schema = Schema(implementation = OBErrorResponse11::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized"),
            ApiResponse(responseCode = "403", description = "Forbidden", content = [Content(schema = Schema(implementation = OBErrorResponse11::class))]),
            ApiResponse(responseCode = "404", description = "Not found"),
            ApiResponse(responseCode = "405", description = "Method Not Allowed"),
            ApiResponse(responseCode = "406", description = "Not Acceptable"),
            ApiResponse(responseCode = "429", description = "Too Many Requests"),
            ApiResponse(responseCode = "500", description = "Internal Server Error", content = [Content(schema = Schema(implementation = OBErrorResponse11::class))]) ],
        security = [ SecurityRequirement(name = "TPPOAuth2Security", scopes = [  ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/international-scheduled-payment-consents/{ConsentId}"],
        produces = ["application/json; charset=utf-8", "application/json", "application/jose+jwe"]
    )
    fun getInternationalScheduledPaymentConsentsConsentId(@Parameter(description = "ConsentId", required = true) @PathVariable("ConsentId") consentId: kotlin.String,@Parameter(description = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750", `in` = ParameterIn.HEADER, required = true) @RequestHeader(value = "Authorization", required = true) authorization: kotlin.String,@Pattern(regexp="^(Mon|Tue|Wed|Thu|Fri|Sat|Sun), \\d{2} (Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) \\d{4} \\d{2}:\\d{2}:\\d{2} (GMT|UTC)$") @Parameter(description = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-auth-date", required = false) xFapiAuthDate: kotlin.String?,@Parameter(description = "The PSU's IP address if the PSU is currently logged in with the TPP.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-customer-ip-address", required = false) xFapiCustomerIpAddress: kotlin.String?,@Parameter(description = "An RFC4122 UID used as a correlation id.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-interaction-id", required = false) xFapiInteractionId: kotlin.String?,@Parameter(description = "Indicates the user-agent that the PSU is using.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-customer-user-agent", required = false) xCustomerUserAgent: kotlin.String?): ResponseEntity<OBWriteInternationalScheduledConsentResponse6> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get International Scheduled Payment Consents Funds Confirmation",
        operationId = "getInternationalScheduledPaymentConsentsConsentIdFundsConfirmation",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "International Scheduled Payment Consents Read", content = [Content(schema = Schema(implementation = OBWriteFundsConfirmationResponse1::class))]),
            ApiResponse(responseCode = "400", description = "Bad request", content = [Content(schema = Schema(implementation = OBErrorResponse11::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized"),
            ApiResponse(responseCode = "403", description = "Forbidden", content = [Content(schema = Schema(implementation = OBErrorResponse11::class))]),
            ApiResponse(responseCode = "404", description = "Not found"),
            ApiResponse(responseCode = "405", description = "Method Not Allowed"),
            ApiResponse(responseCode = "406", description = "Not Acceptable"),
            ApiResponse(responseCode = "429", description = "Too Many Requests"),
            ApiResponse(responseCode = "500", description = "Internal Server Error", content = [Content(schema = Schema(implementation = OBErrorResponse11::class))]) ],
        security = [ SecurityRequirement(name = "PSUOAuth2Security", scopes = [  ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/international-scheduled-payment-consents/{ConsentId}/funds-confirmation"],
        produces = ["application/json; charset=utf-8", "application/json", "application/jose+jwe"]
    )
    fun getInternationalScheduledPaymentConsentsConsentIdFundsConfirmation(@Parameter(description = "ConsentId", required = true) @PathVariable("ConsentId") consentId: kotlin.String,@Parameter(description = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750", `in` = ParameterIn.HEADER, required = true) @RequestHeader(value = "Authorization", required = true) authorization: kotlin.String,@Pattern(regexp="^(Mon|Tue|Wed|Thu|Fri|Sat|Sun), \\d{2} (Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) \\d{4} \\d{2}:\\d{2}:\\d{2} (GMT|UTC)$") @Parameter(description = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-auth-date", required = false) xFapiAuthDate: kotlin.String?,@Parameter(description = "The PSU's IP address if the PSU is currently logged in with the TPP.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-customer-ip-address", required = false) xFapiCustomerIpAddress: kotlin.String?,@Parameter(description = "An RFC4122 UID used as a correlation id.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-interaction-id", required = false) xFapiInteractionId: kotlin.String?,@Parameter(description = "Indicates the user-agent that the PSU is using.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-customer-user-agent", required = false) xCustomerUserAgent: kotlin.String?): ResponseEntity<OBWriteFundsConfirmationResponse1> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
