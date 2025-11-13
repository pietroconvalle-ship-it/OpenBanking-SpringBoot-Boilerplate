package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadConsent1Data

/**
 *
 * @param &#x60;data&#x60;
 * @param risk The Risk section is sent by the initiating party to the ASPSP. <br /> It is used to specify additional details for risk scoring for Account Info.
 */
data class OBReadConsent1(

  @field:Valid
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("Data", required = true) val `data`: OBReadConsent1Data,

  @field:Valid
  @Schema(example = "null", required = true, description = "The Risk section is sent by the initiating party to the ASPSP. <br /> It is used to specify additional details for risk scoring for Account Info.")
  @get:JsonProperty("Risk", required = true) val risk: kotlin.Any,
)
