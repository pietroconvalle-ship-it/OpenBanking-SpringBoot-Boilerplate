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
* 
* Values: AUTH,AWAU,RJCT
*/
enum class OBExternalStatus2Code(val value: kotlin.String) {

    @JsonProperty("AUTH") AUTH("AUTH"),
    @JsonProperty("AWAU") AWAU("AWAU"),
    @JsonProperty("RJCT") RJCT("RJCT")
}

