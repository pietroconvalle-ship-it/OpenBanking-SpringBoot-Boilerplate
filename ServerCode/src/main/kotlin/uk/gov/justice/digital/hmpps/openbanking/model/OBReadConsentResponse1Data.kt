package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import uk.gov.justice.digital.hmpps.openbanking.model.OBStatusReason
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import jakarta.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param consentId Unique identification as assigned to identify the account access consent resource.
 * @param creationDateTime Date and time at which the resource was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 * @param status Specifies the status of consent resource in code form.
 * @param statusUpdateDateTime Date and time at which the resource status was updated. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 * @param permissions 
 * @param statusReason Specifies the status reason.
 * @param expirationDateTime Specified date and time the permissions will expire. If this is not populated, the permissions will be open ended. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 * @param transactionFromDateTime Specified start date and time for the transaction query period. If this is not populated, the start date will be open ended, and data will be returned from the earliest available transaction. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 * @param transactionToDateTime Specified end date and time for the transaction query period. If this is not populated, the end date will be open ended, and data will be returned to the latest available transaction. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 */
data class OBReadConsentResponse1Data(

    @get:Size(min=1,max=128)
    @Schema(example = "null", required = true, description = "Unique identification as assigned to identify the account access consent resource.")
    @get:JsonProperty("ConsentId", required = true) val consentId: kotlin.String,

    @Schema(example = "2024-05-29T00:00Z", required = true, description = "Date and time at which the resource was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @get:JsonProperty("CreationDateTime", required = true) val creationDateTime: java.time.OffsetDateTime,

    @Schema(example = "null", required = true, description = "Specifies the status of consent resource in code form.")
    @get:JsonProperty("Status", required = true) val status: OBReadConsentResponse1Data.Status,

    @Schema(example = "null", required = true, description = "Date and time at which the resource status was updated. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @get:JsonProperty("StatusUpdateDateTime", required = true) val statusUpdateDateTime: java.time.OffsetDateTime,

    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("Permissions", required = true) val permissions: kotlin.collections.List<OBReadConsentResponse1Data.Permissions>,

    @field:Valid
    @Schema(example = "null", description = "Specifies the status reason.")
    @get:JsonProperty("StatusReason") val statusReason: kotlin.collections.List<OBStatusReason>? = null,

    @Schema(example = "null", description = "Specified date and time the permissions will expire. If this is not populated, the permissions will be open ended. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @get:JsonProperty("ExpirationDateTime") val expirationDateTime: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "Specified start date and time for the transaction query period. If this is not populated, the start date will be open ended, and data will be returned from the earliest available transaction. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @get:JsonProperty("TransactionFromDateTime") val transactionFromDateTime: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "Specified end date and time for the transaction query period. If this is not populated, the end date will be open ended, and data will be returned to the latest available transaction. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @get:JsonProperty("TransactionToDateTime") val transactionToDateTime: java.time.OffsetDateTime? = null
) {

    /**
    * Specifies the status of consent resource in code form.
    * Values: AWAU,RJCT,AUTH,EXPD,CANC
    */
    enum class Status(val value: kotlin.String) {

        @JsonProperty("AWAU") AWAU("AWAU"),
        @JsonProperty("RJCT") RJCT("RJCT"),
        @JsonProperty("AUTH") AUTH("AUTH"),
        @JsonProperty("EXPD") EXPD("EXPD"),
        @JsonProperty("CANC") CANC("CANC")
    }

    /**
    * 
    * Values: ReadAccountsBasic,ReadAccountsDetail,ReadBalances,ReadBeneficiariesBasic,ReadBeneficiariesDetail,ReadDirectDebits,ReadOffers,ReadPAN,ReadParty,ReadPartyPSU,ReadProducts,ReadScheduledPaymentsBasic,ReadScheduledPaymentsDetail,ReadStandingOrdersBasic,ReadStandingOrdersDetail,ReadStatementsBasic,ReadStatementsDetail,ReadTransactionsBasic,ReadTransactionsCredits,ReadTransactionsDebits,ReadTransactionsDetail
    */
    enum class Permissions(val value: kotlin.String) {

        @JsonProperty("ReadAccountsBasic") ReadAccountsBasic("ReadAccountsBasic"),
        @JsonProperty("ReadAccountsDetail") ReadAccountsDetail("ReadAccountsDetail"),
        @JsonProperty("ReadBalances") ReadBalances("ReadBalances"),
        @JsonProperty("ReadBeneficiariesBasic") ReadBeneficiariesBasic("ReadBeneficiariesBasic"),
        @JsonProperty("ReadBeneficiariesDetail") ReadBeneficiariesDetail("ReadBeneficiariesDetail"),
        @JsonProperty("ReadDirectDebits") ReadDirectDebits("ReadDirectDebits"),
        @JsonProperty("ReadOffers") ReadOffers("ReadOffers"),
        @JsonProperty("ReadPAN") ReadPAN("ReadPAN"),
        @JsonProperty("ReadParty") ReadParty("ReadParty"),
        @JsonProperty("ReadPartyPSU") ReadPartyPSU("ReadPartyPSU"),
        @JsonProperty("ReadProducts") ReadProducts("ReadProducts"),
        @JsonProperty("ReadScheduledPaymentsBasic") ReadScheduledPaymentsBasic("ReadScheduledPaymentsBasic"),
        @JsonProperty("ReadScheduledPaymentsDetail") ReadScheduledPaymentsDetail("ReadScheduledPaymentsDetail"),
        @JsonProperty("ReadStandingOrdersBasic") ReadStandingOrdersBasic("ReadStandingOrdersBasic"),
        @JsonProperty("ReadStandingOrdersDetail") ReadStandingOrdersDetail("ReadStandingOrdersDetail"),
        @JsonProperty("ReadStatementsBasic") ReadStatementsBasic("ReadStatementsBasic"),
        @JsonProperty("ReadStatementsDetail") ReadStatementsDetail("ReadStatementsDetail"),
        @JsonProperty("ReadTransactionsBasic") ReadTransactionsBasic("ReadTransactionsBasic"),
        @JsonProperty("ReadTransactionsCredits") ReadTransactionsCredits("ReadTransactionsCredits"),
        @JsonProperty("ReadTransactionsDebits") ReadTransactionsDebits("ReadTransactionsDebits"),
        @JsonProperty("ReadTransactionsDetail") ReadTransactionsDetail("ReadTransactionsDetail")
    }

}

