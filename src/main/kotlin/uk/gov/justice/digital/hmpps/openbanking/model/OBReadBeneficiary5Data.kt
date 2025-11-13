package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import uk.gov.justice.digital.hmpps.openbanking.model.OBBeneficiary5

/**
 *
 * @param beneficiary
 */
data class OBReadBeneficiary5Data(

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("Beneficiary") val beneficiary: kotlin.collections.List<OBBeneficiary5>? = null,
)
