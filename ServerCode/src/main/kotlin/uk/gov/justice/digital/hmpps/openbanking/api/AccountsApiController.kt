package uk.gov.justice.digital.hmpps.openbanking.api

import uk.gov.justice.digital.hmpps.openbanking.model.OBErrorResponse1
import uk.gov.justice.digital.hmpps.openbanking.model.OBErrorResponse12
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadAccount6
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadBalance1
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadBeneficiary5
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadDirectDebit2
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadOffer1
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadParty2
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadParty3
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadProduct2
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadScheduledPayment3
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadStandingOrder6
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadStatement2
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadTransaction6
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
class AccountsApiController() {

    @Operation(
        summary = "Get Accounts",
        operationId = "getAccounts",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Accounts Read", content = [Content(schema = Schema(implementation = OBReadAccount6::class))]),
            ApiResponse(responseCode = "400", description = "Bad request", content = [Content(schema = Schema(implementation = OBErrorResponse1::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized"),
            ApiResponse(responseCode = "403", description = "Forbidden", content = [Content(schema = Schema(implementation = OBErrorResponse12::class))]),
            ApiResponse(responseCode = "405", description = "Method Not Allowed"),
            ApiResponse(responseCode = "406", description = "Not Acceptable"),
            ApiResponse(responseCode = "429", description = "Too Many Requests"),
            ApiResponse(responseCode = "500", description = "Internal Server Error", content = [Content(schema = Schema(implementation = OBErrorResponse12::class))]) ],
        security = [ SecurityRequirement(name = "PSUOAuth2Security", scopes = [ "accounts" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/accounts"],
        produces = ["application/json; charset=utf-8", "application/json", "application/jose+jwe"]
    )
    fun getAccounts(@Parameter(description = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750", `in` = ParameterIn.HEADER, required = true) @RequestHeader(value = "Authorization", required = true) authorization: kotlin.String,@Pattern(regexp="^(Mon|Tue|Wed|Thu|Fri|Sat|Sun), \\d{2} (Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) \\d{4} \\d{2}:\\d{2}:\\d{2} (GMT|UTC)$") @Parameter(description = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-auth-date", required = false) xFapiAuthDate: kotlin.String?,@Parameter(description = "The PSU's IP address if the PSU is currently logged in with the TPP.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-customer-ip-address", required = false) xFapiCustomerIpAddress: kotlin.String?,@Parameter(description = "An RFC4122 UID used as a correlation id.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-interaction-id", required = false) xFapiInteractionId: kotlin.String?,@Parameter(description = "Indicates the user-agent that the PSU is using.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-customer-user-agent", required = false) xCustomerUserAgent: kotlin.String?): ResponseEntity<OBReadAccount6> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Accounts",
        operationId = "getAccountsAccountId",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Accounts Read", content = [Content(schema = Schema(implementation = OBReadAccount6::class))]),
            ApiResponse(responseCode = "400", description = "Bad request", content = [Content(schema = Schema(implementation = OBErrorResponse1::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized"),
            ApiResponse(responseCode = "403", description = "Forbidden", content = [Content(schema = Schema(implementation = OBErrorResponse12::class))]),
            ApiResponse(responseCode = "405", description = "Method Not Allowed"),
            ApiResponse(responseCode = "406", description = "Not Acceptable"),
            ApiResponse(responseCode = "429", description = "Too Many Requests"),
            ApiResponse(responseCode = "500", description = "Internal Server Error", content = [Content(schema = Schema(implementation = OBErrorResponse12::class))]) ],
        security = [ SecurityRequirement(name = "PSUOAuth2Security", scopes = [ "accounts" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/accounts/{AccountId}"],
        produces = ["application/json; charset=utf-8", "application/json", "application/jose+jwe"]
    )
    fun getAccountsAccountId(@Parameter(description = "AccountId", required = true) @PathVariable("AccountId") accountId: kotlin.String,@Parameter(description = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750", `in` = ParameterIn.HEADER, required = true) @RequestHeader(value = "Authorization", required = true) authorization: kotlin.String,@Pattern(regexp="^(Mon|Tue|Wed|Thu|Fri|Sat|Sun), \\d{2} (Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) \\d{4} \\d{2}:\\d{2}:\\d{2} (GMT|UTC)$") @Parameter(description = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-auth-date", required = false) xFapiAuthDate: kotlin.String?,@Parameter(description = "The PSU's IP address if the PSU is currently logged in with the TPP.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-customer-ip-address", required = false) xFapiCustomerIpAddress: kotlin.String?,@Parameter(description = "An RFC4122 UID used as a correlation id.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-interaction-id", required = false) xFapiInteractionId: kotlin.String?,@Parameter(description = "Indicates the user-agent that the PSU is using.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-customer-user-agent", required = false) xCustomerUserAgent: kotlin.String?): ResponseEntity<OBReadAccount6> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Balances",
        operationId = "getAccountsAccountIdBalances",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Balances Read", content = [Content(schema = Schema(implementation = OBReadBalance1::class))]),
            ApiResponse(responseCode = "400", description = "Bad request", content = [Content(schema = Schema(implementation = OBErrorResponse1::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized"),
            ApiResponse(responseCode = "403", description = "Forbidden", content = [Content(schema = Schema(implementation = OBErrorResponse12::class))]),
            ApiResponse(responseCode = "405", description = "Method Not Allowed"),
            ApiResponse(responseCode = "406", description = "Not Acceptable"),
            ApiResponse(responseCode = "429", description = "Too Many Requests"),
            ApiResponse(responseCode = "500", description = "Internal Server Error", content = [Content(schema = Schema(implementation = OBErrorResponse12::class))]) ],
        security = [ SecurityRequirement(name = "PSUOAuth2Security", scopes = [ "accounts" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/accounts/{AccountId}/balances"],
        produces = ["application/json; charset=utf-8", "application/json", "application/jose+jwe"]
    )
    fun getAccountsAccountIdBalances(@Parameter(description = "AccountId", required = true) @PathVariable("AccountId") accountId: kotlin.String,@Parameter(description = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750", `in` = ParameterIn.HEADER, required = true) @RequestHeader(value = "Authorization", required = true) authorization: kotlin.String,@Pattern(regexp="^(Mon|Tue|Wed|Thu|Fri|Sat|Sun), \\d{2} (Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) \\d{4} \\d{2}:\\d{2}:\\d{2} (GMT|UTC)$") @Parameter(description = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-auth-date", required = false) xFapiAuthDate: kotlin.String?,@Parameter(description = "The PSU's IP address if the PSU is currently logged in with the TPP.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-customer-ip-address", required = false) xFapiCustomerIpAddress: kotlin.String?,@Parameter(description = "An RFC4122 UID used as a correlation id.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-interaction-id", required = false) xFapiInteractionId: kotlin.String?,@Parameter(description = "Indicates the user-agent that the PSU is using.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-customer-user-agent", required = false) xCustomerUserAgent: kotlin.String?): ResponseEntity<OBReadBalance1> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Beneficiaries",
        operationId = "getAccountsAccountIdBeneficiaries",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Beneficiaries Read", content = [Content(schema = Schema(implementation = OBReadBeneficiary5::class))]),
            ApiResponse(responseCode = "400", description = "Bad request", content = [Content(schema = Schema(implementation = OBErrorResponse1::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized"),
            ApiResponse(responseCode = "403", description = "Forbidden", content = [Content(schema = Schema(implementation = OBErrorResponse12::class))]),
            ApiResponse(responseCode = "404", description = "Not found"),
            ApiResponse(responseCode = "405", description = "Method Not Allowed"),
            ApiResponse(responseCode = "406", description = "Not Acceptable"),
            ApiResponse(responseCode = "429", description = "Too Many Requests"),
            ApiResponse(responseCode = "500", description = "Internal Server Error", content = [Content(schema = Schema(implementation = OBErrorResponse12::class))]) ],
        security = [ SecurityRequirement(name = "PSUOAuth2Security", scopes = [ "accounts" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/accounts/{AccountId}/beneficiaries"],
        produces = ["application/json; charset=utf-8", "application/json", "application/jose+jwe"]
    )
    fun getAccountsAccountIdBeneficiaries(@Parameter(description = "AccountId", required = true) @PathVariable("AccountId") accountId: kotlin.String,@Parameter(description = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750", `in` = ParameterIn.HEADER, required = true) @RequestHeader(value = "Authorization", required = true) authorization: kotlin.String,@Pattern(regexp="^(Mon|Tue|Wed|Thu|Fri|Sat|Sun), \\d{2} (Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) \\d{4} \\d{2}:\\d{2}:\\d{2} (GMT|UTC)$") @Parameter(description = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-auth-date", required = false) xFapiAuthDate: kotlin.String?,@Parameter(description = "The PSU's IP address if the PSU is currently logged in with the TPP.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-customer-ip-address", required = false) xFapiCustomerIpAddress: kotlin.String?,@Parameter(description = "An RFC4122 UID used as a correlation id.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-interaction-id", required = false) xFapiInteractionId: kotlin.String?,@Parameter(description = "Indicates the user-agent that the PSU is using.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-customer-user-agent", required = false) xCustomerUserAgent: kotlin.String?): ResponseEntity<OBReadBeneficiary5> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Direct Debits",
        operationId = "getAccountsAccountIdDirectDebits",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Direct Debits Read", content = [Content(schema = Schema(implementation = OBReadDirectDebit2::class))]),
            ApiResponse(responseCode = "400", description = "Bad request", content = [Content(schema = Schema(implementation = OBErrorResponse1::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized"),
            ApiResponse(responseCode = "403", description = "Forbidden", content = [Content(schema = Schema(implementation = OBErrorResponse12::class))]),
            ApiResponse(responseCode = "404", description = "Not found"),
            ApiResponse(responseCode = "405", description = "Method Not Allowed"),
            ApiResponse(responseCode = "406", description = "Not Acceptable"),
            ApiResponse(responseCode = "429", description = "Too Many Requests"),
            ApiResponse(responseCode = "500", description = "Internal Server Error", content = [Content(schema = Schema(implementation = OBErrorResponse12::class))]) ],
        security = [ SecurityRequirement(name = "PSUOAuth2Security", scopes = [ "accounts" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/accounts/{AccountId}/direct-debits"],
        produces = ["application/json; charset=utf-8", "application/json", "application/jose+jwe"]
    )
    fun getAccountsAccountIdDirectDebits(@Parameter(description = "AccountId", required = true) @PathVariable("AccountId") accountId: kotlin.String,@Parameter(description = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750", `in` = ParameterIn.HEADER, required = true) @RequestHeader(value = "Authorization", required = true) authorization: kotlin.String,@Pattern(regexp="^(Mon|Tue|Wed|Thu|Fri|Sat|Sun), \\d{2} (Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) \\d{4} \\d{2}:\\d{2}:\\d{2} (GMT|UTC)$") @Parameter(description = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-auth-date", required = false) xFapiAuthDate: kotlin.String?,@Parameter(description = "The PSU's IP address if the PSU is currently logged in with the TPP.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-customer-ip-address", required = false) xFapiCustomerIpAddress: kotlin.String?,@Parameter(description = "An RFC4122 UID used as a correlation id.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-interaction-id", required = false) xFapiInteractionId: kotlin.String?,@Parameter(description = "Indicates the user-agent that the PSU is using.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-customer-user-agent", required = false) xCustomerUserAgent: kotlin.String?): ResponseEntity<OBReadDirectDebit2> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Offers",
        operationId = "getAccountsAccountIdOffers",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Offers Read", content = [Content(schema = Schema(implementation = OBReadOffer1::class))]),
            ApiResponse(responseCode = "400", description = "Bad request", content = [Content(schema = Schema(implementation = OBErrorResponse1::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized"),
            ApiResponse(responseCode = "403", description = "Forbidden", content = [Content(schema = Schema(implementation = OBErrorResponse12::class))]),
            ApiResponse(responseCode = "404", description = "Not found"),
            ApiResponse(responseCode = "405", description = "Method Not Allowed"),
            ApiResponse(responseCode = "406", description = "Not Acceptable"),
            ApiResponse(responseCode = "429", description = "Too Many Requests"),
            ApiResponse(responseCode = "500", description = "Internal Server Error", content = [Content(schema = Schema(implementation = OBErrorResponse12::class))]) ],
        security = [ SecurityRequirement(name = "PSUOAuth2Security", scopes = [ "accounts" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/accounts/{AccountId}/offers"],
        produces = ["application/json; charset=utf-8", "application/json", "application/jose+jwe"]
    )
    fun getAccountsAccountIdOffers(@Parameter(description = "AccountId", required = true) @PathVariable("AccountId") accountId: kotlin.String,@Parameter(description = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750", `in` = ParameterIn.HEADER, required = true) @RequestHeader(value = "Authorization", required = true) authorization: kotlin.String,@Pattern(regexp="^(Mon|Tue|Wed|Thu|Fri|Sat|Sun), \\d{2} (Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) \\d{4} \\d{2}:\\d{2}:\\d{2} (GMT|UTC)$") @Parameter(description = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-auth-date", required = false) xFapiAuthDate: kotlin.String?,@Parameter(description = "The PSU's IP address if the PSU is currently logged in with the TPP.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-customer-ip-address", required = false) xFapiCustomerIpAddress: kotlin.String?,@Parameter(description = "An RFC4122 UID used as a correlation id.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-interaction-id", required = false) xFapiInteractionId: kotlin.String?,@Parameter(description = "Indicates the user-agent that the PSU is using.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-customer-user-agent", required = false) xCustomerUserAgent: kotlin.String?): ResponseEntity<OBReadOffer1> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Parties",
        operationId = "getAccountsAccountIdParties",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Parties Read", content = [Content(schema = Schema(implementation = OBReadParty3::class))]),
            ApiResponse(responseCode = "400", description = "Bad request", content = [Content(schema = Schema(implementation = OBErrorResponse1::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized"),
            ApiResponse(responseCode = "403", description = "Forbidden", content = [Content(schema = Schema(implementation = OBErrorResponse12::class))]),
            ApiResponse(responseCode = "404", description = "Not found"),
            ApiResponse(responseCode = "405", description = "Method Not Allowed"),
            ApiResponse(responseCode = "406", description = "Not Acceptable"),
            ApiResponse(responseCode = "429", description = "Too Many Requests"),
            ApiResponse(responseCode = "500", description = "Internal Server Error", content = [Content(schema = Schema(implementation = OBErrorResponse12::class))]) ],
        security = [ SecurityRequirement(name = "PSUOAuth2Security", scopes = [ "accounts" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/accounts/{AccountId}/parties"],
        produces = ["application/json; charset=utf-8", "application/json", "application/jose+jwe"]
    )
    fun getAccountsAccountIdParties(@Parameter(description = "AccountId", required = true) @PathVariable("AccountId") accountId: kotlin.String,@Parameter(description = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750", `in` = ParameterIn.HEADER, required = true) @RequestHeader(value = "Authorization", required = true) authorization: kotlin.String,@Pattern(regexp="^(Mon|Tue|Wed|Thu|Fri|Sat|Sun), \\d{2} (Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) \\d{4} \\d{2}:\\d{2}:\\d{2} (GMT|UTC)$") @Parameter(description = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-auth-date", required = false) xFapiAuthDate: kotlin.String?,@Parameter(description = "The PSU's IP address if the PSU is currently logged in with the TPP.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-customer-ip-address", required = false) xFapiCustomerIpAddress: kotlin.String?,@Parameter(description = "An RFC4122 UID used as a correlation id.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-interaction-id", required = false) xFapiInteractionId: kotlin.String?,@Parameter(description = "Indicates the user-agent that the PSU is using.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-customer-user-agent", required = false) xCustomerUserAgent: kotlin.String?): ResponseEntity<OBReadParty3> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Parties",
        operationId = "getAccountsAccountIdParty",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Parties Read", content = [Content(schema = Schema(implementation = OBReadParty2::class))]),
            ApiResponse(responseCode = "400", description = "Bad request", content = [Content(schema = Schema(implementation = OBErrorResponse1::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized"),
            ApiResponse(responseCode = "403", description = "Forbidden", content = [Content(schema = Schema(implementation = OBErrorResponse12::class))]),
            ApiResponse(responseCode = "404", description = "Not found"),
            ApiResponse(responseCode = "405", description = "Method Not Allowed"),
            ApiResponse(responseCode = "406", description = "Not Acceptable"),
            ApiResponse(responseCode = "429", description = "Too Many Requests"),
            ApiResponse(responseCode = "500", description = "Internal Server Error", content = [Content(schema = Schema(implementation = OBErrorResponse12::class))]) ],
        security = [ SecurityRequirement(name = "PSUOAuth2Security", scopes = [ "accounts" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/accounts/{AccountId}/party"],
        produces = ["application/json; charset=utf-8", "application/json", "application/jose+jwe"]
    )
    fun getAccountsAccountIdParty(@Parameter(description = "AccountId", required = true) @PathVariable("AccountId") accountId: kotlin.String,@Parameter(description = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750", `in` = ParameterIn.HEADER, required = true) @RequestHeader(value = "Authorization", required = true) authorization: kotlin.String,@Pattern(regexp="^(Mon|Tue|Wed|Thu|Fri|Sat|Sun), \\d{2} (Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) \\d{4} \\d{2}:\\d{2}:\\d{2} (GMT|UTC)$") @Parameter(description = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-auth-date", required = false) xFapiAuthDate: kotlin.String?,@Parameter(description = "The PSU's IP address if the PSU is currently logged in with the TPP.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-customer-ip-address", required = false) xFapiCustomerIpAddress: kotlin.String?,@Parameter(description = "An RFC4122 UID used as a correlation id.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-interaction-id", required = false) xFapiInteractionId: kotlin.String?,@Parameter(description = "Indicates the user-agent that the PSU is using.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-customer-user-agent", required = false) xCustomerUserAgent: kotlin.String?): ResponseEntity<OBReadParty2> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Products",
        operationId = "getAccountsAccountIdProduct",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Products Read", content = [Content(schema = Schema(implementation = OBReadProduct2::class))]),
            ApiResponse(responseCode = "400", description = "Bad request", content = [Content(schema = Schema(implementation = OBErrorResponse1::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized"),
            ApiResponse(responseCode = "403", description = "Forbidden", content = [Content(schema = Schema(implementation = OBErrorResponse12::class))]),
            ApiResponse(responseCode = "404", description = "Not found"),
            ApiResponse(responseCode = "405", description = "Method Not Allowed"),
            ApiResponse(responseCode = "406", description = "Not Acceptable"),
            ApiResponse(responseCode = "429", description = "Too Many Requests"),
            ApiResponse(responseCode = "500", description = "Internal Server Error", content = [Content(schema = Schema(implementation = OBErrorResponse12::class))]) ],
        security = [ SecurityRequirement(name = "PSUOAuth2Security", scopes = [ "accounts" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/accounts/{AccountId}/product"],
        produces = ["application/json; charset=utf-8", "application/json", "application/jose+jwe"]
    )
    fun getAccountsAccountIdProduct(@Parameter(description = "AccountId", required = true) @PathVariable("AccountId") accountId: kotlin.String,@Parameter(description = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750", `in` = ParameterIn.HEADER, required = true) @RequestHeader(value = "Authorization", required = true) authorization: kotlin.String,@Pattern(regexp="^(Mon|Tue|Wed|Thu|Fri|Sat|Sun), \\d{2} (Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) \\d{4} \\d{2}:\\d{2}:\\d{2} (GMT|UTC)$") @Parameter(description = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-auth-date", required = false) xFapiAuthDate: kotlin.String?,@Parameter(description = "The PSU's IP address if the PSU is currently logged in with the TPP.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-customer-ip-address", required = false) xFapiCustomerIpAddress: kotlin.String?,@Parameter(description = "An RFC4122 UID used as a correlation id.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-interaction-id", required = false) xFapiInteractionId: kotlin.String?,@Parameter(description = "Indicates the user-agent that the PSU is using.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-customer-user-agent", required = false) xCustomerUserAgent: kotlin.String?): ResponseEntity<OBReadProduct2> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Scheduled Payments",
        operationId = "getAccountsAccountIdScheduledPayments",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Scheduled Payments Read", content = [Content(schema = Schema(implementation = OBReadScheduledPayment3::class))]),
            ApiResponse(responseCode = "400", description = "Bad request", content = [Content(schema = Schema(implementation = OBErrorResponse1::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized"),
            ApiResponse(responseCode = "403", description = "Forbidden", content = [Content(schema = Schema(implementation = OBErrorResponse12::class))]),
            ApiResponse(responseCode = "404", description = "Not found"),
            ApiResponse(responseCode = "405", description = "Method Not Allowed"),
            ApiResponse(responseCode = "406", description = "Not Acceptable"),
            ApiResponse(responseCode = "429", description = "Too Many Requests"),
            ApiResponse(responseCode = "500", description = "Internal Server Error", content = [Content(schema = Schema(implementation = OBErrorResponse12::class))]) ],
        security = [ SecurityRequirement(name = "PSUOAuth2Security", scopes = [ "accounts" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/accounts/{AccountId}/scheduled-payments"],
        produces = ["application/json; charset=utf-8", "application/json", "application/jose+jwe"]
    )
    fun getAccountsAccountIdScheduledPayments(@Parameter(description = "AccountId", required = true) @PathVariable("AccountId") accountId: kotlin.String,@Parameter(description = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750", `in` = ParameterIn.HEADER, required = true) @RequestHeader(value = "Authorization", required = true) authorization: kotlin.String,@Pattern(regexp="^(Mon|Tue|Wed|Thu|Fri|Sat|Sun), \\d{2} (Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) \\d{4} \\d{2}:\\d{2}:\\d{2} (GMT|UTC)$") @Parameter(description = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-auth-date", required = false) xFapiAuthDate: kotlin.String?,@Parameter(description = "The PSU's IP address if the PSU is currently logged in with the TPP.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-customer-ip-address", required = false) xFapiCustomerIpAddress: kotlin.String?,@Parameter(description = "An RFC4122 UID used as a correlation id.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-interaction-id", required = false) xFapiInteractionId: kotlin.String?,@Parameter(description = "Indicates the user-agent that the PSU is using.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-customer-user-agent", required = false) xCustomerUserAgent: kotlin.String?): ResponseEntity<OBReadScheduledPayment3> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Standing Orders",
        operationId = "getAccountsAccountIdStandingOrders",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Standing Orders Read", content = [Content(schema = Schema(implementation = OBReadStandingOrder6::class))]),
            ApiResponse(responseCode = "400", description = "Bad request", content = [Content(schema = Schema(implementation = OBErrorResponse1::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized"),
            ApiResponse(responseCode = "403", description = "Forbidden", content = [Content(schema = Schema(implementation = OBErrorResponse12::class))]),
            ApiResponse(responseCode = "404", description = "Not found"),
            ApiResponse(responseCode = "405", description = "Method Not Allowed"),
            ApiResponse(responseCode = "406", description = "Not Acceptable"),
            ApiResponse(responseCode = "429", description = "Too Many Requests"),
            ApiResponse(responseCode = "500", description = "Internal Server Error", content = [Content(schema = Schema(implementation = OBErrorResponse12::class))]) ],
        security = [ SecurityRequirement(name = "PSUOAuth2Security", scopes = [ "accounts" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/accounts/{AccountId}/standing-orders"],
        produces = ["application/json; charset=utf-8", "application/json", "application/jose+jwe"]
    )
    fun getAccountsAccountIdStandingOrders(@Parameter(description = "AccountId", required = true) @PathVariable("AccountId") accountId: kotlin.String,@Parameter(description = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750", `in` = ParameterIn.HEADER, required = true) @RequestHeader(value = "Authorization", required = true) authorization: kotlin.String,@Pattern(regexp="^(Mon|Tue|Wed|Thu|Fri|Sat|Sun), \\d{2} (Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) \\d{4} \\d{2}:\\d{2}:\\d{2} (GMT|UTC)$") @Parameter(description = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-auth-date", required = false) xFapiAuthDate: kotlin.String?,@Parameter(description = "The PSU's IP address if the PSU is currently logged in with the TPP.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-customer-ip-address", required = false) xFapiCustomerIpAddress: kotlin.String?,@Parameter(description = "An RFC4122 UID used as a correlation id.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-interaction-id", required = false) xFapiInteractionId: kotlin.String?,@Parameter(description = "Indicates the user-agent that the PSU is using.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-customer-user-agent", required = false) xCustomerUserAgent: kotlin.String?): ResponseEntity<OBReadStandingOrder6> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Statements",
        operationId = "getAccountsAccountIdStatements",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Statements Read", content = [Content(schema = Schema(implementation = OBReadStatement2::class))]),
            ApiResponse(responseCode = "400", description = "Bad request", content = [Content(schema = Schema(implementation = OBErrorResponse1::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized"),
            ApiResponse(responseCode = "403", description = "Forbidden", content = [Content(schema = Schema(implementation = OBErrorResponse12::class))]),
            ApiResponse(responseCode = "404", description = "Not found"),
            ApiResponse(responseCode = "405", description = "Method Not Allowed"),
            ApiResponse(responseCode = "406", description = "Not Acceptable"),
            ApiResponse(responseCode = "429", description = "Too Many Requests"),
            ApiResponse(responseCode = "500", description = "Internal Server Error", content = [Content(schema = Schema(implementation = OBErrorResponse12::class))]) ],
        security = [ SecurityRequirement(name = "PSUOAuth2Security", scopes = [ "accounts" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/accounts/{AccountId}/statements"],
        produces = ["application/json; charset=utf-8", "application/json", "application/jose+jwe"]
    )
    fun getAccountsAccountIdStatements(@Parameter(description = "AccountId", required = true) @PathVariable("AccountId") accountId: kotlin.String,@Parameter(description = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750", `in` = ParameterIn.HEADER, required = true) @RequestHeader(value = "Authorization", required = true) authorization: kotlin.String,@Pattern(regexp="^(Mon|Tue|Wed|Thu|Fri|Sat|Sun), \\d{2} (Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) \\d{4} \\d{2}:\\d{2}:\\d{2} (GMT|UTC)$") @Parameter(description = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-auth-date", required = false) xFapiAuthDate: kotlin.String?,@Parameter(description = "The PSU's IP address if the PSU is currently logged in with the TPP.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-customer-ip-address", required = false) xFapiCustomerIpAddress: kotlin.String?,@Parameter(description = "An RFC4122 UID used as a correlation id.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-interaction-id", required = false) xFapiInteractionId: kotlin.String?,@Parameter(description = "Indicates the user-agent that the PSU is using.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-customer-user-agent", required = false) xCustomerUserAgent: kotlin.String?,@Parameter(description = "The UTC ISO 8601 Date Time to filter statements FROM NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the ASPSP must ignore the timezone component.") @Valid @RequestParam(value = "fromStatementDateTime", required = false) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME) fromStatementDateTime: java.time.OffsetDateTime?,@Parameter(description = "The UTC ISO 8601 Date Time to filter statements TO NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the ASPSP must ignore the timezone component.") @Valid @RequestParam(value = "toStatementDateTime", required = false) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME) toStatementDateTime: java.time.OffsetDateTime?): ResponseEntity<OBReadStatement2> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Statements",
        operationId = "getAccountsAccountIdStatementsStatementId",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Statements Read", content = [Content(schema = Schema(implementation = OBReadStatement2::class))]),
            ApiResponse(responseCode = "400", description = "Bad request", content = [Content(schema = Schema(implementation = OBErrorResponse1::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized"),
            ApiResponse(responseCode = "403", description = "Forbidden", content = [Content(schema = Schema(implementation = OBErrorResponse12::class))]),
            ApiResponse(responseCode = "404", description = "Not found"),
            ApiResponse(responseCode = "405", description = "Method Not Allowed"),
            ApiResponse(responseCode = "406", description = "Not Acceptable"),
            ApiResponse(responseCode = "429", description = "Too Many Requests"),
            ApiResponse(responseCode = "500", description = "Internal Server Error", content = [Content(schema = Schema(implementation = OBErrorResponse12::class))]) ],
        security = [ SecurityRequirement(name = "PSUOAuth2Security", scopes = [ "accounts" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/accounts/{AccountId}/statements/{StatementId}"],
        produces = ["application/json; charset=utf-8", "application/json", "application/jose+jwe"]
    )
    fun getAccountsAccountIdStatementsStatementId(@Parameter(description = "StatementId", required = true) @PathVariable("StatementId") statementId: kotlin.String,@Parameter(description = "AccountId", required = true) @PathVariable("AccountId") accountId: kotlin.String,@Parameter(description = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750", `in` = ParameterIn.HEADER, required = true) @RequestHeader(value = "Authorization", required = true) authorization: kotlin.String,@Pattern(regexp="^(Mon|Tue|Wed|Thu|Fri|Sat|Sun), \\d{2} (Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) \\d{4} \\d{2}:\\d{2}:\\d{2} (GMT|UTC)$") @Parameter(description = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-auth-date", required = false) xFapiAuthDate: kotlin.String?,@Parameter(description = "The PSU's IP address if the PSU is currently logged in with the TPP.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-customer-ip-address", required = false) xFapiCustomerIpAddress: kotlin.String?,@Parameter(description = "An RFC4122 UID used as a correlation id.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-interaction-id", required = false) xFapiInteractionId: kotlin.String?,@Parameter(description = "Indicates the user-agent that the PSU is using.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-customer-user-agent", required = false) xCustomerUserAgent: kotlin.String?): ResponseEntity<OBReadStatement2> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Statements",
        operationId = "getAccountsAccountIdStatementsStatementIdFile",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Statements Read", content = [Content(schema = Schema(implementation = kotlin.Any::class))]),
            ApiResponse(responseCode = "400", description = "Bad request", content = [Content(schema = Schema(implementation = OBErrorResponse1::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized"),
            ApiResponse(responseCode = "403", description = "Forbidden", content = [Content(schema = Schema(implementation = OBErrorResponse12::class))]),
            ApiResponse(responseCode = "404", description = "Not found"),
            ApiResponse(responseCode = "405", description = "Method Not Allowed"),
            ApiResponse(responseCode = "406", description = "Not Acceptable"),
            ApiResponse(responseCode = "429", description = "Too Many Requests"),
            ApiResponse(responseCode = "500", description = "Internal Server Error", content = [Content(schema = Schema(implementation = OBErrorResponse12::class))]) ],
        security = [ SecurityRequirement(name = "PSUOAuth2Security", scopes = [ "accounts" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/accounts/{AccountId}/statements/{StatementId}/file"],
        produces = ["application/json; charset=utf-8", "application/json", "application/jose+jwe"]
    )
    fun getAccountsAccountIdStatementsStatementIdFile(@Parameter(description = "StatementId", required = true) @PathVariable("StatementId") statementId: kotlin.String,@Parameter(description = "AccountId", required = true) @PathVariable("AccountId") accountId: kotlin.String,@Parameter(description = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750", `in` = ParameterIn.HEADER, required = true) @RequestHeader(value = "Authorization", required = true) authorization: kotlin.String,@Pattern(regexp="^(Mon|Tue|Wed|Thu|Fri|Sat|Sun), \\d{2} (Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) \\d{4} \\d{2}:\\d{2}:\\d{2} (GMT|UTC)$") @Parameter(description = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-auth-date", required = false) xFapiAuthDate: kotlin.String?,@Parameter(description = "The PSU's IP address if the PSU is currently logged in with the TPP.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-customer-ip-address", required = false) xFapiCustomerIpAddress: kotlin.String?,@Parameter(description = "An RFC4122 UID used as a correlation id.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-interaction-id", required = false) xFapiInteractionId: kotlin.String?,@Parameter(description = "Indicates the user-agent that the PSU is using.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-customer-user-agent", required = false) xCustomerUserAgent: kotlin.String?): ResponseEntity<kotlin.Any> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Transactions",
        operationId = "getAccountsAccountIdStatementsStatementIdTransactions",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Transactions Read", content = [Content(schema = Schema(implementation = OBReadTransaction6::class))]),
            ApiResponse(responseCode = "400", description = "Bad request", content = [Content(schema = Schema(implementation = OBErrorResponse1::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized"),
            ApiResponse(responseCode = "403", description = "Forbidden", content = [Content(schema = Schema(implementation = OBErrorResponse12::class))]),
            ApiResponse(responseCode = "404", description = "Not found"),
            ApiResponse(responseCode = "405", description = "Method Not Allowed"),
            ApiResponse(responseCode = "406", description = "Not Acceptable"),
            ApiResponse(responseCode = "429", description = "Too Many Requests"),
            ApiResponse(responseCode = "500", description = "Internal Server Error", content = [Content(schema = Schema(implementation = OBErrorResponse12::class))]) ],
        security = [ SecurityRequirement(name = "PSUOAuth2Security", scopes = [ "accounts" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/accounts/{AccountId}/statements/{StatementId}/transactions"],
        produces = ["application/json; charset=utf-8", "application/json", "application/jose+jwe"]
    )
    fun getAccountsAccountIdStatementsStatementIdTransactions(@Parameter(description = "StatementId", required = true) @PathVariable("StatementId") statementId: kotlin.String,@Parameter(description = "AccountId", required = true) @PathVariable("AccountId") accountId: kotlin.String,@Parameter(description = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750", `in` = ParameterIn.HEADER, required = true) @RequestHeader(value = "Authorization", required = true) authorization: kotlin.String,@Pattern(regexp="^(Mon|Tue|Wed|Thu|Fri|Sat|Sun), \\d{2} (Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) \\d{4} \\d{2}:\\d{2}:\\d{2} (GMT|UTC)$") @Parameter(description = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-auth-date", required = false) xFapiAuthDate: kotlin.String?,@Parameter(description = "The PSU's IP address if the PSU is currently logged in with the TPP.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-customer-ip-address", required = false) xFapiCustomerIpAddress: kotlin.String?,@Parameter(description = "An RFC4122 UID used as a correlation id.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-interaction-id", required = false) xFapiInteractionId: kotlin.String?,@Parameter(description = "Indicates the user-agent that the PSU is using.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-customer-user-agent", required = false) xCustomerUserAgent: kotlin.String?): ResponseEntity<OBReadTransaction6> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Transactions",
        operationId = "getAccountsAccountIdTransactions",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "Transactions Read", content = [Content(schema = Schema(implementation = OBReadTransaction6::class))]),
            ApiResponse(responseCode = "400", description = "Bad request", content = [Content(schema = Schema(implementation = OBErrorResponse1::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized"),
            ApiResponse(responseCode = "403", description = "Forbidden", content = [Content(schema = Schema(implementation = OBErrorResponse12::class))]),
            ApiResponse(responseCode = "405", description = "Method Not Allowed"),
            ApiResponse(responseCode = "406", description = "Not Acceptable"),
            ApiResponse(responseCode = "429", description = "Too Many Requests"),
            ApiResponse(responseCode = "500", description = "Internal Server Error", content = [Content(schema = Schema(implementation = OBErrorResponse12::class))]) ],
        security = [ SecurityRequirement(name = "PSUOAuth2Security", scopes = [ "accounts" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/accounts/{AccountId}/transactions"],
        produces = ["application/json; charset=utf-8", "application/json", "application/jose+jwe"]
    )
    fun getAccountsAccountIdTransactions(@Parameter(description = "AccountId", required = true) @PathVariable("AccountId") accountId: kotlin.String,@Parameter(description = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750", `in` = ParameterIn.HEADER, required = true) @RequestHeader(value = "Authorization", required = true) authorization: kotlin.String,@Pattern(regexp="^(Mon|Tue|Wed|Thu|Fri|Sat|Sun), \\d{2} (Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) \\d{4} \\d{2}:\\d{2}:\\d{2} (GMT|UTC)$") @Parameter(description = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-auth-date", required = false) xFapiAuthDate: kotlin.String?,@Parameter(description = "The PSU's IP address if the PSU is currently logged in with the TPP.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-customer-ip-address", required = false) xFapiCustomerIpAddress: kotlin.String?,@Parameter(description = "An RFC4122 UID used as a correlation id.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-fapi-interaction-id", required = false) xFapiInteractionId: kotlin.String?,@Parameter(description = "Indicates the user-agent that the PSU is using.", `in` = ParameterIn.HEADER) @RequestHeader(value = "x-customer-user-agent", required = false) xCustomerUserAgent: kotlin.String?,@Parameter(description = "The UTC ISO 8601 Date Time to filter transactions FROM NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the ASPSP must ignore the timezone component.") @Valid @RequestParam(value = "fromBookingDateTime", required = false) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME) fromBookingDateTime: java.time.OffsetDateTime?,@Parameter(description = "The UTC ISO 8601 Date Time to filter transactions TO NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the ASPSP must ignore the timezone component.") @Valid @RequestParam(value = "toBookingDateTime", required = false) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME) toBookingDateTime: java.time.OffsetDateTime?): ResponseEntity<OBReadTransaction6> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
