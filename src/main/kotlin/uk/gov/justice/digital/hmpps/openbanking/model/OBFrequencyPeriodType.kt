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
* Individual Definitions:  ADHO - Adhoc   YEAR - Annual DAIL - Daily INDA - Intra Day MNTH - Monthly QURT - Quarterly WEEK - Weekly 
* Values: ADHO,YEAR,DAIL,INDA,MNTH,QURT,MIAN,WEEK
*/
enum class OBFrequencyPeriodType(@get:JsonValue val value: kotlin.String) {

    ADHO("ADHO"),
    YEAR("YEAR"),
    DAIL("DAIL"),
    INDA("INDA"),
    MNTH("MNTH"),
    QURT("QURT"),
    MIAN("MIAN"),
    WEEK("WEEK");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): OBFrequencyPeriodType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBFrequencyPeriodType'")
        }
    }
}

