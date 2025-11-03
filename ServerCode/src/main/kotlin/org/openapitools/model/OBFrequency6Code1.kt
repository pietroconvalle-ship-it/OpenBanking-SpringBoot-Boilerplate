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
* `OBFrequency6Code` on External Codset Repo
* Values: ADHO,YEAR,DAIL,FRTN,INDA,MNTH,QURT,MIAN,WEEK,WEEK2,WODL,FOWK,TWMH,FOMH,FIMH,ALMH,NONE
*/
enum class OBFrequency6Code1(val value: kotlin.String) {

    @JsonProperty("ADHO") ADHO("ADHO"),
    @JsonProperty("YEAR") YEAR("YEAR"),
    @JsonProperty("DAIL") DAIL("DAIL"),
    @JsonProperty("FRTN") FRTN("FRTN"),
    @JsonProperty("INDA") INDA("INDA"),
    @JsonProperty("MNTH") MNTH("MNTH"),
    @JsonProperty("QURT") QURT("QURT"),
    @JsonProperty("MIAN") MIAN("MIAN"),
    @JsonProperty("WEEK") WEEK("WEEK"),
    @JsonProperty("WEEK") WEEK2("WEEK"),
    @JsonProperty("WODL") WODL("WODL"),
    @JsonProperty("FOWK") FOWK("FOWK"),
    @JsonProperty("TWMH") TWMH("TWMH"),
    @JsonProperty("FOMH") FOMH("FOMH"),
    @JsonProperty("FIMH") FIMH("FIMH"),
    @JsonProperty("ALMH") ALMH("ALMH"),
    @JsonProperty("NONE") NONE("NONE")
}

