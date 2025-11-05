package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Locale
import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import uk.gov.justice.digital.hmpps.openbanking.model.OBActiveOrHistoricCurrencyAndAmount1
import uk.gov.justice.digital.hmpps.openbanking.model.OBBranchAndFinancialInstitutionIdentification51
import uk.gov.justice.digital.hmpps.openbanking.model.OBCashAccount51
import uk.gov.justice.digital.hmpps.openbanking.model.OBInternalScheduleType1Code
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
 * @param scheduledPaymentDateTime The date on which the scheduled payment will be made. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 * @param scheduledType 
 * @param instructedAmount 
 * @param scheduledPaymentId A unique and immutable identifier used to identify the scheduled payment resource. This identifier has no meaning to the account owner.
 * @param reference Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification.
 * @param debtorReference A reference value provided by the PSU to the PISP while setting up the scheduled payment.
 * @param creditorAgent 
 * @param creditorAccount 
 */
data class OBScheduledPayment3(

    @get:Size(min=1,max=40)
    @Schema(example = "22289", required = true, description = "A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.")
    @get:JsonProperty("AccountId", required = true) val accountId: kotlin.String,

    @Schema(example = "2017-07-12T00:00Z", required = true, description = "The date on which the scheduled payment will be made. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @get:JsonProperty("ScheduledPaymentDateTime", required = true) val scheduledPaymentDateTime: java.time.OffsetDateTime,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("ScheduledType", required = true) val scheduledType: OBInternalScheduleType1Code,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("InstructedAmount", required = true) val instructedAmount: OBActiveOrHistoricCurrencyAndAmount1,

    @get:Size(min=1,max=40)
    @Schema(example = "SP03", description = "A unique and immutable identifier used to identify the scheduled payment resource. This identifier has no meaning to the account owner.")
    @get:JsonProperty("ScheduledPaymentId") val scheduledPaymentId: kotlin.String? = null,

    @get:Size(min=1,max=35)
    @Schema(example = "Towbar Club", description = "Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification.")
    @get:JsonProperty("Reference") val reference: kotlin.String? = null,

    @get:Size(min=1,max=35)
    @Schema(example = "REF51561806", description = "A reference value provided by the PSU to the PISP while setting up the scheduled payment.")
    @get:JsonProperty("DebtorReference") val debtorReference: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("CreditorAgent") val creditorAgent: OBBranchAndFinancialInstitutionIdentification51? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("CreditorAccount") val creditorAccount: OBCashAccount51? = null
) {

}

