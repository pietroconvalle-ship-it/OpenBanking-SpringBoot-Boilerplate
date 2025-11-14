package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import uk.gov.justice.digital.hmpps.openbanking.model.OBPartyRelationships1Account

/**
 * The Party's relationships with other resources.
 * @param account
 */
data class OBPartyRelationships1(

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("Account") val account: OBPartyRelationships1Account? = null,
)
