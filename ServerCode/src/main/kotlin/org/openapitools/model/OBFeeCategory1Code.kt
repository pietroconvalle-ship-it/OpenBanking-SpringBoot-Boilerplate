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
* Categorisation of fees and charges into standard categories.
* Values: FCOT,FCRE,FCSV
*/
enum class OBFeeCategory1Code(val value: kotlin.String) {

    @JsonProperty("FCOT") FCOT("FCOT"),
    @JsonProperty("FCRE") FCRE("FCRE"),
    @JsonProperty("FCSV") FCSV("FCSV")
}

