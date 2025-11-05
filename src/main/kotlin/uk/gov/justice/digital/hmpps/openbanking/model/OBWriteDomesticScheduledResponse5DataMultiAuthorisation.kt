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
 * The multiple authorisation flow response from the ASPSP.
 * @param status Specifies the status of the authorisation flow in code form.
 * @param numberRequired Number of authorisations required for payment order (total required at the start of the multi authorisation journey).
 * @param numberReceived Number of authorisations received.
 * @param lastUpdateDateTime Last date and time at the authorisation flow was updated. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 * @param expirationDateTime Date and time at which the requested authorisation flow must be completed. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 */
data class OBWriteDomesticScheduledResponse5DataMultiAuthorisation(

    @Schema(example = "null", required = true, description = "Specifies the status of the authorisation flow in code form.")
    @get:JsonProperty("Status", required = true) val status: OBWriteDomesticScheduledResponse5DataMultiAuthorisation.Status,

    @Schema(example = "null", description = "Number of authorisations required for payment order (total required at the start of the multi authorisation journey).")
    @get:JsonProperty("NumberRequired") val numberRequired: kotlin.Int? = null,

    @Schema(example = "null", description = "Number of authorisations received.")
    @get:JsonProperty("NumberReceived") val numberReceived: kotlin.Int? = null,

    @Schema(example = "null", description = "Last date and time at the authorisation flow was updated. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @get:JsonProperty("LastUpdateDateTime") val lastUpdateDateTime: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "Date and time at which the requested authorisation flow must be completed. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @get:JsonProperty("ExpirationDateTime") val expirationDateTime: java.time.OffsetDateTime? = null
) {

    /**
    * Specifies the status of the authorisation flow in code form.
    * Values: AUTH,AWAF,RJCT
    */
    enum class Status(@get:JsonValue val value: kotlin.String) {

        AUTH("AUTH"),
        AWAF("AWAF"),
        RJCT("RJCT");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Status {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBWriteDomesticScheduledResponse5DataMultiAuthorisation'")
            }
        }
    }

}

