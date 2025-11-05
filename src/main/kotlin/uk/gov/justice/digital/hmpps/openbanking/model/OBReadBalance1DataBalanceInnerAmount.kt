package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * Amount of money of the cash balance.
 * @param amount A number of monetary units specified in an active currency where the unit of currency is explicit and compliant with ISO 4217.
 * @param currency A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".
 * @param subType Balance sub type, in a coded form. Default if not specified is BCUR of the account
 */
data class OBReadBalance1DataBalanceInnerAmount(

    @get:Pattern(regexp="^\\d{1,13}$|^\\d{1,13}\\.\\d{1,5}$")
    @Schema(example = "1209.06", required = true, description = "A number of monetary units specified in an active currency where the unit of currency is explicit and compliant with ISO 4217.")
    @get:JsonProperty("Amount", required = true) val amount: kotlin.String,

    @get:Pattern(regexp="^[A-Z]{3,3}$")
    @Schema(example = "GBP", required = true, description = "A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".")
    @get:JsonProperty("Currency", required = true) val currency: kotlin.String,

    @Schema(example = "null", description = "Balance sub type, in a coded form. Default if not specified is BCUR of the account")
    @get:JsonProperty("SubType") val subType: OBReadBalance1DataBalanceInnerAmount.SubType? = SubType.BCUR
) {

    /**
    * Balance sub type, in a coded form. Default if not specified is BCUR of the account
    * Values: BCUR,LCUR
    */
    enum class SubType(val value: kotlin.String) {

        @JsonProperty("BCUR") BCUR("BCUR"),
        @JsonProperty("LCUR") LCUR("LCUR")
    }

}

