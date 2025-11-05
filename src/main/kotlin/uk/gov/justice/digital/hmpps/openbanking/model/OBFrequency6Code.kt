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
* For a full list of values see `OBFrequency6Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
* Values: ADHO,YEAR,DAIL,FRTN,INDA,MNTH,QURT,MIAN,WEEK,WODL,FOWK,TWMH,FOMH,FIMH,ALMH,NONE
*/
enum class OBFrequency6Code(@get:JsonValue val value: kotlin.String) {

    ADHO("ADHO"),
    YEAR("YEAR"),
    DAIL("DAIL"),
    FRTN("FRTN"),
    INDA("INDA"),
    MNTH("MNTH"),
    QURT("QURT"),
    MIAN("MIAN"),
    WEEK("WEEK"),
    WODL("WODL"),
    FOWK("FOWK"),
    TWMH("TWMH"),
    FOMH("FOMH"),
    FIMH("FIMH"),
    ALMH("ALMH"),
    NONE("NONE");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): OBFrequency6Code {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBFrequency6Code'")
        }
    }
}

