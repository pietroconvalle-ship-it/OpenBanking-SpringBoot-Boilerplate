package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import uk.gov.justice.digital.hmpps.openbanking.model.OBEventResourceUpdate1

/**
 * Events.
 * @param urnUkOrgOpenbankingEventsResourceUpdate
 */
data class OBEvent1(

  @field:Valid
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("urn:uk:org:openbanking:events:resource-update", required = true) val urnUkOrgOpenbankingEventsResourceUpdate: OBEventResourceUpdate1,
)
