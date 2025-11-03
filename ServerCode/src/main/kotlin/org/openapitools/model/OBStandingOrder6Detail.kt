package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.ExternalMandateStatus1Code
import org.openapitools.model.OBActiveOrHistoricCurrencyAndAmount11
import org.openapitools.model.OBActiveOrHistoricCurrencyAndAmount2
import org.openapitools.model.OBActiveOrHistoricCurrencyAndAmount3
import org.openapitools.model.OBActiveOrHistoricCurrencyAndAmount4
import org.openapitools.model.OBBranchAndFinancialInstitutionIdentification51
import org.openapitools.model.OBCashAccount51
import org.openapitools.model.OBMandateRelatedInformation1
import org.openapitools.model.OBRemittanceInformation2
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
 * @param accountId A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.
 * @param creditorAccount 
 * @param standingOrderId A unique and immutable identifier used to identify the standing order resource. This identifier has no meaning to the account owner.
 * @param nextPaymentDateTime The date on which the next payment for a Standing Order schedule will be made. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 * @param lastPaymentDateTime The date on which the last (most recent) payment for a Standing Order schedule was made. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 * @param numberOfPayments Number of the payments that will be made in completing this frequency sequence including any executed since the sequence start date.
 * @param standingOrderStatusCode 
 * @param firstPaymentAmount 
 * @param nextPaymentAmount 
 * @param lastPaymentAmount 
 * @param finalPaymentAmount 
 * @param creditorAgent 
 * @param supplementaryData Additional information that can not be captured in the structured fields and/or any other specific block.
 * @param mandateRelatedInformation 
 * @param remittanceInformation 
 */
data class OBStandingOrder6Detail(

    @get:Size(min=1,max=40)
    @Schema(example = "22289", required = true, description = "A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.")
    @get:JsonProperty("AccountId", required = true) val accountId: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("CreditorAccount", required = true) val creditorAccount: OBCashAccount51,

    @get:Size(min=1,max=40)
    @Schema(example = "Ben5", description = "A unique and immutable identifier used to identify the standing order resource. This identifier has no meaning to the account owner.")
    @get:JsonProperty("StandingOrderId") val standingOrderId: kotlin.String? = null,

    @Schema(example = "2017-07-12T00:00Z", description = "The date on which the next payment for a Standing Order schedule will be made. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @get:JsonProperty("NextPaymentDateTime") val nextPaymentDateTime: java.time.OffsetDateTime? = null,

    @Schema(example = "2017-07-12T00:00Z", description = "The date on which the last (most recent) payment for a Standing Order schedule was made. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @get:JsonProperty("LastPaymentDateTime") val lastPaymentDateTime: java.time.OffsetDateTime? = null,

    @get:Size(min=1,max=35)
    @Schema(example = "null", description = "Number of the payments that will be made in completing this frequency sequence including any executed since the sequence start date.")
    @get:JsonProperty("NumberOfPayments") val numberOfPayments: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("StandingOrderStatusCode") val standingOrderStatusCode: ExternalMandateStatus1Code? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("FirstPaymentAmount") val firstPaymentAmount: OBActiveOrHistoricCurrencyAndAmount2? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("NextPaymentAmount") val nextPaymentAmount: OBActiveOrHistoricCurrencyAndAmount3? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("LastPaymentAmount") val lastPaymentAmount: OBActiveOrHistoricCurrencyAndAmount11? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("FinalPaymentAmount") val finalPaymentAmount: OBActiveOrHistoricCurrencyAndAmount4? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("CreditorAgent") val creditorAgent: OBBranchAndFinancialInstitutionIdentification51? = null,

    @field:Valid
    @Schema(example = "null", description = "Additional information that can not be captured in the structured fields and/or any other specific block.")
    @get:JsonProperty("SupplementaryData") val supplementaryData: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("MandateRelatedInformation") val mandateRelatedInformation: OBMandateRelatedInformation1? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("RemittanceInformation") val remittanceInformation: OBRemittanceInformation2? = null
) {

}

