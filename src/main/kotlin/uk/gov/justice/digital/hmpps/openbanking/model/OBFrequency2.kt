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
* For a full list of enumeration values refer to `OBFrequency2Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_internal_CodeSets)
* Values: YEAR,DAIL,INDA,MNTH,QURT,MIAN,TEND,MOVE,WEEK
*/
enum class OBFrequency2(@get:JsonValue val value: kotlin.String) {

    YEAR("YEAR"),
    DAIL("DAIL"),
    INDA("INDA"),
    MNTH("MNTH"),
    QURT("QURT"),
    MIAN("MIAN"),
    TEND("TEND"),
    MOVE("MOVE"),
    WEEK("WEEK");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): OBFrequency2 {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBFrequency2'")
        }
    }
}

