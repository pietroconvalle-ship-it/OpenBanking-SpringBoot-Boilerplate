package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import uk.gov.justice.digital.hmpps.openbanking.model.OBRisk1
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteDomesticStandingOrder3Data

/**
 *
 * @param &#x60;data&#x60;
 * @param risk
 */
data class OBWriteDomesticStandingOrder3(

  @field:Valid
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("Data", required = true) val `data`: OBWriteDomesticStandingOrder3Data,

  @field:Valid
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("Risk", required = true) val risk: OBRisk1,
)
