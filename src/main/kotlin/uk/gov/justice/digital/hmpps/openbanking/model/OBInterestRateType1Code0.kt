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
* Rate type for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)
* Values: INBB,INFR,INGR,INLR,INNE,INOT
*/
enum class OBInterestRateType1Code0(@get:JsonValue val value: kotlin.String) {

    INBB("INBB"),
    INFR("INFR"),
    INGR("INGR"),
    INLR("INLR"),
    INNE("INNE"),
    INOT("INOT");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): OBInterestRateType1Code0 {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBInterestRateType1Code0'")
        }
    }
}

