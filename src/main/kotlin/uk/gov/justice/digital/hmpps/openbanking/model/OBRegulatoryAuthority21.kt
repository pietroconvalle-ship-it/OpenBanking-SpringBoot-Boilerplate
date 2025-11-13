package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size

/**
 * Entity requiring the regulatory reporting information.
 * @param name Name of the entity requiring the regulatory reporting information.
 * @param countryCode Nation with its own government.
 */
data class OBRegulatoryAuthority21(

  @get:Size(min = 1, max = 140)
  @Schema(example = "null", description = "Name of the entity requiring the regulatory reporting information.")
  @get:JsonProperty("Name") val name: kotlin.String? = null,

  @get:Pattern(regexp = "^[A-Z]{2,2}$")
  @Schema(example = "null", description = "Nation with its own government.")
  @get:JsonProperty("CountryCode") val countryCode: kotlin.String? = null,
)
