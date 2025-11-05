package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import jakarta.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * Combined sum of all Amounts in the accounts base currency
 * @param amount A number of monetary units specified in an active currency where the unit of currency is explicit and compliant with ISO 4217.
 * @param currency A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".
 */
data class OBReadBalance1DataTotalValue(

    @get:Pattern(regexp="^\\d{1,13}$|^\\d{1,13}\\.\\d{1,5}$")
    @Schema(example = "1209.06", required = true, description = "A number of monetary units specified in an active currency where the unit of currency is explicit and compliant with ISO 4217.")
    @get:JsonProperty("Amount", required = true) val amount: kotlin.String,

    @get:Pattern(regexp="^[A-Z]{3,3}$")
    @Schema(example = "GBP", required = true, description = "A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".")
    @get:JsonProperty("Currency", required = true) val currency: kotlin.String
) {

}

