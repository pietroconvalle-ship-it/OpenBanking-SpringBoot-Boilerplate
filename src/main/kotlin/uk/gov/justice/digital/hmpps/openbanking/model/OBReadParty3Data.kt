package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import uk.gov.justice.digital.hmpps.openbanking.model.OBParty2

/**
 *
 * @param party
 */
data class OBReadParty3Data(

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("Party") val party: kotlin.collections.List<OBParty2>? = null,
)
