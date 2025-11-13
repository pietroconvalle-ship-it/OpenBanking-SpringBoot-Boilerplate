package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import uk.gov.justice.digital.hmpps.openbanking.model.OBActiveOrHistoricCurrencyAndAmount

/**
 * Set of elements used to provide details on the regulatory reporting information.
 * @param type Specifies the type of the information supplied in the regulatory reporting details
 * @param date All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 * @param country Nation with its own government.
 * @param amount
 * @param information Additional details that cater for specific domestic regulatory requirements.
 */
data class OBStructuredRegulatoryReporting3(

  @get:Size(min = 1, max = 35)
  @Schema(example = "null", description = "Specifies the type of the information supplied in the regulatory reporting details")
  @get:JsonProperty("Type") val type: kotlin.String? = null,

  @Schema(example = "null", description = "All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  @get:JsonProperty("Date") val date: java.time.OffsetDateTime? = null,

  @get:Pattern(regexp = "^[A-Z]{2,2}$")
  @Schema(example = "null", description = "Nation with its own government.")
  @get:JsonProperty("Country") val country: kotlin.String? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("Amount") val amount: OBActiveOrHistoricCurrencyAndAmount? = null,

  @Schema(example = "null", description = "Additional details that cater for specific domestic regulatory requirements. ")
  @get:JsonProperty("Information") val information: kotlin.collections.List<kotlin.String>? = null,
)
