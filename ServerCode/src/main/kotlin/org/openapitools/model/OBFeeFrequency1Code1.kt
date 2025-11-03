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
* How often is the overdraft fee/charge calculated for the account.
* Values: FEAC,FEAO,FECP,FEDA,FEHO,FEI,FEMO,FEOA,FEOT,FEPC,FEPH,FEPO,FEPS,FEPT,FEPTA,FEPTP,FEQU,FESM,FEST,FEWE,FEYE
*/
enum class OBFeeFrequency1Code1(val value: kotlin.String) {

    @JsonProperty("FEAC") FEAC("FEAC"),
    @JsonProperty("FEAO") FEAO("FEAO"),
    @JsonProperty("FECP") FECP("FECP"),
    @JsonProperty("FEDA") FEDA("FEDA"),
    @JsonProperty("FEHO") FEHO("FEHO"),
    @JsonProperty("FEI") FEI("FEI"),
    @JsonProperty("FEMO") FEMO("FEMO"),
    @JsonProperty("FEOA") FEOA("FEOA"),
    @JsonProperty("FEOT") FEOT("FEOT"),
    @JsonProperty("FEPC") FEPC("FEPC"),
    @JsonProperty("FEPH") FEPH("FEPH"),
    @JsonProperty("FEPO") FEPO("FEPO"),
    @JsonProperty("FEPS") FEPS("FEPS"),
    @JsonProperty("FEPT") FEPT("FEPT"),
    @JsonProperty("FEPTA") FEPTA("FEPTA"),
    @JsonProperty("FEPTP") FEPTP("FEPTP"),
    @JsonProperty("FEQU") FEQU("FEQU"),
    @JsonProperty("FESM") FESM("FESM"),
    @JsonProperty("FEST") FEST("FEST"),
    @JsonProperty("FEWE") FEWE("FEWE"),
    @JsonProperty("FEYE") FEYE("FEYE")
}

