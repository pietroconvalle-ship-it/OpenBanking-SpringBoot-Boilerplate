package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.Size
import uk.gov.justice.digital.hmpps.openbanking.model.OBDomesticVRPDetailsDataPaymentStatusInnerStatusDetail

/**
 *
 * @param paymentTransactionId Unique identifier for the transaction within an servicing institution. This identifier is both unique and immutable.
 * @param status Status of a transfer, as assigned by the transaction administrator.
 * @param statusUpdateDateTime Date and time at which the status was assigned to the transfer.
 * @param statusDetail
 */
data class OBDomesticVRPDetailsDataPaymentStatusInner(

  @get:Size(min = 1, max = 210)
  @Schema(example = "null", required = true, description = "Unique identifier for the transaction within an servicing institution. This identifier is both unique and immutable.")
  @get:JsonProperty("PaymentTransactionId", required = true) val paymentTransactionId: kotlin.String,

  @Schema(example = "null", required = true, description = "Status of a transfer, as assigned by the transaction administrator.")
  @get:JsonProperty("Status", required = true) val status: OBDomesticVRPDetailsDataPaymentStatusInner.Status,

  @Schema(example = "null", required = true, description = "Date and time at which the status was assigned to the transfer. ")
  @get:JsonProperty("StatusUpdateDateTime", required = true) val statusUpdateDateTime: java.time.OffsetDateTime,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("StatusDetail") val statusDetail: OBDomesticVRPDetailsDataPaymentStatusInnerStatusDetail? = null,
) {

  /**
   * Status of a transfer, as assigned by the transaction administrator.
   * Values: RCVD,RJCT,CANC,PDNG,ACTC,ACCP,ACFC,ACSP,ACWC,ACSC,ACWP,ACCC,BLCK
   */
  enum class Status(@get:JsonValue val value: kotlin.String) {

    RCVD("RCVD"),
    RJCT("RJCT"),
    CANC("CANC"),
    PDNG("PDNG"),
    ACTC("ACTC"),
    ACCP("ACCP"),
    ACFC("ACFC"),
    ACSP("ACSP"),
    ACWC("ACWC"),
    ACSC("ACSC"),
    ACWP("ACWP"),
    ACCC("ACCC"),
    BLCK("BLCK"),
    ;

    companion object {
      @JvmStatic
      @JsonCreator
      fun forValue(value: kotlin.String): Status = values().firstOrNull { it -> it.value == value }
        ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBDomesticVRPDetailsDataPaymentStatusInner'")
    }
  }
}
