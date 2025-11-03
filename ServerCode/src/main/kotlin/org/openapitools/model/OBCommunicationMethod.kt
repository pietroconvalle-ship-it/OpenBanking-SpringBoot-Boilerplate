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
* For a full list of enumeration values see `OBExternalCommunicationMethod2Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_internal_CodeSets) 
* Values: EMAL,FAXI,FILE,ONLI,POST
*/
enum class OBCommunicationMethod(val value: kotlin.String) {

    @JsonProperty("EMAL") EMAL("EMAL"),
    @JsonProperty("FAXI") FAXI("FAXI"),
    @JsonProperty("FILE") FILE("FILE"),
    @JsonProperty("ONLI") ONLI("ONLI"),
    @JsonProperty("POST") POST("POST")
}

