package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.Links1
import org.openapitools.model.OBDomesticVRPConsentResponseData
import org.openapitools.model.OBRisk11
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
 * @param &#x60;data&#x60; 
 * @param risk 
 * @param links 
 * @param meta Meta Data relevant to the payload. At present no fields are used for VRP.
 */
data class OBDomesticVRPConsentResponse(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("Data", required = true) val `data`: OBDomesticVRPConsentResponseData,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("Risk", required = true) val risk: OBRisk11,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("Links", required = true) val links: Links1,

    @field:Valid
    @Schema(example = "null", required = true, description = "Meta Data relevant to the payload. At present no fields are used for VRP.")
    @get:JsonProperty("Meta", required = true) val meta: kotlin.Any
) {

}

