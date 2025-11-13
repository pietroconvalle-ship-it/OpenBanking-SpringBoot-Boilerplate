package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.Size
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInner

/**
 * Borrowing details
 * @param overdraftTierBandSet
 * @param notes
 */
data class OBReadProduct2DataProductInnerOtherProductTypeOverdraft(

  @field:Valid
  @get:Size(min = 1)
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("OverdraftTierBandSet", required = true) val overdraftTierBandSet: kotlin.collections.List<OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInner>,

  @Schema(example = "null", description = "")
  @get:JsonProperty("Notes") val notes: kotlin.collections.List<kotlin.String>? = null,
)
