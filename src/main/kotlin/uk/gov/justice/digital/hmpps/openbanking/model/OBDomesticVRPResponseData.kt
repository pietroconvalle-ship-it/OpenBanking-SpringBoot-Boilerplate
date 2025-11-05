package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Locale
import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import uk.gov.justice.digital.hmpps.openbanking.model.OBCashAccountDebtorWithName
import uk.gov.justice.digital.hmpps.openbanking.model.OBDomesticVRPInitiation
import uk.gov.justice.digital.hmpps.openbanking.model.OBDomesticVRPInstruction
import uk.gov.justice.digital.hmpps.openbanking.model.OBDomesticVRPResponseDataChargesInner
import uk.gov.justice.digital.hmpps.openbanking.model.OBStatusReason3
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
 * `Data.Refund` only included in the response if `Data.ReadRefundAccount` is set to `Yes` in the consent. 
 * @param domesticVRPId Unique identification as assigned by the ASPSP to uniquely identify the domestic payment resource. 
 * @param consentId Identifier for the Domestic VRP Consent that this payment is made under. 
 * @param creationDateTime Date and time at which the resource was created. 
 * @param status Specifies the status of the payment information group. For a full list of values refer to `ExternalPaymentTransactionStatus1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 * @param statusUpdateDateTime Date and time at which the resource status was updated. 
 * @param initiation 
 * @param instruction 
 * @param statusReason 
 * @param expectedExecutionDateTime Expected execution date and time for the payment resource. 
 * @param expectedSettlementDateTime Expected settlement date and time for the payment resource. 
 * @param refund 
 * @param charges 
 * @param debtorAccount 
 */
data class OBDomesticVRPResponseData(

    @get:Size(min=1,max=40)
    @Schema(example = "null", required = true, description = "Unique identification as assigned by the ASPSP to uniquely identify the domestic payment resource. ")
    @get:JsonProperty("DomesticVRPId", required = true) val domesticVRPId: kotlin.String,

    @get:Size(min=1,max=128)
    @Schema(example = "null", required = true, description = "Identifier for the Domestic VRP Consent that this payment is made under. ")
    @get:JsonProperty("ConsentId", required = true) val consentId: kotlin.String,

    @Schema(example = "null", required = true, description = "Date and time at which the resource was created. ")
    @get:JsonProperty("CreationDateTime", required = true) val creationDateTime: java.time.OffsetDateTime,

    @Schema(example = "null", required = true, description = "Specifies the status of the payment information group. For a full list of values refer to `ExternalPaymentTransactionStatus1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
    @get:JsonProperty("Status", required = true) val status: OBDomesticVRPResponseData.Status,

    @Schema(example = "null", required = true, description = "Date and time at which the resource status was updated. ")
    @get:JsonProperty("StatusUpdateDateTime", required = true) val statusUpdateDateTime: java.time.OffsetDateTime,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("Initiation", required = true) val initiation: OBDomesticVRPInitiation,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("Instruction", required = true) val instruction: OBDomesticVRPInstruction,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("StatusReason") val statusReason: kotlin.collections.List<OBStatusReason3>? = null,

    @Schema(example = "null", description = "Expected execution date and time for the payment resource. ")
    @get:JsonProperty("ExpectedExecutionDateTime") val expectedExecutionDateTime: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "Expected settlement date and time for the payment resource. ")
    @get:JsonProperty("ExpectedSettlementDateTime") val expectedSettlementDateTime: java.time.OffsetDateTime? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("Refund") val refund: OBCashAccountDebtorWithName? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("Charges") val charges: kotlin.collections.List<OBDomesticVRPResponseDataChargesInner>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("DebtorAccount") val debtorAccount: OBCashAccountDebtorWithName? = null
) {

    /**
    * Specifies the status of the payment information group. For a full list of values refer to `ExternalPaymentTransactionStatus1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
    * Values: RCVD,RJCT,CANC,PDNG,ACTC,ACCP,ACFC,ACSP,ACWC,ACSC,ACWP,ACCC,BLCK
    */
    enum class Status(@get:JsonValue val value: kotlin.String) {

        RCVD("RCVD"),
        RJCT("RJCT"),
        CANC("CANC"),
        PDNG("PDNG"),
        ACTC("ACTC"),
        ACCP("ACCP"),
        ACFC("ACFC"),
        ACSP("ACSP"),
        ACWC("ACWC"),
        ACSC("ACSC"),
        ACWP("ACWP"),
        ACCC("ACCC"),
        BLCK("BLCK");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Status {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBDomesticVRPResponseData'")
            }
        }
    }

}

