package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import uk.gov.justice.digital.hmpps.openbanking.model.OBScheduledPayment3

/**
 *
 * @param scheduledPayment
 */
data class OBReadScheduledPayment3Data(

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("ScheduledPayment") val scheduledPayment: kotlin.collections.List<OBScheduledPayment3>? = null,
)
