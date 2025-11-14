package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.Size
import uk.gov.justice.digital.hmpps.openbanking.model.TierBandSetInner1

/**
 * Details about the interest that may be payable to the PCA account holders
 * @param tierBandSet The group of tiers or bands for which credit interest can be applied.
 */
data class CreditInterest1(

  @field:Valid
  @get:Size(min = 1)
  @Schema(example = "null", required = true, description = "The group of tiers or bands for which credit interest can be applied.")
  @get:JsonProperty("TierBandSet", required = true) val tierBandSet: kotlin.collections.List<TierBandSetInner1>,
)
