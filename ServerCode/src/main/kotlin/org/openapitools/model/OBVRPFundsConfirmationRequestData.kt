package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.OBActiveOrHistoricCurrencyAndAmount1
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
 * @param consentId Unique identification as assigned by the ASPSP to uniquely identify the funds confirmation consent resource.
 * @param instructedAmount 
 * @param reference Unique reference, as assigned by the PISP, to unambiguously refer to the request related to the payment transaction. This must be the same value as the `Reference` field in the consent.
 */
data class OBVRPFundsConfirmationRequestData(

    @get:Size(min=1,max=128)
    @Schema(example = "null", required = true, description = "Unique identification as assigned by the ASPSP to uniquely identify the funds confirmation consent resource.")
    @get:JsonProperty("ConsentId", required = true) val consentId: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("InstructedAmount", required = true) val instructedAmount: OBActiveOrHistoricCurrencyAndAmount1,

    @get:Size(min=1,max=35)
    @Schema(example = "null", description = "Unique reference, as assigned by the PISP, to unambiguously refer to the request related to the payment transaction. This must be the same value as the `Reference` field in the consent.")
    @get:JsonProperty("Reference") val reference: kotlin.String? = null
) {

}

