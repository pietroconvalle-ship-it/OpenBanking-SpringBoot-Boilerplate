package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.Size
import uk.gov.justice.digital.hmpps.openbanking.model.OBCashAccountDebtor4
import uk.gov.justice.digital.hmpps.openbanking.model.OBStatusReason1
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteDomesticConsentResponse5DataChargesInner
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteDomesticResponse5DataRefund
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteDomesticScheduledResponse5DataMultiAuthorisation
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteDomesticStandingOrder3DataInitiation

/**
 *
 * @param domesticStandingOrderId OB: Unique identification as assigned by the ASPSP to uniquely identify the domestic standing order resource.
 * @param consentId OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.
 * @param creationDateTime Date and time at which the resource was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 * @param status Specifies the status of the payment order resource. For a full list of values see `ExternalPaymentTransactionStatus1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 * @param statusUpdateDateTime Date and time at which the resource status was updated. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 * @param initiation
 * @param statusReason
 * @param refund
 * @param charges
 * @param multiAuthorisation
 * @param debtor
 */
data class OBWriteDomesticStandingOrderResponse6Data(

  @get:Size(min = 1, max = 40)
  @Schema(example = "null", required = true, description = "OB: Unique identification as assigned by the ASPSP to uniquely identify the domestic standing order resource.")
  @get:JsonProperty("DomesticStandingOrderId", required = true) val domesticStandingOrderId: kotlin.String,

  @get:Size(min = 1, max = 128)
  @Schema(example = "null", required = true, description = "OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.")
  @get:JsonProperty("ConsentId", required = true) val consentId: kotlin.String,

  @Schema(example = "null", required = true, description = "Date and time at which the resource was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  @get:JsonProperty("CreationDateTime", required = true) val creationDateTime: java.time.OffsetDateTime,

  @Schema(example = "null", required = true, description = "Specifies the status of the payment order resource. For a full list of values see `ExternalPaymentTransactionStatus1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
  @get:JsonProperty("Status", required = true) val status: OBWriteDomesticStandingOrderResponse6Data.Status,

  @Schema(example = "null", required = true, description = "Date and time at which the resource status was updated. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  @get:JsonProperty("StatusUpdateDateTime", required = true) val statusUpdateDateTime: java.time.OffsetDateTime,

  @field:Valid
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("Initiation", required = true) val initiation: OBWriteDomesticStandingOrder3DataInitiation,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("StatusReason") val statusReason: kotlin.collections.List<OBStatusReason1>? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("Refund") val refund: OBWriteDomesticResponse5DataRefund? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("Charges") val charges: kotlin.collections.List<OBWriteDomesticConsentResponse5DataChargesInner>? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("MultiAuthorisation") val multiAuthorisation: OBWriteDomesticScheduledResponse5DataMultiAuthorisation? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("Debtor") val debtor: OBCashAccountDebtor4? = null,
) {

  /**
   * Specifies the status of the payment order resource. For a full list of values see `ExternalPaymentTransactionStatus1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
   * Values: RCVD,CANC,ACTC,PATC,PDNG,INFA,INCO,RJCT
   */
  enum class Status(@get:JsonValue val value: kotlin.String) {

    RCVD("RCVD"),
    CANC("CANC"),
    ACTC("ACTC"),
    PATC("PATC"),
    PDNG("PDNG"),
    INFA("INFA"),
    INCO("INCO"),
    RJCT("RJCT"),
    ;

    companion object {
      @JvmStatic
      @JsonCreator
      fun forValue(value: kotlin.String): Status = values().firstOrNull { it -> it.value == value }
        ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBWriteDomesticStandingOrderResponse6Data'")
    }
  }
}
