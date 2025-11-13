package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid

/**
 * Links relevant to the payload
 * @param self
 * @param first
 * @param prev
 * @param next
 * @param last
 */
data class Links1(

  @field:Valid
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("Self", required = true) val self: java.net.URI,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("First") val first: java.net.URI? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("Prev") val prev: java.net.URI? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("Next") val next: java.net.URI? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("Last") val last: java.net.URI? = null,
)
