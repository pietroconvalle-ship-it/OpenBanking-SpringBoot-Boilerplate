package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import uk.gov.justice.digital.hmpps.openbanking.model.OBActiveOrHistoricCurrencyAndAmount7
import uk.gov.justice.digital.hmpps.openbanking.model.OBCreditDebitCode0
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
 * Set of elements used to provide details of a generic interest amount related to the statement resource.
 * @param creditDebitIndicator 
 * @param type Interest amount type, in a coded form. For a full list of values see `OBInternalStatementInterestType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 * @param amount 
 * @param description Description that may be available for the statement interest.
 * @param rate Rate for Statement Interest (where it is applicable in terms of a rate rather than an amount)
 * @param rateType Interest amount type, in a coded form. For a full list of values see `OBInternalStatementInterestType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 * @param frequency Specifies the statement fee type requested. For a full list of values see `OBInternalStatementInterestFrequency1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 */
data class OBStatement2StatementInterestInner(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("CreditDebitIndicator", required = true) val creditDebitIndicator: OBCreditDebitCode0,

    @Schema(example = "UK.OBIE.Total", required = true, description = "Interest amount type, in a coded form. For a full list of values see `OBInternalStatementInterestType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
    @get:JsonProperty("Type", required = true) val type: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("Amount", required = true) val amount: OBActiveOrHistoricCurrencyAndAmount7,

    @get:Size(min=1,max=128)
    @Schema(example = "Interest occurred over statement duration", description = "Description that may be available for the statement interest.")
    @get:JsonProperty("Description") val description: kotlin.String? = null,

    @Schema(example = "0.05", description = "Rate for Statement Interest (where it is applicable in terms of a rate rather than an amount)")
    @get:JsonProperty("Rate") val rate: java.math.BigDecimal? = null,

    @Schema(example = "UK.OBIE.Total", description = "Interest amount type, in a coded form. For a full list of values see `OBInternalStatementInterestType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
    @get:JsonProperty("RateType") val rateType: kotlin.String? = null,

    @Schema(example = "UK.OBIE.Monthly", description = "Specifies the statement fee type requested. For a full list of values see `OBInternalStatementInterestFrequency1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
    @get:JsonProperty("Frequency") val frequency: kotlin.String? = null
) {

}

