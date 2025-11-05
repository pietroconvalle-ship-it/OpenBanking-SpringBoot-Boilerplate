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
* Specifies the amount type, as published in an external referred amount code set. For a full lust of values refer to `ExternalCreditorReferenceType1Code` in *ISO_External_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
* Values: DISP,FXDR,PUOR,RPIN,RADM,SCOR
*/
enum class ExternalCreditorReferenceType1Code1(@get:JsonValue val value: kotlin.String) {

    DISP("DISP"),
    FXDR("FXDR"),
    PUOR("PUOR"),
    RPIN("RPIN"),
    RADM("RADM"),
    SCOR("SCOR");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): ExternalCreditorReferenceType1Code1 {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ExternalCreditorReferenceType1Code1'")
        }
    }
}

