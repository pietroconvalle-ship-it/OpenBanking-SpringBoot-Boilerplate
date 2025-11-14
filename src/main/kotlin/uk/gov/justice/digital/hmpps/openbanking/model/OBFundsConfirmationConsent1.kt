package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import uk.gov.justice.digital.hmpps.openbanking.model.OBFundsConfirmationConsent1Data

/**
 *
 * @param &#x60;data&#x60;
 */
data class OBFundsConfirmationConsent1(

  @field:Valid
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("Data", required = true) val `data`: OBFundsConfirmationConsent1Data,
)
