package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.Size
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner

/**
 * Details about the interest that may be payable to the Account holders
 * @param tierBandSet
 */
data class OBReadProduct2DataProductInnerOtherProductTypeCreditInterest(

  @field:Valid
  @get:Size(min = 1)
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("TierBandSet", required = true) val tierBandSet: kotlin.collections.List<OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner>,
)
