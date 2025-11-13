package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteFundsConfirmationResponse1DataFundsAvailableResult

/**
 *
 * @param fundsAvailableResult
 * @param supplementaryData Additional information that can not be captured in the structured fields and/or any other specific block.
 */
data class OBWriteFundsConfirmationResponse1Data(

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("FundsAvailableResult") val fundsAvailableResult: OBWriteFundsConfirmationResponse1DataFundsAvailableResult? = null,

  @field:Valid
  @Schema(example = "null", description = "Additional information that can not be captured in the structured fields and/or any other specific block.")
  @get:JsonProperty("SupplementaryData") val supplementaryData: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,
)
