package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import uk.gov.justice.digital.hmpps.openbanking.model.OBSCASupportData1
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteDomesticStandingOrderConsentResponse6DataAuthorisation
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteInternationalScheduled3DataInitiation

/**
 *
 * @param permission Specifies the Open Banking service request types.
 * @param initiation
 * @param readRefundAccount Specifies to share the refund account details with PISP
 * @param authorisation
 * @param scASupportData
 */
data class OBWriteInternationalScheduledConsent5Data(

  @Schema(example = "null", required = true, description = "Specifies the Open Banking service request types.")
  @get:JsonProperty("Permission", required = true) val permission: OBWriteInternationalScheduledConsent5Data.Permission,

  @field:Valid
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("Initiation", required = true) val initiation: OBWriteInternationalScheduled3DataInitiation,

  @Schema(example = "null", description = "Specifies to share the refund account details with PISP")
  @get:JsonProperty("ReadRefundAccount") val readRefundAccount: OBWriteInternationalScheduledConsent5Data.ReadRefundAccount? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("Authorisation") val authorisation: OBWriteDomesticStandingOrderConsentResponse6DataAuthorisation? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("SCASupportData") val scASupportData: OBSCASupportData1? = null,
) {

  /**
   * Specifies the Open Banking service request types.
   * Values: Create
   */
  enum class Permission(@get:JsonValue val value: kotlin.String) {

    Create("Create"),
    ;

    companion object {
      @JvmStatic
      @JsonCreator
      fun forValue(value: kotlin.String): Permission = values().firstOrNull { it -> it.value == value }
        ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBWriteInternationalScheduledConsent5Data'")
    }
  }

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
        ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBWriteInternationalScheduledConsent5Data'")
    }
  }
}
