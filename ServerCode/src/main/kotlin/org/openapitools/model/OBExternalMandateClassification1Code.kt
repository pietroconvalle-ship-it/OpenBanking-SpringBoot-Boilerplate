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
* Type of mandate instruction. For a full list of values see `OBExternalClassification1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
* Values: FIXE,USGB,VARI
*/
enum class OBExternalMandateClassification1Code(val value: kotlin.String) {

    @JsonProperty("FIXE") FIXE("FIXE"),
    @JsonProperty("USGB") USGB("USGB"),
    @JsonProperty("VARI") VARI("VARI")
}

