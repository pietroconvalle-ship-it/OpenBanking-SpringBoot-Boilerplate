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
* Status of a transaction entry on the books of the account servicer. <br /> For a full list of enumeration values refer to `ExternalEntryStatus1Code` in *ISO_External_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
* Values: BOOK,FUTR,INFO,PDNG,RJCT
*/
enum class ExternalEntryStatus1Code(@get:JsonValue val value: kotlin.String) {

    BOOK("BOOK"),
    FUTR("FUTR"),
    INFO("INFO"),
    PDNG("PDNG"),
    RJCT("RJCT");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): ExternalEntryStatus1Code {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ExternalEntryStatus1Code'")
        }
    }
}

