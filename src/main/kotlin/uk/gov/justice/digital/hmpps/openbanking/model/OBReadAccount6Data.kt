package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import uk.gov.justice.digital.hmpps.openbanking.model.OBAccount6

/**
 *
 * @param account
 */
data class OBReadAccount6Data(

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("Account") val account: kotlin.collections.List<OBAccount6>? = null,
)
