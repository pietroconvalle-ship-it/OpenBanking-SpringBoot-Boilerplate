package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.Size
import uk.gov.justice.digital.hmpps.openbanking.model.OBWritePaymentDetails1StatusDetail

/**
 *
 * @param paymentTransactionId Unique identifier for the transaction within an servicing institution. This identifier is both unique and immutable.
 * @param status Status of a transfer, as assigned by the transaction administrator. For a full list of values see `ExternalPaymentTransactionStatus1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 * @param statusUpdateDateTime Date and time at which the status was assigned to the transfer.
 * @param statusDetail
 */
data class OBWritePaymentDetails1(

  @get:Size(min = 1, max = 210)
  @Schema(example = "null", required = true, description = "Unique identifier for the transaction within an servicing institution. This identifier is both unique and immutable.")
  @get:JsonProperty("PaymentTransactionId", required = true) val paymentTransactionId: kotlin.String,

  @Schema(example = "null", required = true, description = "Status of a transfer, as assigned by the transaction administrator. For a full list of values see `ExternalPaymentTransactionStatus1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
  @get:JsonProperty("Status", required = true) val status: OBWritePaymentDetails1.Status,

  @Schema(example = "null", required = true, description = "Date and time at which the status was assigned to the transfer. ")
  @get:JsonProperty("StatusUpdateDateTime", required = true) val statusUpdateDateTime: java.time.OffsetDateTime,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("StatusDetail") val statusDetail: OBWritePaymentDetails1StatusDetail? = null,
) {

  /**
   * Status of a transfer, as assigned by the transaction administrator. For a full list of values see `ExternalPaymentTransactionStatus1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
   * Values: PDNG,ACTC,PATC,ACCP,ACFC,ACSP,ACWC,ACSC,ACWP,ACCC,BLCK,RJCT
   */
  enum class Status(@get:JsonValue val value: kotlin.String) {

    PDNG("PDNG"),
    ACTC("ACTC"),
    PATC("PATC"),
    ACCP("ACCP"),
    ACFC("ACFC"),
    ACSP("ACSP"),
    ACWC("ACWC"),
    ACSC("ACSC"),
    ACWP("ACWP"),
    ACCC("ACCC"),
    BLCK("BLCK"),
    RJCT("RJCT"),
    ;

    companion object {
      @JvmStatic
      @JsonCreator
      fun forValue(value: kotlin.String): Status = values().firstOrNull { it -> it.value == value }
        ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBWritePaymentDetails1'")
    }
  }
}
