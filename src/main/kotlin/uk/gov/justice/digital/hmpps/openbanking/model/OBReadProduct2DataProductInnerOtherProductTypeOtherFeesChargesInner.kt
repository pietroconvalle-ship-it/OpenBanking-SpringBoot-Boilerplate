package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.Size
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeChargeCapInner
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerOtherTariffType

/**
 * Contains details of fees and charges which are not associated with either Overdraft or features/benefits
 * @param feeChargeDetail
 * @param tariffType TariffType which defines the fee and charges.
 * @param tariffName Name of the tariff
 * @param otherTariffType
 * @param feeChargeCap
 */
data class OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner(

  @field:Valid
  @get:Size(min = 1)
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("FeeChargeDetail", required = true) val feeChargeDetail: kotlin.collections.List<OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner>,

  @Schema(example = "null", description = "TariffType which defines the fee and charges.")
  @get:JsonProperty("TariffType") val tariffType: OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner.TariffType? = null,

  @get:Size(min = 1, max = 350)
  @Schema(example = "null", description = "Name of the tariff")
  @get:JsonProperty("TariffName") val tariffName: kotlin.String? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("OtherTariffType") val otherTariffType: OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerOtherTariffType? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("FeeChargeCap") val feeChargeCap: kotlin.collections.List<OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeChargeCapInner>? = null,
) {

  /**
   * TariffType which defines the fee and charges.
   * Values: TTEL,TTMX,TTOT
   */
  enum class TariffType(@get:JsonValue val value: kotlin.String) {

    TTEL("TTEL"),
    TTMX("TTMX"),
    TTOT("TTOT"),
    ;

    companion object {
      @JvmStatic
      @JsonCreator
      fun forValue(value: kotlin.String): TariffType = values().firstOrNull { it -> it.value == value }
        ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner'")
    }
  }
}
