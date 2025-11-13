package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import uk.gov.justice.digital.hmpps.openbanking.model.OBVRPFundsConfirmationResponseData

/**
 * The confirmation of funds response contains the result of a funds availability check.
 * @param &#x60;data&#x60;
 */
data class OBVRPFundsConfirmationResponse(

  @field:Valid
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("Data", required = true) val `data`: OBVRPFundsConfirmationResponseData,
)
