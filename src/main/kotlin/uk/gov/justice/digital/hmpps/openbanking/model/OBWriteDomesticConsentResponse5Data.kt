package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.Size
import uk.gov.justice.digital.hmpps.openbanking.model.OBCashAccountDebtor4
import uk.gov.justice.digital.hmpps.openbanking.model.OBSCASupportData1
import uk.gov.justice.digital.hmpps.openbanking.model.OBStatusReason1
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteDomestic2DataInitiation
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteDomesticConsentResponse5DataAuthorisation
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteDomesticConsentResponse5DataChargesInner

/**
 *
 * @param consentId OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.
 * @param creationDateTime Date and time at which the resource was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 * @param status Specifies the status of consent resource in code form. For a full list of values refer to `OBInternalConsentStatus1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 * @param statusUpdateDateTime Date and time at which the resource status was updated. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 * @param initiation
 * @param statusReason
 * @param readRefundAccount Specifies to share the refund account details with PISP. For a full list of values refer to `OBInternalReadRefundAccount1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 * @param cutOffDateTime Specified cut-off date and time for the payment consent. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 * @param expectedExecutionDateTime Expected execution date and time for the payment resource. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 * @param expectedSettlementDateTime Expected settlement date and time for the payment resource. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 * @param charges
 * @param authorisation
 * @param scASupportData
 * @param debtor
 */
data class OBWriteDomesticConsentResponse5Data(

  @get:Size(min = 1, max = 128)
  @Schema(example = "null", required = true, description = "OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.")
  @get:JsonProperty("ConsentId", required = true) val consentId: kotlin.String,

  @Schema(example = "null", required = true, description = "Date and time at which the resource was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  @get:JsonProperty("CreationDateTime", required = true) val creationDateTime: java.time.OffsetDateTime,

  @Schema(example = "null", required = true, description = "Specifies the status of consent resource in code form. For a full list of values refer to `OBInternalConsentStatus1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
  @get:JsonProperty("Status", required = true) val status: OBWriteDomesticConsentResponse5Data.Status,

  @Schema(example = "null", required = true, description = "Date and time at which the resource status was updated. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  @get:JsonProperty("StatusUpdateDateTime", required = true) val statusUpdateDateTime: java.time.OffsetDateTime,

  @field:Valid
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("Initiation", required = true) val initiation: OBWriteDomestic2DataInitiation,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("StatusReason") val statusReason: kotlin.collections.List<OBStatusReason1>? = null,

  @Schema(example = "null", description = "Specifies to share the refund account details with PISP. For a full list of values refer to `OBInternalReadRefundAccount1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
  @get:JsonProperty("ReadRefundAccount") val readRefundAccount: OBWriteDomesticConsentResponse5Data.ReadRefundAccount? = null,

  @Schema(example = "null", description = "Specified cut-off date and time for the payment consent. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  @get:JsonProperty("CutOffDateTime") val cutOffDateTime: java.time.OffsetDateTime? = null,

  @Schema(example = "null", description = "Expected execution date and time for the payment resource. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  @get:JsonProperty("ExpectedExecutionDateTime") val expectedExecutionDateTime: java.time.OffsetDateTime? = null,

  @Schema(example = "null", description = "Expected settlement date and time for the payment resource. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  @get:JsonProperty("ExpectedSettlementDateTime") val expectedSettlementDateTime: java.time.OffsetDateTime? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("Charges") val charges: kotlin.collections.List<OBWriteDomesticConsentResponse5DataChargesInner>? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("Authorisation") val authorisation: OBWriteDomesticConsentResponse5DataAuthorisation? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("SCASupportData") val scASupportData: OBSCASupportData1? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("Debtor") val debtor: OBCashAccountDebtor4? = null,
) {

  /**
   * Specifies the status of consent resource in code form. For a full list of values refer to `OBInternalConsentStatus1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
   * Values: AWAU,RJCT,AUTH,COND
   */
  enum class Status(@get:JsonValue val value: kotlin.String) {

    AWAU("AWAU"),
    RJCT("RJCT"),
    AUTH("AUTH"),
    COND("COND"),
    ;

    companion object {
      @JvmStatic
      @JsonCreator
      fun forValue(value: kotlin.String): Status = values().firstOrNull { it -> it.value == value }
        ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBWriteDomesticConsentResponse5Data'")
    }
  }

  /**
   * Specifies to share the refund account details with PISP. For a full list of values refer to `OBInternalReadRefundAccount1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
   * Values: No,Yes
   */
  enum class ReadRefundAccount(@get:JsonValue val value: kotlin.String) {

    No("No"),
    Yes("Yes"),
    ;

    companion object {
      @JvmStatic
      @JsonCreator
      fun forValue(value: kotlin.String): ReadRefundAccount = values().firstOrNull { it -> it.value == value }
        ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBWriteDomesticConsentResponse5Data'")
    }
  }
}
