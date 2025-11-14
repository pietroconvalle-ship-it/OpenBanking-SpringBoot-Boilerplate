package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
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
  @get:JsonProperty("FundsAvailable", required = true) val fundsAvailable: kotlin.Boolean,
)
