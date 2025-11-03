package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.OBReadBalance1DataBalanceInnerCreditLineInnerAmount
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
    @get:JsonProperty("Amount") val amount: OBReadBalance1DataBalanceInnerCreditLineInnerAmount? = null
) {

    /**
    * Limit type, in a coded form. <br /> For a full list of enumeration values refer to `OBInternalLimitType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
    * Values: Available,Credit,Emergency,PreMinusAgreed,Temporary
    */
    enum class Type(val value: kotlin.String) {

        @JsonProperty("Available") Available("Available"),
        @JsonProperty("Credit") Credit("Credit"),
        @JsonProperty("Emergency") Emergency("Emergency"),
        @JsonProperty("Pre-Agreed") PreMinusAgreed("Pre-Agreed"),
        @JsonProperty("Temporary") Temporary("Temporary")
    }

}

