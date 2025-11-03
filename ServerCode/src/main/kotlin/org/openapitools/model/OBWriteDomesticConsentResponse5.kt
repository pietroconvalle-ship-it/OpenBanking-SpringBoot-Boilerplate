package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.Links
import org.openapitools.model.Meta
import org.openapitools.model.OBRisk1
import org.openapitools.model.OBWriteDomesticConsentResponse5Data
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
 * @param meta 
 */
data class OBWriteDomesticConsentResponse5(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("Data", required = true) val `data`: OBWriteDomesticConsentResponse5Data,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("Risk", required = true) val risk: OBRisk1,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("Links") val links: Links? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("Meta") val meta: Meta? = null
) {

}

