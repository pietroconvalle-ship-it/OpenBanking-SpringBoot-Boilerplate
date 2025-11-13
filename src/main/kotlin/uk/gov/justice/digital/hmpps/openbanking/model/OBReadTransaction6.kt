package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import uk.gov.justice.digital.hmpps.openbanking.model.Links
import uk.gov.justice.digital.hmpps.openbanking.model.Meta
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadDataTransaction6

/**
 *
 * @param &#x60;data&#x60;
 * @param links
 * @param meta
 */
data class OBReadTransaction6(

  @field:Valid
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("Data", required = true) val `data`: OBReadDataTransaction6,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("Links") val links: Links? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("Meta") val meta: Meta? = null,
)
