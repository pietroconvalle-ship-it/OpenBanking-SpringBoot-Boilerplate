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
* Identifies the nature of the postal address. For a full set of codes see `OBAddressType2Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets).
* Values: BIZZ,DLVY,MLTO,PBOX,ADDR,HOME,CORR,STAT
*/
enum class OBAddressType2Code2(val value: kotlin.String) {

    @JsonProperty("BIZZ") BIZZ("BIZZ"),
    @JsonProperty("DLVY") DLVY("DLVY"),
    @JsonProperty("MLTO") MLTO("MLTO"),
    @JsonProperty("PBOX") PBOX("PBOX"),
    @JsonProperty("ADDR") ADDR("ADDR"),
    @JsonProperty("HOME") HOME("HOME"),
    @JsonProperty("CORR") CORR("CORR"),
    @JsonProperty("STAT") STAT("STAT")
}

