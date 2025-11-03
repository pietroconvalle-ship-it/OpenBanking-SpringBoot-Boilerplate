package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.OBDomesticVRPInitiation
import org.openapitools.model.OBDomesticVRPInstruction
import org.openapitools.model.OBVRPInteractionTypes
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
 * @param consentId Identifier for the Domestic VRP Consent that this payment is made under.
 * @param psUAuthenticationMethod 
 * @param vrPType 
 * @param initiation 
 * @param instruction 
 * @param psUInteractionType 
 */
data class OBDomesticVRPRequestData(

    @get:Size(min=1,max=128)
    @Schema(example = "null", required = true, description = "Identifier for the Domestic VRP Consent that this payment is made under.")
    @get:JsonProperty("ConsentId", required = true) val consentId: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("PSUAuthenticationMethod", required = true) val psUAuthenticationMethod: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("VRPType", required = true) val vrPType: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("Initiation", required = true) val initiation: OBDomesticVRPInitiation,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("Instruction", required = true) val instruction: OBDomesticVRPInstruction,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("PSUInteractionType") val psUInteractionType: OBVRPInteractionTypes? = null
) {

}

