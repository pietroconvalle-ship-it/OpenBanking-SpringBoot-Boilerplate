package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Locale
import java.util.Objects
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
 * Result of a funds availability check.
 * @param fundsAvailableDateTime Date and time at which the funds availability check was generated. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 * @param fundsAvailable Flag to indicate the availability of funds given the Amount in the consent request.
 */
data class OBWriteFundsConfirmationResponse1DataFundsAvailableResult(

    @Schema(example = "null", required = true, description = "Date and time at which the funds availability check was generated. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @get:JsonProperty("FundsAvailableDateTime", required = true) val fundsAvailableDateTime: java.time.OffsetDateTime,

    @Schema(example = "null", required = true, description = "Flag to indicate the availability of funds given the Amount in the consent request.")
    @get:JsonProperty("FundsAvailable", required = true) val fundsAvailable: kotlin.Boolean
) {

}

