package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import uk.gov.justice.digital.hmpps.openbanking.model.ExternalMandateStatus1Code
import uk.gov.justice.digital.hmpps.openbanking.model.OBActiveOrHistoricCurrencyAndAmount0
import uk.gov.justice.digital.hmpps.openbanking.model.OBMandateRelatedInformation1
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
 * Account to or from which a cash entry is made.
 * @param accountId A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.
 * @param name Name of Service User.
 * @param directDebitId A unique and immutable identifier used to identify the direct debit resource. This identifier has no meaning to the account owner.
 * @param directDebitStatusCode 
 * @param mandateRelatedInformation 
 * @param previousPaymentDateTime Date of most recent direct debit collection. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 * @param previousPaymentAmount 
 */
data class OBReadDirectDebit2DataDirectDebitInner(

    @get:Size(min=1,max=40)
    @Schema(example = "22289", required = true, description = "A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.")
    @get:JsonProperty("AccountId", required = true) val accountId: kotlin.String,

    @get:Size(min=1,max=70)
    @Schema(example = "null", required = true, description = "Name of Service User.")
    @get:JsonProperty("Name", required = true) val name: kotlin.String,

    @get:Size(min=1,max=40)
    @Schema(example = "null", description = "A unique and immutable identifier used to identify the direct debit resource. This identifier has no meaning to the account owner.")
    @get:JsonProperty("DirectDebitId") val directDebitId: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("DirectDebitStatusCode") val directDebitStatusCode: ExternalMandateStatus1Code? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("MandateRelatedInformation") val mandateRelatedInformation: OBMandateRelatedInformation1? = null,

    @Schema(example = "null", description = "Date of most recent direct debit collection. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @get:JsonProperty("PreviousPaymentDateTime") val previousPaymentDateTime: java.time.OffsetDateTime? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("PreviousPaymentAmount") val previousPaymentAmount: OBActiveOrHistoricCurrencyAndAmount0? = null
) {

}

