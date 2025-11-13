package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadOffer1DataOfferInner

/**
 *
 * @param offer
 */
data class OBReadOffer1Data(

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("Offer") val offer: kotlin.collections.List<OBReadOffer1DataOfferInner>? = null,
)
