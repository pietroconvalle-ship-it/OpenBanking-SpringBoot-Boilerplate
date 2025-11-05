package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Locale
import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * 
 * @param periodType ^ Period type for this period limit
 * @param periodAlignment Specifies whether the period starts on the date of consent creation or lines up with a calendar. As the ISO calendar does not support or provide any guidance on when a fortnight should start, a `PeriodType` of `Fortnight` the `PeriodAlignment` must be `Consent`.
 * @param amount A number of monetary units specified in an active currency where the unit of currency is explicit and compliant with ISO 4217.
 * @param currency A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".
 */
data class OBDomesticVRPControlParametersPeriodicLimitsInner(

    @Schema(example = "null", required = true, description = "^ Period type for this period limit")
    @get:JsonProperty("PeriodType", required = true) val periodType: OBDomesticVRPControlParametersPeriodicLimitsInner.PeriodType,

    @Schema(example = "null", required = true, description = "Specifies whether the period starts on the date of consent creation or lines up with a calendar. As the ISO calendar does not support or provide any guidance on when a fortnight should start, a `PeriodType` of `Fortnight` the `PeriodAlignment` must be `Consent`.")
    @get:JsonProperty("PeriodAlignment", required = true) val periodAlignment: OBDomesticVRPControlParametersPeriodicLimitsInner.PeriodAlignment,

    @get:Pattern(regexp="^\\d{1,13}$|^\\d{1,13}\\.\\d{1,5}$")
    @Schema(example = "null", required = true, description = "A number of monetary units specified in an active currency where the unit of currency is explicit and compliant with ISO 4217.")
    @get:JsonProperty("Amount", required = true) val amount: kotlin.String,

    @get:Pattern(regexp="^[A-Z]{3,3}$")
    @get:Size(min=3,max=3)
    @Schema(example = "null", required = true, description = "A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".")
    @get:JsonProperty("Currency", required = true) val currency: kotlin.String
) {

    /**
    * ^ Period type for this period limit
    * Values: Day,Week,Fortnight,Month,HalfMinusYear,Year
    */
    enum class PeriodType(@get:JsonValue val value: kotlin.String) {

        Day("Day"),
        Week("Week"),
        Fortnight("Fortnight"),
        Month("Month"),
        HalfMinusYear("Half-year"),
        Year("Year");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): PeriodType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBDomesticVRPControlParametersPeriodicLimitsInner'")
            }
        }
    }

    /**
    * Specifies whether the period starts on the date of consent creation or lines up with a calendar. As the ISO calendar does not support or provide any guidance on when a fortnight should start, a `PeriodType` of `Fortnight` the `PeriodAlignment` must be `Consent`.
    * Values: Consent,Calendar
    */
    enum class PeriodAlignment(@get:JsonValue val value: kotlin.String) {

        Consent("Consent"),
        Calendar("Calendar");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): PeriodAlignment {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBDomesticVRPControlParametersPeriodicLimitsInner'")
            }
        }
    }

}

