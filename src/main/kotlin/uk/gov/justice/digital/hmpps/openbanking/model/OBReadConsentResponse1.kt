package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Locale
import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import uk.gov.justice.digital.hmpps.openbanking.model.Links
import uk.gov.justice.digital.hmpps.openbanking.model.Meta
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadConsentResponse1Data
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
 * @param risk The Risk section is sent by the initiating party to the ASPSP. <br /> It is used to specify additional details for risk scoring for Account Info.
 * @param links 
 * @param meta 
 */
data class OBReadConsentResponse1(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("Data", required = true) val `data`: OBReadConsentResponse1Data,

    @field:Valid
    @Schema(example = "null", required = true, description = "The Risk section is sent by the initiating party to the ASPSP. <br /> It is used to specify additional details for risk scoring for Account Info.")
    @get:JsonProperty("Risk", required = true) val risk: kotlin.Any,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("Links") val links: Links? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("Meta") val meta: Meta? = null
) {

}

