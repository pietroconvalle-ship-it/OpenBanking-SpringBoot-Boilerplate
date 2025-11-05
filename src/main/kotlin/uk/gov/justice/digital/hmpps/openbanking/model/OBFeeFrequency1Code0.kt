package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Locale
import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.JsonCreator
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
* Frequency at which the overdraft charge is applied to the account
* Values: FEAC,FEAO,FECP,FEDA,FEHO,FEI,FEMO,FEOA,FEOT,FEPC,FEPH,FEPO,FEPS,FEPT,FEPTA,FEPTP,FEQU,FESM,FEST,FEWE,FEYE
*/
enum class OBFeeFrequency1Code0(@get:JsonValue val value: kotlin.String) {

    FEAC("FEAC"),
    FEAO("FEAO"),
    FECP("FECP"),
    FEDA("FEDA"),
    FEHO("FEHO"),
    FEI("FEI"),
    FEMO("FEMO"),
    FEOA("FEOA"),
    FEOT("FEOT"),
    FEPC("FEPC"),
    FEPH("FEPH"),
    FEPO("FEPO"),
    FEPS("FEPS"),
    FEPT("FEPT"),
    FEPTA("FEPTA"),
    FEPTP("FEPTP"),
    FEQU("FEQU"),
    FESM("FESM"),
    FEST("FEST"),
    FEWE("FEWE"),
    FEYE("FEYE");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): OBFeeFrequency1Code0 {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBFeeFrequency1Code0'")
        }
    }
}

