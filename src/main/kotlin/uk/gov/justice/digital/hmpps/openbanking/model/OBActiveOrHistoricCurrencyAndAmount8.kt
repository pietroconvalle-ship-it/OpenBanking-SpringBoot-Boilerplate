package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.Pattern
import uk.gov.justice.digital.hmpps.openbanking.model.OBExternalBalanceSubType1Code

/**
 * Amount of money associated with the amount type.
 * @param amount A number of monetary units specified in an active currency where the unit of currency is explicit and compliant with ISO 4217.
 * @param currency A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".
 * @param subType
 */
data class OBActiveOrHistoricCurrencyAndAmount8(

  @get:Pattern(regexp = "^\\d{1,13}$|^\\d{1,13}\\.\\d{1,5}$")
  @Schema(example = "1209.06", required = true, description = "A number of monetary units specified in an active currency where the unit of currency is explicit and compliant with ISO 4217.")
  @get:JsonProperty("Amount", required = true) val amount: kotlin.String,

  @get:Pattern(regexp = "^[A-Z]{3,3}$")
  @Schema(example = "GBP", required = true, description = "A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".")
  @get:JsonProperty("Currency", required = true) val currency: kotlin.String,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("SubType") val subType: OBExternalBalanceSubType1Code? = null,
)
