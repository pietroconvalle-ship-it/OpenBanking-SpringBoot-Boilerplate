package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.ExternalCategoryPurpose1Code1
import org.openapitools.model.OBExternalMandateClassification1Code1
import org.openapitools.model.OBFrequency61
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
 * @param frequency 
 * @param mandateIdentification Unique and unambiguous identification of a financial institution or a branch of a financial institution.
 * @param classification 
 * @param categoryPurposeCode 
 * @param firstPaymentDateTime 
 * @param recurringPaymentDateTime The date on which the first recurring payment for a Standing Order schedule will be made.  Usage: This must be populated only if the first recurring date is different to the first payment date. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 * @param finalPaymentDateTime 
 * @param reason Reason for the direct debit mandate to allow the user to distinguish between different mandates for the same creditor.
 */
data class OBMandateRelatedInformation11(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("Frequency", required = true) val frequency: OBFrequency61,

    @get:Size(min=1,max=35)
    @Schema(example = "null", description = "Unique and unambiguous identification of a financial institution or a branch of a financial institution.")
    @get:JsonProperty("MandateIdentification") val mandateIdentification: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("Classification") val classification: OBExternalMandateClassification1Code1? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("CategoryPurposeCode") val categoryPurposeCode: ExternalCategoryPurpose1Code1? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("FirstPaymentDateTime") val firstPaymentDateTime: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "The date on which the first recurring payment for a Standing Order schedule will be made.  Usage: This must be populated only if the first recurring date is different to the first payment date. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @get:JsonProperty("RecurringPaymentDateTime") val recurringPaymentDateTime: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("FinalPaymentDateTime") val finalPaymentDateTime: java.time.OffsetDateTime? = null,

    @get:Size(min=1,max=256)
    @Schema(example = "null", description = "Reason for the direct debit mandate to allow the user to distinguish between different mandates for the same creditor.")
    @get:JsonProperty("Reason") val reason: kotlin.String? = null
) {

}

