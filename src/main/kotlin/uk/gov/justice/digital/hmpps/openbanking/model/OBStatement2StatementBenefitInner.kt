package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import uk.gov.justice.digital.hmpps.openbanking.model.OBActiveOrHistoricCurrencyAndAmount5

/**
 * Set of elements used to provide details of a benefit or reward amount for the statement resource.
 * @param type Benefit type, in a coded form. For a full list of values see `OBInternalStatementBenefitType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 * @param amount
 */
data class OBStatement2StatementBenefitInner(

  @Schema(example = "UK.OBIE.Cashback", required = true, description = "Benefit type, in a coded form. For a full list of values see `OBInternalStatementBenefitType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
  @get:JsonProperty("Type", required = true) val type: kotlin.String,

  @field:Valid
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("Amount", required = true) val amount: OBActiveOrHistoricCurrencyAndAmount5,
)
