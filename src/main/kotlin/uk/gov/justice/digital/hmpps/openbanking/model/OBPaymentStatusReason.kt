package uk.gov.justice.digital.hmpps.openbanking.model

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
 * @param statusReasonCode Specifies the status reason in a code form   For more information and enum values see `OBExternalStatusReason1Code [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 * @param statusReasonDescription Description supporting the StatusReasonCode.
 * @param path Recommended but optional reference to the JSON Path of the field with error, e.g., Data.Initiation.InstructedAmount.Currency
 */
data class OBPaymentStatusReason(

    @get:Size(min=1,max=4)
    @Schema(example = "ERIN", description = "Specifies the status reason in a code form   For more information and enum values see `OBExternalStatusReason1Code [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
    @get:JsonProperty("StatusReasonCode") val statusReasonCode: kotlin.String? = null,

    @get:Size(min=1,max=500)
    @Schema(example = "null", description = "Description supporting the StatusReasonCode.")
    @get:JsonProperty("StatusReasonDescription") val statusReasonDescription: kotlin.String? = null,

    @get:Size(min=1,max=500)
    @Schema(example = "null", description = "Recommended but optional reference to the JSON Path of the field with error, e.g., Data.Initiation.InstructedAmount.Currency")
    @get:JsonProperty("Path") val path: kotlin.String? = null
) {

}

