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
* Period e.g. day, week, month etc. for which the fee/charge is capped
* Values: PACT,PDAY,PHYR,PMTH,PQTR,PWEK,PYER
*/
enum class OBPeriod1Code(@get:JsonValue val value: kotlin.String) {

    PACT("PACT"),
    PDAY("PDAY"),
    PHYR("PHYR"),
    PMTH("PMTH"),
    PQTR("PQTR"),
    PWEK("PWEK"),
    PYER("PYER");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): OBPeriod1Code {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBPeriod1Code'")
        }
    }
}

