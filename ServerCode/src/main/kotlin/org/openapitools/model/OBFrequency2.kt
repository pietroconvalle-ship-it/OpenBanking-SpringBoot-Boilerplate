package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
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
* For a full list of enumeration values refer to `OBFrequency2Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_internal_CodeSets)
* Values: YEAR,DAIL,INDA,MNTH,QURT,MIAN,TEND,MOVE,WEEK
*/
enum class OBFrequency2(val value: kotlin.String) {

    @JsonProperty("YEAR") YEAR("YEAR"),
    @JsonProperty("DAIL") DAIL("DAIL"),
    @JsonProperty("INDA") INDA("INDA"),
    @JsonProperty("MNTH") MNTH("MNTH"),
    @JsonProperty("QURT") QURT("QURT"),
    @JsonProperty("MIAN") MIAN("MIAN"),
    @JsonProperty("TEND") TEND("TEND"),
    @JsonProperty("MOVE") MOVE("MOVE"),
    @JsonProperty("WEEK") WEEK("WEEK")
}

