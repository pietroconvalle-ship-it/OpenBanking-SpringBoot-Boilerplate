package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import uk.gov.justice.digital.hmpps.openbanking.model.OBTransaction6

/**
 *
 * @param transaction
 */
data class OBReadDataTransaction6(

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("Transaction") val transaction: kotlin.collections.List<OBTransaction6>? = null,
)
