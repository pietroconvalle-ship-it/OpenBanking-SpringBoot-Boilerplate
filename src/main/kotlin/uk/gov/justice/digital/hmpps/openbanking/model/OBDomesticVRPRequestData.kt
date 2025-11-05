package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Locale
import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import uk.gov.justice.digital.hmpps.openbanking.model.OBDomesticVRPInitiation
import uk.gov.justice.digital.hmpps.openbanking.model.OBDomesticVRPInstruction
import uk.gov.justice.digital.hmpps.openbanking.model.OBVRPInteractionTypes
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
 * @param psUAuthenticationMethod The authentication method that was used to authenticate the PSU.
 * @param vrPType 
 * @param initiation 
 * @param instruction 
 * @param psUInteractionType Indicates interaction type, currently if customer is present or not present. If not provided the default is `OffSession` (customer is not present) when the individual VRP payment is made.
 */
data class OBDomesticVRPRequestData(

    @get:Size(min=1,max=128)
    @Schema(example = "null", required = true, description = "Identifier for the Domestic VRP Consent that this payment is made under.")
    @get:JsonProperty("ConsentId", required = true) val consentId: kotlin.String,

    @Schema(example = "null", required = true, description = "The authentication method that was used to authenticate the PSU.")
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
    @Schema(example = "null", description = "Indicates interaction type, currently if customer is present or not present. If not provided the default is `OffSession` (customer is not present) when the individual VRP payment is made.")
    @get:JsonProperty("PSUInteractionType") val psUInteractionType: OBVRPInteractionTypes? = null
) {

}

