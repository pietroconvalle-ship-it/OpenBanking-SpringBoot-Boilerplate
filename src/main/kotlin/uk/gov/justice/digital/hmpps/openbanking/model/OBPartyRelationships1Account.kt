package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.Size

/**
 * Relationship to the Account resource.
 * @param related Absolute URI to the related resource.
 * @param id Unique identification as assigned by the ASPSP to uniquely identify the related resource.
 */
data class OBPartyRelationships1Account(

  @field:Valid
  @Schema(example = "https://api.alphabank.com/open-banking/v4.0/aisp/accounts/89019", required = true, description = "Absolute URI to the related resource.")
  @get:JsonProperty("Related", required = true) val related: java.net.URI,

  @get:Size(min = 1, max = 40)
  @Schema(example = "89019", required = true, description = "Unique identification as assigned by the ASPSP to uniquely identify the related resource.")
  @get:JsonProperty("Id", required = true) val id: kotlin.String,
)
