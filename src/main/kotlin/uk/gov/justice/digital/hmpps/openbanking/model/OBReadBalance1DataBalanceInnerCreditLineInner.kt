package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadBalance1DataBalanceInnerCreditLineInnerAmount

/**
 * Set of elements used to provide details on the credit line.
 * @param included Indicates whether or not the credit line is included in the balance of the account. Usage: If not present, credit line is not included in the balance amount of the account.
 * @param type Limit type, in a coded form. <br /> For a full list of enumeration values refer to `OBInternalLimitType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 * @param amount
 */
data class OBReadBalance1DataBalanceInnerCreditLineInner(

  @Schema(example = "null", required = true, description = "Indicates whether or not the credit line is included in the balance of the account. Usage: If not present, credit line is not included in the balance amount of the account.")
  @get:JsonProperty("Included", required = true) val included: kotlin.Boolean,

  @Schema(example = "null", description = "Limit type, in a coded form. <br /> For a full list of enumeration values refer to `OBInternalLimitType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
  @get:JsonProperty("Type") val type: OBReadBalance1DataBalanceInnerCreditLineInner.Type? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("Amount") val amount: OBReadBalance1DataBalanceInnerCreditLineInnerAmount? = null,
) {

  /**
   * Limit type, in a coded form. <br /> For a full list of enumeration values refer to `OBInternalLimitType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
   * Values: Available,Credit,Emergency,PreMinusAgreed,Temporary
   */
  enum class Type(@get:JsonValue val value: kotlin.String) {

    Available("Available"),
    Credit("Credit"),
    Emergency("Emergency"),
    PreMinusAgreed("Pre-Agreed"),
    Temporary("Temporary"),
    ;

    companion object {
      @JvmStatic
      @JsonCreator
      fun forValue(value: kotlin.String): Type = values().firstOrNull { it -> it.value == value }
        ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBReadBalance1DataBalanceInnerCreditLineInner'")
    }
  }
}
