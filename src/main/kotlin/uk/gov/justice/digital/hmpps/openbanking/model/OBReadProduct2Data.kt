package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadProduct2DataProductInner

/**
 * Aligning with the read write specs structure.
 * @param product
 */
data class OBReadProduct2Data(

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("Product") val product: kotlin.collections.List<OBReadProduct2DataProductInner>? = null,
)
