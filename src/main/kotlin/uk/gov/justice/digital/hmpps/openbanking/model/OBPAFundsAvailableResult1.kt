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
 * Availability result, clearly indicating the availability of funds given the Amount in the request.
 * @param fundsAvailableDateTime Date and time at which the funds availability check was generated.
 * @param fundsAvailable Availability result, clearly indicating the availability of funds given the Amount in the request.
 */
data class OBPAFundsAvailableResult1(

    @Schema(example = "null", required = true, description = "Date and time at which the funds availability check was generated.")
    @get:JsonProperty("FundsAvailableDateTime", required = true) val fundsAvailableDateTime: java.time.OffsetDateTime,

    @Schema(example = "null", required = true, description = "Availability result, clearly indicating the availability of funds given the Amount in the request.")
    @get:JsonProperty("FundsAvailable", required = true) val fundsAvailable: OBPAFundsAvailableResult1.FundsAvailable
) {

    /**
    * Availability result, clearly indicating the availability of funds given the Amount in the request.
    * Values: Available,NotAvailable
    */
    enum class FundsAvailable(@get:JsonValue val value: kotlin.String) {

        Available("Available"),
        NotAvailable("NotAvailable");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): FundsAvailable {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBPAFundsAvailableResult1'")
            }
        }
    }

}

