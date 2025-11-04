package uk.gov.justice.digital.hmpps.openbanking.api

import uk.gov.justice.digital.hmpps.openbanking.model.OBErrorResponse1
import uk.gov.justice.digital.hmpps.openbanking.model.OBErrorResponse12
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadConsent1
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadConsentResponse1
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
class AccountAccessConsentsApiController() {

    @Operation(
        summary = "Create Account Access Consents",
        operationId = "createAccountAccessConsents",
        description = """""",
        responses = [
            ApiResponse(responseCode = "201", description = "Account Access Consents Created", content = [Content(schema = Schema(implementation = OBReadConsentResponse1::class))]),
            ApiResponse(responseCode = "400", description = "Bad request", content = [Content(schema = Schema(implementation = OBErrorResponse1::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized"),
            ApiResponse(responseCode = "403", description = "Forbidden", content = [Content(schema = Schema(implementation = OBErrorResponse12::class))]),
            ApiResponse(responseCode = "405", description = "Method Not Allowed"),
            ApiResponse(responseCode = "406", description = "Not Acceptable"),
            ApiResponse(responseCode = "415", description = "Unsupported Media Type"),
            ApiResponse(responseCode = "429", description = "Too Many Requests"),
            ApiResponse(responseCode = "500", description = "Internal Server Error", content = [Content(schema = Schema(implementation = OBErrorResponse12::class))]) ],
        security = [ SecurityRequirement(name = "TPPOAuth2Security", scopes = [ "accounts" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/account-access-consents"],
        produces = ["application/json; charset=utf-8", "application/json", "application/jose+jwe"],
        consumes = ["application/json; charset=utf-8", "application/json", "application/jose+jwe"]
    )
    fun createAccountAccessConsents(@Parameter(description = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750", `in` = ParameterIn.HEADER, required = true) @RequestHeader(value = "Authorization", required = true) authorization: kotlin.String,@Parameter(description = "Default", required = true) @Valid @RequestBody obReadConsent1: OBReadConsent1,@Pattern(regexp="^(Mon|Tue|Wed|Thu|Fri|Sat|Sun), \\d{2} (Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) \\d{4} \\d{2}:\\d{2}:\\d{2} (GMT|UTC)$") @Parameter(description = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-auth-date", required = false) xFapiAuthDate: kotlin.String?,@Parameter(description = "The PSU's IP address if the PSU is currently logged in with the TPP.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-customer-ip-address", required = false) xFapiCustomerIpAddress: kotlin.String?,@Parameter(description = "An RFC4122 UID used as a correlation id.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-interaction-id", required = false) xFapiInteractionId: kotlin.String?,@Parameter(description = "Indicates the user-agent that the PSU is using.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-customer-user-agent", required = false) xCustomerUserAgent: kotlin.String?): ResponseEntity<OBReadConsentResponse1> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Account Access Consents",
        operationId = "deleteAccountAccessConsentsConsentId",
        description = """""",
        responses = [
            ApiResponse(responseCode = "204", description = "Account Access Consents Deleted"),
            ApiResponse(responseCode = "400", description = "Bad request", content = [Content(schema = Schema(implementation = OBErrorResponse1::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized"),
            ApiResponse(responseCode = "403", description = "Forbidden", content = [Content(schema = Schema(implementation = OBErrorResponse12::class))]),
            ApiResponse(responseCode = "405", description = "Method Not Allowed"),
            ApiResponse(responseCode = "406", description = "Not Acceptable"),
            ApiResponse(responseCode = "429", description = "Too Many Requests"),
            ApiResponse(responseCode = "500", description = "Internal Server Error", content = [Content(schema = Schema(implementation = OBErrorResponse12::class))]) ],
        security = [ SecurityRequirement(name = "TPPOAuth2Security", scopes = [ "accounts" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        value = ["/account-access-consents/{ConsentId}"],
        produces = ["application/json; charset=utf-8", "application/json", "application/jose+jwe"]
    )
    fun deleteAccountAccessConsentsConsentId(@Parameter(description = "ConsentId", required = true) @PathVariable("ConsentId") consentId: kotlin.String,@Parameter(description = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750", `in` = ParameterIn.HEADER, required = true) @RequestHeader(value = "Authorization", required = true) authorization: kotlin.String,@Pattern(regexp="^(Mon|Tue|Wed|Thu|Fri|Sat|Sun), \\d{2} (Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) \\d{4} \\d{2}:\\d{2}:\\d{2} (GMT|UTC)$") @Parameter(description = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-auth-date", required = false) xFapiAuthDate: kotlin.String?,@Parameter(description = "The PSU's IP address if the PSU is currently logged in with the TPP.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-customer-ip-address", required = false) xFapiCustomerIpAddress: kotlin.String?,@Parameter(description = "An RFC4122 UID used as a correlation id.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-interaction-id", required = false) xFapiInteractionId: kotlin.String?,@Parameter(description = "Indicates the user-agent that the PSU is using.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-customer-user-agent", required = false) xCustomerUserAgent: kotlin.String?): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Account Access Consents",
        operationId = "getAccountAccessConsentsConsentId",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Account Access Consents Read", content = [Content(schema = Schema(implementation = OBReadConsentResponse1::class))]),
            ApiResponse(responseCode = "400", description = "Bad request", content = [Content(schema = Schema(implementation = OBErrorResponse1::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized"),
            ApiResponse(responseCode = "403", description = "Forbidden", content = [Content(schema = Schema(implementation = OBErrorResponse12::class))]),
            ApiResponse(responseCode = "405", description = "Method Not Allowed"),
            ApiResponse(responseCode = "406", description = "Not Acceptable"),
            ApiResponse(responseCode = "429", description = "Too Many Requests"),
            ApiResponse(responseCode = "500", description = "Internal Server Error", content = [Content(schema = Schema(implementation = OBErrorResponse12::class))]) ],
        security = [ SecurityRequirement(name = "TPPOAuth2Security", scopes = [ "accounts" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/account-access-consents/{ConsentId}"],
        produces = ["application/json; charset=utf-8", "application/json", "application/jose+jwe"]
    )
    fun getAccountAccessConsentsConsentId(@Parameter(description = "ConsentId", required = true) @PathVariable("ConsentId") consentId: kotlin.String,@Parameter(description = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750", `in` = ParameterIn.HEADER, required = true) @RequestHeader(value = "Authorization", required = true) authorization: kotlin.String,@Pattern(regexp="^(Mon|Tue|Wed|Thu|Fri|Sat|Sun), \\d{2} (Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) \\d{4} \\d{2}:\\d{2}:\\d{2} (GMT|UTC)$") @Parameter(description = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-auth-date", required = false) xFapiAuthDate: kotlin.String?,@Parameter(description = "The PSU's IP address if the PSU is currently logged in with the TPP.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-customer-ip-address", required = false) xFapiCustomerIpAddress: kotlin.String?,@Parameter(description = "An RFC4122 UID used as a correlation id.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-interaction-id", required = false) xFapiInteractionId: kotlin.String?,@Parameter(description = "Indicates the user-agent that the PSU is using.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-customer-user-agent", required = false) xCustomerUserAgent: kotlin.String?): ResponseEntity<OBReadConsentResponse1> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
