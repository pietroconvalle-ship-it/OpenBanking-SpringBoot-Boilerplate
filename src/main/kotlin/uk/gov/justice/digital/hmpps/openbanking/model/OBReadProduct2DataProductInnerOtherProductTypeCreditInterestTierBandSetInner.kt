package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.Size
import uk.gov.justice.digital.hmpps.openbanking.model.OBInterestCalculationMethod1Code
import uk.gov.justice.digital.hmpps.openbanking.model.OBOtherCodeType10
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner

/**
 * The group of tiers or bands for which credit interest can be applied.
 * @param tierBandMethod The methodology of how credit interest is paid/applied. It can be:- 1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases. 2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance. 3. Whole The same interest rate is applied irrespective of the product holder's account balance
 * @param destination Describes whether accrued interest is payable only to the BCA or to another bank account
 * @param tierBand
 * @param calculationMethod
 * @param notes
 * @param otherCalculationMethod
 * @param otherDestination
 */
data class OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner(

  @Schema(example = "null", required = true, description = "The methodology of how credit interest is paid/applied. It can be:- 1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases. 2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance. 3. Whole The same interest rate is applied irrespective of the product holder's account balance")
  @get:JsonProperty("TierBandMethod", required = true) val tierBandMethod: OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner.TierBandMethod,

  @Schema(example = "null", required = true, description = "Describes whether accrued interest is payable only to the BCA or to another bank account")
  @get:JsonProperty("Destination", required = true) val destination: OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner.Destination,

  @field:Valid
  @get:Size(min = 1)
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("TierBand", required = true) val tierBand: kotlin.collections.List<OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner>,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("CalculationMethod") val calculationMethod: OBInterestCalculationMethod1Code? = null,

  @Schema(example = "null", description = "")
  @get:JsonProperty("Notes") val notes: kotlin.collections.List<kotlin.String>? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("OtherCalculationMethod") val otherCalculationMethod: OBOtherCodeType10? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("OtherDestination") val otherDestination: OBOtherCodeType10? = null,
) {

  /**
   * The methodology of how credit interest is paid/applied. It can be:- 1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases. 2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance. 3. Whole The same interest rate is applied irrespective of the product holder's account balance
   * Values: INBA,INTI,INWH
   */
  enum class TierBandMethod(@get:JsonValue val value: kotlin.String) {

    INBA("INBA"),
    INTI("INTI"),
    INWH("INWH"),
    ;

    companion object {
      @JvmStatic
      @JsonCreator
      fun forValue(value: kotlin.String): TierBandMethod = values().firstOrNull { it -> it.value == value }
        ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner'")
    }
  }

  /**
   * Describes whether accrued interest is payable only to the BCA or to another bank account
   * Values: INOT,INPA,INSC
   */
  enum class Destination(@get:JsonValue val value: kotlin.String) {

    INOT("INOT"),
    INPA("INPA"),
    INSC("INSC"),
    ;

    companion object {
      @JvmStatic
      @JsonCreator
      fun forValue(value: kotlin.String): Destination = values().firstOrNull { it -> it.value == value }
        ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner'")
    }
  }
}
