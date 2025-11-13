package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.Size
import uk.gov.justice.digital.hmpps.openbanking.model.OBCashAccountDebtorWithName
import uk.gov.justice.digital.hmpps.openbanking.model.OBDomesticVRPControlParameters
import uk.gov.justice.digital.hmpps.openbanking.model.OBDomesticVRPInitiation
import uk.gov.justice.digital.hmpps.openbanking.model.OBStatusReason3

/**
 *
 * @param consentId Unique identification as assigned by the ASPSP to uniquely identify the consent resource.
 * @param creationDateTime Date and time at which the resource was created.
 * @param status Specifies the status of consent resource in code form. AWAU and RJCT only can returned on initial submission. For a full list of values see `OBInternalConsentStatus1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 * @param statusUpdateDateTime Date and time at which the resource status was updated.
 * @param controlParameters
 * @param initiation
 * @param readRefundAccount Indicates whether information about RefundAccount should be included in the payment response.
 * @param statusReason
 * @param debtorAccount The DebtorAccount details as specified by the PSU when account selection happens at the ASPSP. *Note:* The details must be provided in the consent response (OBDomesticVRPConsentResponse) by the ASPSP to enable the PISP to associate it with future VRP payments that are made using the VRP Consent.
 */
data class OBDomesticVRPConsentResponseData(

  @get:Size(min = 1, max = 128)
  @Schema(example = "null", required = true, description = "Unique identification as assigned by the ASPSP to uniquely identify the consent resource. ")
  @get:JsonProperty("ConsentId", required = true) val consentId: kotlin.String,

  @Schema(example = "null", required = true, description = "Date and time at which the resource was created. ")
  @get:JsonProperty("CreationDateTime", required = true) val creationDateTime: java.time.OffsetDateTime,

  @Schema(example = "null", required = true, description = "Specifies the status of consent resource in code form. AWAU and RJCT only can returned on initial submission. For a full list of values see `OBInternalConsentStatus1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
  @get:JsonProperty("Status", required = true) val status: OBDomesticVRPConsentResponseData.Status,

  @Schema(example = "null", required = true, description = "Date and time at which the resource status was updated. ")
  @get:JsonProperty("StatusUpdateDateTime", required = true) val statusUpdateDateTime: java.time.OffsetDateTime,

  @field:Valid
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("ControlParameters", required = true) val controlParameters: OBDomesticVRPControlParameters,

  @field:Valid
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("Initiation", required = true) val initiation: OBDomesticVRPInitiation,

  @Schema(example = "null", description = "Indicates whether information about RefundAccount should be included in the payment response. ")
  @get:JsonProperty("ReadRefundAccount") val readRefundAccount: OBDomesticVRPConsentResponseData.ReadRefundAccount? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("StatusReason") val statusReason: kotlin.collections.List<OBStatusReason3>? = null,

  @field:Valid
  @Schema(example = "null", description = "The DebtorAccount details as specified by the PSU when account selection happens at the ASPSP. *Note:* The details must be provided in the consent response (OBDomesticVRPConsentResponse) by the ASPSP to enable the PISP to associate it with future VRP payments that are made using the VRP Consent.")
  @get:JsonProperty("DebtorAccount") val debtorAccount: OBCashAccountDebtorWithName? = null,
) {

  /**
   * Specifies the status of consent resource in code form. AWAU and RJCT only can returned on initial submission. For a full list of values see `OBInternalConsentStatus1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
   * Values: AWAU,RJCT,AUTH,CANC,EXPD
   */
  enum class Status(@get:JsonValue val value: kotlin.String) {

    AWAU("AWAU"),
    RJCT("RJCT"),
    AUTH("AUTH"),
    CANC("CANC"),
    EXPD("EXPD"),
    ;

    companion object {
      @JvmStatic
      @JsonCreator
      fun forValue(value: kotlin.String): Status = values().firstOrNull { it -> it.value == value }
        ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBDomesticVRPConsentResponseData'")
    }
  }

  /**
   * Indicates whether information about RefundAccount should be included in the payment response.
   * Values: Yes,No
   */
  enum class ReadRefundAccount(@get:JsonValue val value: kotlin.String) {

    Yes("Yes"),
    No("No"),
    ;

    companion object {
      @JvmStatic
      @JsonCreator
      fun forValue(value: kotlin.String): ReadRefundAccount = values().firstOrNull { it -> it.value == value }
        ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBDomesticVRPConsentResponseData'")
    }
  }
}
