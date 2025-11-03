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
* Fee/Charge Type
* Values: FEPF,FTOT,FYAF,FYAM,FYAQ,FYCP,FYDB,FYMI,FYXX
*/
enum class OBFeeType1Code(val value: kotlin.String) {

    @JsonProperty("FEPF") FEPF("FEPF"),
    @JsonProperty("FTOT") FTOT("FTOT"),
    @JsonProperty("FYAF") FYAF("FYAF"),
    @JsonProperty("FYAM") FYAM("FYAM"),
    @JsonProperty("FYAQ") FYAQ("FYAQ"),
    @JsonProperty("FYCP") FYCP("FYCP"),
    @JsonProperty("FYDB") FYDB("FYDB"),
    @JsonProperty("FYMI") FYMI("FYMI"),
    @JsonProperty("FYXX") FYXX("FYXX")
}

