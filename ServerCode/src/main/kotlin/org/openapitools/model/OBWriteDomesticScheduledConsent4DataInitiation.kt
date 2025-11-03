package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.OBPostalAddress71
import org.openapitools.model.OBRegulatoryReporting1
import org.openapitools.model.OBRemittanceInformation21
import org.openapitools.model.OBUltimateCreditor11
import org.openapitools.model.OBUltimateDebtor11
import org.openapitools.model.OBWriteDomestic2DataInitiationCreditorAccount
import org.openapitools.model.OBWriteDomestic2DataInitiationDebtorAccount
import org.openapitools.model.OBWriteDomestic2DataInitiationInstructedAmount
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
 * The Initiation payload is sent by the initiating party to the ASPSP. It is used to request movement of funds from the debtor account to a creditor for a single scheduled domestic payment.
 * @param instructionIdentification Unique identification as assigned by an instructing party for an instructed party to unambiguously identify the instruction. Usage: the  instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction.
 * @param requestedExecutionDateTime Date at which the initiating party requests the clearing agent to process the payment.  Usage: This is the date on which the debtor's account is to be debited. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 * @param instructedAmount 
 * @param creditorAccount 
 * @param endToEndIdentification Unique identification assigned by the initiating party to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain. Usage: The end-to-end identification can be used for reconciliation or to link tasks relating to the transaction. It can be included in several messages related to the transaction. OB: The Faster Payments Scheme can only access 31 characters for the EndToEndIdentification field.
 * @param localInstrument User community specific instrument. Usage: This element is used to specify a local instrument, local clearing option and/or further qualify the service or service level. For a full list of values refer to `OBInternalLocalInstrument1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 * @param debtorAccount 
 * @param creditorPostalAddress 
 * @param ultimateCreditor 
 * @param ultimateDebtor 
 * @param regulatoryReporting 
 * @param remittanceInformation 
 * @param supplementaryData Additional information that can not be captured in the structured fields and/or any other specific block.
 */
data class OBWriteDomesticScheduledConsent4DataInitiation(

    @get:Size(min=1,max=35)
    @Schema(example = "null", required = true, description = "Unique identification as assigned by an instructing party for an instructed party to unambiguously identify the instruction. Usage: the  instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction.")
    @get:JsonProperty("InstructionIdentification", required = true) val instructionIdentification: kotlin.String,

    @Schema(example = "null", required = true, description = "Date at which the initiating party requests the clearing agent to process the payment.  Usage: This is the date on which the debtor's account is to be debited. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @get:JsonProperty("RequestedExecutionDateTime", required = true) val requestedExecutionDateTime: java.time.OffsetDateTime,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("InstructedAmount", required = true) val instructedAmount: OBWriteDomestic2DataInitiationInstructedAmount,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("CreditorAccount", required = true) val creditorAccount: OBWriteDomestic2DataInitiationCreditorAccount,

    @get:Size(min=1,max=35)
    @Schema(example = "null", description = "Unique identification assigned by the initiating party to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain. Usage: The end-to-end identification can be used for reconciliation or to link tasks relating to the transaction. It can be included in several messages related to the transaction. OB: The Faster Payments Scheme can only access 31 characters for the EndToEndIdentification field.")
    @get:JsonProperty("EndToEndIdentification") val endToEndIdentification: kotlin.String? = null,

    @Schema(example = "null", description = "User community specific instrument. Usage: This element is used to specify a local instrument, local clearing option and/or further qualify the service or service level. For a full list of values refer to `OBInternalLocalInstrument1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
    @get:JsonProperty("LocalInstrument") val localInstrument: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("DebtorAccount") val debtorAccount: OBWriteDomestic2DataInitiationDebtorAccount? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("CreditorPostalAddress") val creditorPostalAddress: OBPostalAddress71? = null,

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
    @Schema(example = "null", description = "")
    @get:JsonProperty("RemittanceInformation") val remittanceInformation: OBRemittanceInformation21? = null,

    @field:Valid
    @Schema(example = "null", description = "Additional information that can not be captured in the structured fields and/or any other specific block.")
    @get:JsonProperty("SupplementaryData") val supplementaryData: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null
) {

}

