package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.constraints.Size

/**
 * Resource links to other available versions of the resource.
 * @param version Resource version.
 * @param link Resource link.
 */
data class OBEventLink1(

  @get:Size(min = 1, max = 10)
  @Schema(example = "null", required = true, description = "Resource version.")
  @get:JsonProperty("version", required = true) val version: kotlin.String,

  @Schema(example = "null", required = true, description = "Resource link.")
  @get:JsonProperty("link", required = true) val link: kotlin.String,
)
