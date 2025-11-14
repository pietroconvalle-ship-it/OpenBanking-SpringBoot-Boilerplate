package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import uk.gov.justice.digital.hmpps.openbanking.model.OBStandingOrder6

/**
 *
 * @param standingOrder
 */
data class OBReadStandingOrder6Data(

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("StandingOrder") val standingOrder: kotlin.collections.List<OBStandingOrder6>? = null,
)
