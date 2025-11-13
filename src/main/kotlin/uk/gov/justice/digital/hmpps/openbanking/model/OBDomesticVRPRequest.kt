package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import uk.gov.justice.digital.hmpps.openbanking.model.OBDomesticVRPRequestData
import uk.gov.justice.digital.hmpps.openbanking.model.OBRisk11

/**
 *
 * @param &#x60;data&#x60;
 * @param risk
 */
data class OBDomesticVRPRequest(

  @field:Valid
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("Data", required = true) val `data`: OBDomesticVRPRequestData,

  @field:Valid
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("Risk", required = true) val risk: OBRisk11,
)
