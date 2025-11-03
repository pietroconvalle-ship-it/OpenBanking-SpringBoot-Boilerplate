package org.openapitools.model

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
 * Set of elements used to provide details of a generic number value related to the statement resource.
 * @param &#x60;value&#x60; Value associated with the statement value type.
 * @param type Statement value type, in a coded form. For a full list of values see `OBInternalStatementValueType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 */
data class OBStatement2StatementValueInner(

    @get:Size(min=1,max=40)
    @Schema(example = "null", required = true, description = "Value associated with the statement value type.")
    @get:JsonProperty("Value", required = true) val `value`: kotlin.String,

    @Schema(example = "UK.OBIE.Credit", required = true, description = "Statement value type, in a coded form. For a full list of values see `OBInternalStatementValueType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
    @get:JsonProperty("Type", required = true) val type: kotlin.String
) {

}

