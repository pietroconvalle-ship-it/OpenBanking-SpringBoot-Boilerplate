package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import io.swagger.v3.oas.annotations.media.Schema

/**
 * Details of capital repayment holiday if any
 * @param maxHolidayLength The maximum length/duration of a Repayment Holiday
 * @param maxHolidayPeriod The unit of period (days, weeks, months etc.) of the repayment holiday
 * @param notes
 */
data class OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner(

  @Schema(example = "null", description = "The maximum length/duration of a Repayment Holiday")
  @get:JsonProperty("MaxHolidayLength") val maxHolidayLength: kotlin.Int? = null,

  @Schema(example = "null", description = "The unit of period (days, weeks, months etc.) of the repayment holiday")
  @get:JsonProperty("MaxHolidayPeriod") val maxHolidayPeriod: OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner.MaxHolidayPeriod? = null,

  @Schema(example = "null", description = "")
  @get:JsonProperty("Notes") val notes: kotlin.collections.List<kotlin.String>? = null,
) {

  /**
   * The unit of period (days, weeks, months etc.) of the repayment holiday
   * Values: PACT,PDAY,PHYR,PMTH,PQTR,PWEK,PYER
   */
  enum class MaxHolidayPeriod(@get:JsonValue val value: kotlin.String) {

    PACT("PACT"),
    PDAY("PDAY"),
    PHYR("PHYR"),
    PMTH("PMTH"),
    PQTR("PQTR"),
    PWEK("PWEK"),
    PYER("PYER"),
    ;

    companion object {
      @JvmStatic
      @JsonCreator
      fun forValue(value: kotlin.String): MaxHolidayPeriod = values().firstOrNull { it -> it.value == value }
        ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner'")
    }
  }
}
