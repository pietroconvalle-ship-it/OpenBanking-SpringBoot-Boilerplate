package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import uk.gov.justice.digital.hmpps.openbanking.model.OBDomesticVRPControlParameters
import uk.gov.justice.digital.hmpps.openbanking.model.OBDomesticVRPInitiation

/**
 *
 * @param controlParameters
 * @param initiation
 * @param readRefundAccount Indicates whether the `RefundAccount` object should be included in the response
 */
data class OBDomesticVRPConsentRequestData(

  @field:Valid
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("ControlParameters", required = true) val controlParameters: OBDomesticVRPControlParameters,

  @field:Valid
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("Initiation", required = true) val initiation: OBDomesticVRPInitiation,

  @Schema(example = "null", description = "Indicates whether the `RefundAccount` object should be included in the response ")
  @get:JsonProperty("ReadRefundAccount") val readRefundAccount: OBDomesticVRPConsentRequestData.ReadRefundAccount? = null,
) {

  /**
   * Indicates whether the `RefundAccount` object should be included in the response
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
        ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBDomesticVRPConsentRequestData'")
    }
  }
}
