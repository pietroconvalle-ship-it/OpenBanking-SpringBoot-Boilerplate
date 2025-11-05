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
 * 
 * @param moreAvailable A JSON boolean value that indicates if more unacknowledged event notifications are available to be returned.
 * @param sets A JSON object that contains zero or more nested JSON attributes. If there are no outstanding event notifications to be transmitted, the JSON object SHALL be empty.
 */
data class OBEventPollingResponse1(

    @Schema(example = "null", required = true, description = "A JSON boolean value that indicates if more unacknowledged event notifications are available to be returned.")
    @get:JsonProperty("moreAvailable", required = true) val moreAvailable: kotlin.Boolean,

    @Schema(example = "null", required = true, description = "A JSON object that contains zero or more nested JSON attributes. If there are no outstanding event notifications to be transmitted, the JSON object SHALL be empty.")
    @get:JsonProperty("sets", required = true) val sets: kotlin.collections.Map<kotlin.String, kotlin.String>
) {

}

