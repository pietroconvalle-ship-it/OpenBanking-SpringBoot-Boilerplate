package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import uk.gov.justice.digital.hmpps.openbanking.model.OBDomesticVRPDetailsDataPaymentStatusInner

/**
 *
 * @param paymentStatus
 */
data class OBDomesticVRPDetailsData(

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("PaymentStatus") val paymentStatus: kotlin.collections.List<OBDomesticVRPDetailsDataPaymentStatusInner>? = null,
)
