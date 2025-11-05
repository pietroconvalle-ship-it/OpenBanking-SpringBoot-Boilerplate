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
* Overdraft fee type
* Values: FBAO,FBAR,FBEB,FBIT,FBOR,FBOS,FBSC,FBTO,FBUB,FBUT,FTOT,FTUT
*/
enum class OBOverdraftFeeType1Code(@get:JsonValue val value: kotlin.String) {

    FBAO("FBAO"),
    FBAR("FBAR"),
    FBEB("FBEB"),
    FBIT("FBIT"),
    FBOR("FBOR"),
    FBOS("FBOS"),
    FBSC("FBSC"),
    FBTO("FBTO"),
    FBUB("FBUB"),
    FBUT("FBUT"),
    FTOT("FTOT"),
    FTUT("FTUT");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): OBOverdraftFeeType1Code {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBOverdraftFeeType1Code'")
        }
    }
}

