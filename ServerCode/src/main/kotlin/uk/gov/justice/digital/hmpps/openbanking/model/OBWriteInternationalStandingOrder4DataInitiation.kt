package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import uk.gov.justice.digital.hmpps.openbanking.model.OBInternalChargeBearerType1Code
import uk.gov.justice.digital.hmpps.openbanking.model.OBMandateRelatedInformation11
import uk.gov.justice.digital.hmpps.openbanking.model.OBRegulatoryReporting1
import uk.gov.justice.digital.hmpps.openbanking.model.OBRemittanceInformation21
import uk.gov.justice.digital.hmpps.openbanking.model.OBUltimateCreditor11
import uk.gov.justice.digital.hmpps.openbanking.model.OBUltimateDebtor11
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteDomestic2DataInitiationInstructedAmount
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteDomesticStandingOrder3DataInitiationDebtorAccount
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteInternationalConsent5DataInitiationCreditor
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteInternationalStandingOrder4DataInitiationCreditorAccount
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteInternationalStandingOrder4DataInitiationCreditorAgent
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
 * The Initiation payload is sent by the initiating party to the ASPSP. It is used to request movement of funds from the debtor account to a creditor for an international standing order.
 * @param currencyOfTransfer Specifies the currency of the to be transferred amount, which is different from the currency of the debtor's account.
 * @param instructedAmount 
 * @param creditorAccount 
 * @param mandateRelatedInformation 
 * @param remittanceInformation 
 * @param numberOfPayments Number of the payments that will be made in completing this frequency sequence including any executed since the sequence start date.
 * @param extendedPurpose Specifies the purpose of an international payment, when there is no corresponding 4 character code available in the ISO20022 list of Purpose Codes.
 * @param chargeBearer 
 * @param destinationCountryCode Country in which Credit Account is domiciled. Code to identify a country, a dependency, or another area of particular geopolitical interest, on the basis of country names obtained from the United Nations (ISO 3166, Alpha-2 code).
 * @param debtorAccount 
 * @param creditor 
 * @param creditorAgent 
 * @param ultimateCreditor 
 * @param ultimateDebtor 
 * @param regulatoryReporting 
 * @param supplementaryData Additional information that can not be captured in the structured fields and/or any other specific block.
 */
data class OBWriteInternationalStandingOrder4DataInitiation(

    @get:Pattern(regexp="^[A-Z]{3,3}$")
    @Schema(example = "null", required = true, description = "Specifies the currency of the to be transferred amount, which is different from the currency of the debtor's account.")
    @get:JsonProperty("CurrencyOfTransfer", required = true) val currencyOfTransfer: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("InstructedAmount", required = true) val instructedAmount: OBWriteDomestic2DataInitiationInstructedAmount,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("CreditorAccount", required = true) val creditorAccount: OBWriteInternationalStandingOrder4DataInitiationCreditorAccount,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("MandateRelatedInformation", required = true) val mandateRelatedInformation: OBMandateRelatedInformation11,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("RemittanceInformation") val remittanceInformation: OBRemittanceInformation21? = null,

    @get:Size(min=1,max=35)
    @Schema(example = "null", description = "Number of the payments that will be made in completing this frequency sequence including any executed since the sequence start date.")
    @get:JsonProperty("NumberOfPayments") val numberOfPayments: kotlin.String? = null,

    @get:Size(min=1,max=140)
    @Schema(example = "null", description = "Specifies the purpose of an international payment, when there is no corresponding 4 character code available in the ISO20022 list of Purpose Codes.")
    @get:JsonProperty("ExtendedPurpose") val extendedPurpose: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("ChargeBearer") val chargeBearer: OBInternalChargeBearerType1Code? = null,

    @get:Pattern(regexp="[A-Z]{2,2}")
    @Schema(example = "null", description = "Country in which Credit Account is domiciled. Code to identify a country, a dependency, or another area of particular geopolitical interest, on the basis of country names obtained from the United Nations (ISO 3166, Alpha-2 code).")
    @get:JsonProperty("DestinationCountryCode") val destinationCountryCode: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("DebtorAccount") val debtorAccount: OBWriteDomesticStandingOrder3DataInitiationDebtorAccount? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("Creditor") val creditor: OBWriteInternationalConsent5DataInitiationCreditor? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("CreditorAgent") val creditorAgent: OBWriteInternationalStandingOrder4DataInitiationCreditorAgent? = null,

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

