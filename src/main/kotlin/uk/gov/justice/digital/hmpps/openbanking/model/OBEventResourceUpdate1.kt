package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import uk.gov.justice.digital.hmpps.openbanking.model.OBEventSubject1

/**
 * Resource-Update Event.
 * @param subject
 */
data class OBEventResourceUpdate1(

  @field:Valid
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("subject", required = true) val subject: OBEventSubject1,
)
