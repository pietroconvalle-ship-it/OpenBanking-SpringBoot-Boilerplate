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
* Type of mandate instruction. For a full list of values see `OBExternalClassification1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
* Values: FIXE,USGB,VARI
*/
enum class OBExternalMandateClassification1Code(@get:JsonValue val value: kotlin.String) {

    FIXE("FIXE"),
    USGB("USGB"),
    VARI("VARI");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): OBExternalMandateClassification1Code {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBExternalMandateClassification1Code'")
        }
    }
}

