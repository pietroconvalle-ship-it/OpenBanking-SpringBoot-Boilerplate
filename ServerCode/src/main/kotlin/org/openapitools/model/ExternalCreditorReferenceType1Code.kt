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
* Specifies the type of creditor reference as published in an external creditor reference type code set. For more information see `ExternalCreditorReferenceType1Code` in *ISO_External_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
* Values: DISP,FXDR,PUOR,RPIN,RADM,SCOR
*/
enum class ExternalCreditorReferenceType1Code(val value: kotlin.String) {

    @JsonProperty("DISP") DISP("DISP"),
    @JsonProperty("FXDR") FXDR("FXDR"),
    @JsonProperty("PUOR") PUOR("PUOR"),
    @JsonProperty("RPIN") RPIN("RPIN"),
    @JsonProperty("RADM") RADM("RADM"),
    @JsonProperty("SCOR") SCOR("SCOR")
}

