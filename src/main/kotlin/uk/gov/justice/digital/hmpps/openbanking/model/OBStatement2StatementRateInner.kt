package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Locale
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
 * Set of elements used to provide details of a generic rate related to the statement resource.
 * @param rate Rate associated with the statement rate type.
 * @param type Statement rate type, in a coded form. For a full list of values see `OBInternalStatementRateType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 */
data class OBStatement2StatementRateInner(

    @get:Pattern(regexp="^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")
    @get:Size(max=40)
    @Schema(example = "0.224", required = true, description = "Rate associated with the statement rate type.")
    @get:JsonProperty("Rate", required = true) val rate: kotlin.String,

    @Schema(example = "UK.OBIE.AnnualCash", required = true, description = "Statement rate type, in a coded form. For a full list of values see `OBInternalStatementRateType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
    @get:JsonProperty("Type", required = true) val type: kotlin.String
) {

}

