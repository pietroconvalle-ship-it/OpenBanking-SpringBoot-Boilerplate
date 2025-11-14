package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import uk.gov.justice.digital.hmpps.openbanking.model.Links1
import uk.gov.justice.digital.hmpps.openbanking.model.OBDomesticVRPResponseData
import uk.gov.justice.digital.hmpps.openbanking.model.OBRisk11

/**
 *
 * @param &#x60;data&#x60;
 * @param risk
 * @param links
 * @param meta Meta Data relevant to the payload. At present no fields are used for VRP.
 */
data class OBDomesticVRPResponse(

  @field:Valid
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("Data", required = true) val `data`: OBDomesticVRPResponseData,

  @field:Valid
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("Risk", required = true) val risk: OBRisk11,

  @field:Valid
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("Links", required = true) val links: Links1,

  @field:Valid
  @Schema(example = "null", required = true, description = "Meta Data relevant to the payload. At present no fields are used for VRP.")
  @get:JsonProperty("Meta", required = true) val meta: kotlin.Any,
)
