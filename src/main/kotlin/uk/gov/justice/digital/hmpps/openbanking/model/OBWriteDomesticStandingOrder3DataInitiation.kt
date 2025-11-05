package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Locale
import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import uk.gov.justice.digital.hmpps.openbanking.model.OBMandateRelatedInformation11
import uk.gov.justice.digital.hmpps.openbanking.model.OBRegulatoryReporting1
import uk.gov.justice.digital.hmpps.openbanking.model.OBRemittanceInformation21
import uk.gov.justice.digital.hmpps.openbanking.model.OBUltimateCreditor11
import uk.gov.justice.digital.hmpps.openbanking.model.OBUltimateDebtor11
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteDomesticStandingOrder3DataInitiationCreditorAccount
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteDomesticStandingOrder3DataInitiationDebtorAccount
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteDomesticStandingOrder3DataInitiationFinalPaymentAmount
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteDomesticStandingOrder3DataInitiationFirstPaymentAmount
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteDomesticStandingOrder3DataInitiationRecurringPaymentAmount
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
 * The Initiation payload is sent by the initiating party to the ASPSP. It is used to request movement of funds from the debtor account to a creditor for a domestic standing order.
 * @param firstPaymentAmount 
 * @param creditorAccount 
 * @param mandateRelatedInformation 
 * @param remittanceInformation 
 * @param numberOfPayments Number of the payments that will be made in completing this frequency sequence including any executed since the sequence start date.
 * @param recurringPaymentAmount 
 * @param finalPaymentAmount 
 * @param debtorAccount 
 * @param ultimateCreditor 
 * @param ultimateDebtor 
 * @param regulatoryReporting 
 * @param supplementaryData Additional information that can not be captured in the structured fields and/or any other specific block.
 */
data class OBWriteDomesticStandingOrder3DataInitiation(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("FirstPaymentAmount", required = true) val firstPaymentAmount: OBWriteDomesticStandingOrder3DataInitiationFirstPaymentAmount,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("CreditorAccount", required = true) val creditorAccount: OBWriteDomesticStandingOrder3DataInitiationCreditorAccount,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("MandateRelatedInformation", required = true) val mandateRelatedInformation: OBMandateRelatedInformation11,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("RemittanceInformation") val remittanceInformation: OBRemittanceInformation21? = null,

    @get:Size(min=1,max=35)
    @Schema(example = "null", description = "Number of the payments that will be made in completing this frequency sequence including any executed since the sequence start date.")
    @get:JsonProperty("NumberOfPayments") val numberOfPayments: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("RecurringPaymentAmount") val recurringPaymentAmount: OBWriteDomesticStandingOrder3DataInitiationRecurringPaymentAmount? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("FinalPaymentAmount") val finalPaymentAmount: OBWriteDomesticStandingOrder3DataInitiationFinalPaymentAmount? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("DebtorAccount") val debtorAccount: OBWriteDomesticStandingOrder3DataInitiationDebtorAccount? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("UltimateCreditor") val ultimateCreditor: OBUltimateCreditor11? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("UltimateDebtor") val ultimateDebtor: OBUltimateDebtor11? = null,

    @field:Valid
    @get:Size(max=10)
    @Schema(example = "null", description = "")
    @get:JsonProperty("RegulatoryReporting") val regulatoryReporting: kotlin.collections.List<OBRegulatoryReporting1>? = null,

    @field:Valid
    @Schema(example = "null", description = "Additional information that can not be captured in the structured fields and/or any other specific block.")
    @get:JsonProperty("SupplementaryData") val supplementaryData: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null
) {

}

