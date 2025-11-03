package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.OBEventPolling1SetErrsValue
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
 * @param maxEvents Maximum number of events to be returned. A value of zero indicates the ASPSP should not return events even if available
 * @param returnImmediately Indicates whether an ASPSP should return a response immediately or provide a long poll
 * @param ack 
 * @param setErrs An object that encapsulates all negative acknowledgements transmitted by the TPP
 */
data class OBEventPolling1(

    @Schema(example = "null", description = "Maximum number of events to be returned. A value of zero indicates the ASPSP should not return events even if available")
    @get:JsonProperty("maxEvents") val maxEvents: kotlin.Int? = null,

    @Schema(example = "null", description = "Indicates whether an ASPSP should return a response immediately or provide a long poll")
    @get:JsonProperty("returnImmediately") val returnImmediately: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ack") val ack: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(example = "null", description = "An object that encapsulates all negative acknowledgements transmitted by the TPP")
    @get:JsonProperty("setErrs") val setErrs: kotlin.collections.Map<kotlin.String, OBEventPolling1SetErrsValue>? = null
) {

}

