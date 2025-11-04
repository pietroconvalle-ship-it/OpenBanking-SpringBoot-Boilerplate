package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import uk.gov.justice.digital.hmpps.openbanking.model.OBActiveOrHistoricCurrencyAndAmount1
import uk.gov.justice.digital.hmpps.openbanking.model.OBCashAccountCreditor31
import uk.gov.justice.digital.hmpps.openbanking.model.OBPostalAddress72
import uk.gov.justice.digital.hmpps.openbanking.model.OBRemittanceInformation22
import uk.gov.justice.digital.hmpps.openbanking.model.OBUltimateCreditor12
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
 * @param instructionIdentification Unique identification as assigned by an instructing party for an instructed party to unambiguously identify the instruction. Usage: the instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction.
 * @param endToEndIdentification Unique identification assigned by the initiating party to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain. Usage: The end-to-end identification can be used for reconciliation or to link tasks relating to the transaction. It can be included in several messages related to the transaction. OB: The Faster Payments Scheme can only access 31 characters for the EndToEndIdentification field
 * @param instructedAmount 
 * @param creditorAccount 
 * @param remittanceInformation 
 * @param localInstrument User community specific instrument. Usage: This element is used to specify a local instrument, local clearing option and/or further qualify the service or service level. For a full list of values refer to `OBInternalLocalInstrument1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 * @param creditorPostalAddress 
 * @param ultimateCreditor 
 * @param supplementaryData Additional information that can not be captured in the structured fields and/or any other specific block. 
 */
data class OBDomesticVRPInstruction(

    @get:Size(min=1,max=35)
    @Schema(example = "null", required = true, description = "Unique identification as assigned by an instructing party for an instructed party to unambiguously identify the instruction. Usage: the instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction.")
    @get:JsonProperty("InstructionIdentification", required = true) val instructionIdentification: kotlin.String,

    @get:Size(min=1,max=35)
    @Schema(example = "null", required = true, description = "Unique identification assigned by the initiating party to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain. Usage: The end-to-end identification can be used for reconciliation or to link tasks relating to the transaction. It can be included in several messages related to the transaction. OB: The Faster Payments Scheme can only access 31 characters for the EndToEndIdentification field")
    @get:JsonProperty("EndToEndIdentification", required = true) val endToEndIdentification: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("InstructedAmount", required = true) val instructedAmount: OBActiveOrHistoricCurrencyAndAmount1,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("CreditorAccount", required = true) val creditorAccount: OBCashAccountCreditor31,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("RemittanceInformation") val remittanceInformation: OBRemittanceInformation22? = null,

    @Schema(example = "null", description = "User community specific instrument. Usage: This element is used to specify a local instrument, local clearing option and/or further qualify the service or service level. For a full list of values refer to `OBInternalLocalInstrument1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
    @get:JsonProperty("LocalInstrument") val localInstrument: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("CreditorPostalAddress") val creditorPostalAddress: OBPostalAddress72? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("UltimateCreditor") val ultimateCreditor: OBUltimateCreditor12? = null,

    @field:Valid
    @Schema(example = "null", description = "Additional information that can not be captured in the structured fields and/or any other specific block. ")
    @get:JsonProperty("SupplementaryData") val supplementaryData: kotlin.Any? = null
) {

}

