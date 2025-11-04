package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * @param permissions 
 * @param expirationDateTime Specified date and time the permissions will expire. If this is not populated, the permissions will be open ended. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 * @param transactionFromDateTime Specified start date and time for the transaction query period. If this is not populated, the start date will be open ended, and data will be returned from the earliest available transaction. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 * @param transactionToDateTime Specified end date and time for the transaction query period. If this is not populated, the end date will be open ended, and data will be returned to the latest available transaction. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 */
data class OBReadConsent1Data(

    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("Permissions", required = true) val permissions: kotlin.collections.List<OBReadConsent1Data.Permissions>,

    @Schema(example = "null", description = "Specified date and time the permissions will expire. If this is not populated, the permissions will be open ended. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @get:JsonProperty("ExpirationDateTime") val expirationDateTime: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "Specified start date and time for the transaction query period. If this is not populated, the start date will be open ended, and data will be returned from the earliest available transaction. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @get:JsonProperty("TransactionFromDateTime") val transactionFromDateTime: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "Specified end date and time for the transaction query period. If this is not populated, the end date will be open ended, and data will be returned to the latest available transaction. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @get:JsonProperty("TransactionToDateTime") val transactionToDateTime: java.time.OffsetDateTime? = null
) {

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

