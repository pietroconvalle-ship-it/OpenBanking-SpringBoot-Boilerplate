package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import uk.gov.justice.digital.hmpps.openbanking.model.OBWritePaymentDetails1

/**
 *
 * @param paymentStatus
 */
data class OBWritePaymentDetailsResponse1Data(

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("PaymentStatus") val paymentStatus: kotlin.collections.List<OBWritePaymentDetails1>? = null,
)
