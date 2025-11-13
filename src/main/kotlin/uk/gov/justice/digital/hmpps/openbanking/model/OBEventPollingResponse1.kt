package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema

/**
 *
 * @param moreAvailable A JSON boolean value that indicates if more unacknowledged event notifications are available to be returned.
 * @param sets A JSON object that contains zero or more nested JSON attributes. If there are no outstanding event notifications to be transmitted, the JSON object SHALL be empty.
 */
data class OBEventPollingResponse1(

  @Schema(example = "null", required = true, description = "A JSON boolean value that indicates if more unacknowledged event notifications are available to be returned.")
  @get:JsonProperty("moreAvailable", required = true) val moreAvailable: kotlin.Boolean,

  @Schema(example = "null", required = true, description = "A JSON object that contains zero or more nested JSON attributes. If there are no outstanding event notifications to be transmitted, the JSON object SHALL be empty.")
  @get:JsonProperty("sets", required = true) val sets: kotlin.collections.Map<kotlin.String, kotlin.String>,
)
