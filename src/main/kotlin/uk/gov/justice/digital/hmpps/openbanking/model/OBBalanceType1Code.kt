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
* Balance type, in a coded form. <br /> For a full list of enumeration values refer to `ExternalBalanceType1Code` in *ISO_External_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets).
* Values: CLAV,CLBD,FWAV,INFO,ITAV,ITBD,OPAV,OPBD,PRCD,XPCD
*/
enum class OBBalanceType1Code(@get:JsonValue val value: kotlin.String) {

    CLAV("CLAV"),
    CLBD("CLBD"),
    FWAV("FWAV"),
    INFO("INFO"),
    ITAV("ITAV"),
    ITBD("ITBD"),
    OPAV("OPAV"),
    OPBD("OPBD"),
    PRCD("PRCD"),
    XPCD("XPCD");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): OBBalanceType1Code {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBBalanceType1Code'")
        }
    }
}

