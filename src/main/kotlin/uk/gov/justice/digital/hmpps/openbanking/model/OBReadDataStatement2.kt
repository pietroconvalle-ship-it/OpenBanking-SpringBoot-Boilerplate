package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import uk.gov.justice.digital.hmpps.openbanking.model.OBStatement2

/**
 *
 * @param statement
 */
data class OBReadDataStatement2(

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("Statement") val statement: kotlin.collections.List<OBStatement2>? = null,
)
