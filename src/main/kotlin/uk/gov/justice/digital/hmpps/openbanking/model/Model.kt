package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema

/**
 *
 * @param id
 */
data class Model(

  @Schema(example = "null", description = "")
  @get:JsonProperty("id") val id: kotlin.Long? = null,
)
