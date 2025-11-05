package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Locale
import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import uk.gov.justice.digital.hmpps.openbanking.model.ExternalCategoryPurpose1Code
import uk.gov.justice.digital.hmpps.openbanking.model.OBExternalMandateClassification1Code
import uk.gov.justice.digital.hmpps.openbanking.model.OBFrequency6
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
 * Provides further details of the mandate signed between the creditor and the debtor.
 * @param frequency 
 * @param mandateIdentification Unique identification, as assigned by the creditor, to unambiguously identify the mandate.
 * @param classification 
 * @param categoryPurposeCode 
 * @param firstPaymentDateTime The date on which the first payment for a recurrent credit transfer will be made.
 * @param recurringPaymentDateTime The date on which the first recurring payment for a Standing Order schedule will be made.  Usage: This must be populated only if the first recurring date is different to the first payment date. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 * @param finalPaymentDateTime The date on which the final payment for a recurrent credit transfer will be made.
 * @param reason Reason for the setup of the credit transfer mandate.
 */
data class OBMandateRelatedInformation1(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("Frequency", required = true) val frequency: OBFrequency6,

    @get:Size(min=1,max=35)
    @Schema(example = "Golfers", description = "Unique identification, as assigned by the creditor, to unambiguously identify the mandate.")
    @get:JsonProperty("MandateIdentification") val mandateIdentification: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("Classification") val classification: OBExternalMandateClassification1Code? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("CategoryPurposeCode") val categoryPurposeCode: ExternalCategoryPurpose1Code? = null,

    @Schema(example = "2024-04-25T12:46:49.425Z", description = "The date on which the first payment for a recurrent credit transfer will be made.")
    @get:JsonProperty("FirstPaymentDateTime") val firstPaymentDateTime: java.time.OffsetDateTime? = null,

    @Schema(example = "2024-04-25T12:46:49.425Z", description = "The date on which the first recurring payment for a Standing Order schedule will be made.  Usage: This must be populated only if the first recurring date is different to the first payment date. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @get:JsonProperty("RecurringPaymentDateTime") val recurringPaymentDateTime: java.time.OffsetDateTime? = null,

    @Schema(example = "2024-04-25T12:46:49.425Z", description = "The date on which the final payment for a recurrent credit transfer will be made.")
    @get:JsonProperty("FinalPaymentDateTime") val finalPaymentDateTime: java.time.OffsetDateTime? = null,

    @get:Size(min=1,max=256)
    @Schema(example = "To pay monthly memebership", description = "Reason for the setup of the credit transfer mandate.")
    @get:JsonProperty("Reason") val reason: kotlin.String? = null
) {

}

