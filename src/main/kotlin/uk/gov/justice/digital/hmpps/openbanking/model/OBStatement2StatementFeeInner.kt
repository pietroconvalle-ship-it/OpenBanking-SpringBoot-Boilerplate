package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import uk.gov.justice.digital.hmpps.openbanking.model.OBActiveOrHistoricCurrencyAndAmount6
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
 * Set of elements used to provide details of a fee for the statement resource.
 * @param creditDebitIndicator 
 * @param type Fee type, in a coded form. For a full list of values see `OBInternalStatementFeeType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 * @param amount 
 * @param description Description that may be available for the statement fee.
 * @param rate Rate charged for Statement Fee (where it is charged in terms of a rate rather than an amount)
 * @param rateType Description that may be available for the statement fee rate type. For a full list of values see `OBInternalStatementFeeRateType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 * @param frequency How frequently the fee is applied to the Account. For a full list of values see `OBInternalStatementFeeFrequency1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 */
data class OBStatement2StatementFeeInner(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("CreditDebitIndicator", required = true) val creditDebitIndicator: OBCreditDebitCode0,

    @Schema(example = "UK.OBIE.Annual", required = true, description = "Fee type, in a coded form. For a full list of values see `OBInternalStatementFeeType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
    @get:JsonProperty("Type", required = true) val type: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("Amount", required = true) val amount: OBActiveOrHistoricCurrencyAndAmount6,

    @get:Size(min=1,max=128)
    @Schema(example = "International usage charge", description = "Description that may be available for the statement fee.")
    @get:JsonProperty("Description") val description: kotlin.String? = null,

    @Schema(example = "0.05", description = "Rate charged for Statement Fee (where it is charged in terms of a rate rather than an amount)")
    @get:JsonProperty("Rate") val rate: java.math.BigDecimal? = null,

    @Schema(example = "UK.OBIE.AER", description = "Description that may be available for the statement fee rate type. For a full list of values see `OBInternalStatementFeeRateType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
    @get:JsonProperty("RateType") val rateType: kotlin.String? = null,

    @Schema(example = "UK.OBIE.StatementMonthly", description = "How frequently the fee is applied to the Account. For a full list of values see `OBInternalStatementFeeFrequency1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
    @get:JsonProperty("Frequency") val frequency: kotlin.String? = null
) {

}

