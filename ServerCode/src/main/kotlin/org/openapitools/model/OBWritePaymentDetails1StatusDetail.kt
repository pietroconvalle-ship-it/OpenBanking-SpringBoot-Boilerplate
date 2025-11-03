package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * Payment status details as per underlying Payment Rail.
 * @param status Status of a transfer, as assigned by the transaction administrator. For a full list of values see `ExternalPaymentTransactionStatus1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 * @param localInstrument User community specific instrument. Usage: This element is used to specify a local instrument, local clearing option and/or further qualify the service or service level. For a full list of values refer to `OBInternalLocalInstrument1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 * @param statusReason Reason Code provided for the status of a transfer. For a full list of values see code values for `OBExternalStatusReason1Code` in *ISO_External_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 * @param statusReasonDescription Reason provided for the status of a transfer. For a full list of values see the code name entries for `OBExternalStatusReason1Code` in *ISO_External_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets).
 */
data class OBWritePaymentDetails1StatusDetail(

    @get:Size(min=1,max=4)
    @Schema(example = "null", required = true, description = "Status of a transfer, as assigned by the transaction administrator. For a full list of values see `ExternalPaymentTransactionStatus1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
    @get:JsonProperty("Status", required = true) val status: OBWritePaymentDetails1StatusDetail.Status,

    @Schema(example = "null", description = "User community specific instrument. Usage: This element is used to specify a local instrument, local clearing option and/or further qualify the service or service level. For a full list of values refer to `OBInternalLocalInstrument1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
    @get:JsonProperty("LocalInstrument") val localInstrument: kotlin.String? = null,

    @get:Size(min=1,max=4)
    @Schema(example = "null", description = "Reason Code provided for the status of a transfer. For a full list of values see code values for `OBExternalStatusReason1Code` in *ISO_External_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
    @get:JsonProperty("StatusReason") val statusReason: kotlin.String? = null,

    @get:Size(min=1,max=256)
    @Schema(example = "null", description = "Reason provided for the status of a transfer. For a full list of values see the code name entries for `OBExternalStatusReason1Code` in *ISO_External_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets).")
    @get:JsonProperty("StatusReasonDescription") val statusReasonDescription: kotlin.String? = null
) {

    /**
    * Status of a transfer, as assigned by the transaction administrator. For a full list of values see `ExternalPaymentTransactionStatus1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
    * Values: PDNG,ACTC,PATC,ACCP,ACFC,ACSP,ACWC,ACSC,ACWP,ACCC,BLCK,RJCT
    */
    enum class Status(val value: kotlin.String) {

        @JsonProperty("PDNG") PDNG("PDNG"),
        @JsonProperty("ACTC") ACTC("ACTC"),
        @JsonProperty("PATC") PATC("PATC"),
        @JsonProperty("ACCP") ACCP("ACCP"),
        @JsonProperty("ACFC") ACFC("ACFC"),
        @JsonProperty("ACSP") ACSP("ACSP"),
        @JsonProperty("ACWC") ACWC("ACWC"),
        @JsonProperty("ACSC") ACSC("ACSC"),
        @JsonProperty("ACWP") ACWP("ACWP"),
        @JsonProperty("ACCC") ACCC("ACCC"),
        @JsonProperty("BLCK") BLCK("BLCK"),
        @JsonProperty("RJCT") RJCT("RJCT")
    }

}

