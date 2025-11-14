package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import uk.gov.justice.digital.hmpps.openbanking.model.OBSCASupportData1
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteDomesticStandingOrderConsentResponse6DataAuthorisation
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteInternationalConsent5DataInitiation

/**
 *
 * @param initiation
 * @param readRefundAccount Specifies to share the refund account details with PISP
 * @param authorisation
 * @param scASupportData
 */
data class OBWriteInternationalConsent5Data(

  @field:Valid
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("Initiation", required = true) val initiation: OBWriteInternationalConsent5DataInitiation,

  @Schema(example = "null", description = "Specifies to share the refund account details with PISP")
  @get:JsonProperty("ReadRefundAccount") val readRefundAccount: OBWriteInternationalConsent5Data.ReadRefundAccount? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("Authorisation") val authorisation: OBWriteDomesticStandingOrderConsentResponse6DataAuthorisation? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("SCASupportData") val scASupportData: OBSCASupportData1? = null,
) {

  /**
   * Specifies to share the refund account details with PISP
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
        ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBWriteInternationalConsent5Data'")
    }
  }
}
