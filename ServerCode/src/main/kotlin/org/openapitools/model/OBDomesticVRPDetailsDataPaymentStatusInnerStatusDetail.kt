package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * @param status Status of a transfer, as assigned by the transaction administrator.
 * @param localInstrument User community specific instrument. Usage: This element is used to specify a local instrument, local clearing option and/or further qualify the service or service level. For a full list of values refer to `OBInternalLocalInstrument1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 * @param statusReason Reason Code provided for the status of a transfer.
 * @param statusReasonDescription Reason provided for the status of a transfer.
 */
data class OBDomesticVRPDetailsDataPaymentStatusInnerStatusDetail(

    @get:Size(min=1,max=128)
    @Schema(example = "null", required = true, description = "Status of a transfer, as assigned by the transaction administrator.")
    @get:JsonProperty("Status", required = true) val status: kotlin.String,

    @Schema(example = "null", description = "User community specific instrument. Usage: This element is used to specify a local instrument, local clearing option and/or further qualify the service or service level. For a full list of values refer to `OBInternalLocalInstrument1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
    @get:JsonProperty("LocalInstrument") val localInstrument: kotlin.String? = null,

    @Schema(example = "null", description = "Reason Code provided for the status of a transfer.")
    @get:JsonProperty("StatusReason") val statusReason: kotlin.String? = null,

    @get:Size(min=1,max=256)
    @Schema(example = "null", description = "Reason provided for the status of a transfer.")
    @get:JsonProperty("StatusReasonDescription") val statusReasonDescription: kotlin.String? = null
) {

}

