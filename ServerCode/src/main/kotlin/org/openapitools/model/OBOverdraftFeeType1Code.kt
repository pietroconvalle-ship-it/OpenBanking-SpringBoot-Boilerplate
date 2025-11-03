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
* Overdraft fee type
* Values: FBAO,FBAR,FBEB,FBIT,FBOR,FBOS,FBSC,FBTO,FBUB,FBUT,FTOT,FTUT
*/
enum class OBOverdraftFeeType1Code(val value: kotlin.String) {

    @JsonProperty("FBAO") FBAO("FBAO"),
    @JsonProperty("FBAR") FBAR("FBAR"),
    @JsonProperty("FBEB") FBEB("FBEB"),
    @JsonProperty("FBIT") FBIT("FBIT"),
    @JsonProperty("FBOR") FBOR("FBOR"),
    @JsonProperty("FBOS") FBOS("FBOS"),
    @JsonProperty("FBSC") FBSC("FBSC"),
    @JsonProperty("FBTO") FBTO("FBTO"),
    @JsonProperty("FBUB") FBUB("FBUB"),
    @JsonProperty("FBUT") FBUT("FBUT"),
    @JsonProperty("FTOT") FTOT("FTOT"),
    @JsonProperty("FTUT") FTUT("FTUT")
}

