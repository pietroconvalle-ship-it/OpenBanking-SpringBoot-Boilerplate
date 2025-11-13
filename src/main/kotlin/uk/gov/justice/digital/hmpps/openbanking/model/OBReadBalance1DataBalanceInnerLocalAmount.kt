package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.constraints.Pattern

/**
 * Optional component providing the equivalent of Amount in local currency. Default is Local Currency (LCUR) if not specified
 * @param amount A number of monetary units specified in an active currency where the unit of currency is explicit and compliant with ISO 4217.
 * @param currency A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".
 * @param subType Balance sub type, in a coded form. Default if not specified is LCUR of the account
 */
data class OBReadBalance1DataBalanceInnerLocalAmount(

  @get:Pattern(regexp = "^\\d{1,13}$|^\\d{1,13}\\.\\d{1,5}$")
  @Schema(example = "1209.06", required = true, description = "A number of monetary units specified in an active currency where the unit of currency is explicit and compliant with ISO 4217.")
  @get:JsonProperty("Amount", required = true) val amount: kotlin.String,

  @get:Pattern(regexp = "^[A-Z]{3,3}$")
  @Schema(example = "GBP", required = true, description = "A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".")
  @get:JsonProperty("Currency", required = true) val currency: kotlin.String,

  @Schema(example = "null", description = "Balance sub type, in a coded form. Default if not specified is LCUR of the account")
  @get:JsonProperty("SubType") val subType: OBReadBalance1DataBalanceInnerLocalAmount.SubType? = SubType.LCUR,
) {

  /**
   * Balance sub type, in a coded form. Default if not specified is LCUR of the account
   * Values: BCUR,LCUR
   */
  enum class SubType(@get:JsonValue val value: kotlin.String) {

    BCUR("BCUR"),
    LCUR("LCUR"),
    ;

    companion object {
      @JvmStatic
      @JsonCreator
      fun forValue(value: kotlin.String): SubType = values().firstOrNull { it -> it.value == value }
        ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBReadBalance1DataBalanceInnerLocalAmount'")
    }
  }
}
