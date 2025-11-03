package org.openapitools.model

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
 * @param version Version for the event notification.
 * @param callbackUrl Callback URL for a TPP hosted service. Will be used by ASPSPs, in conjunction with the resource name, to construct a URL to send event notifications to.
 * @param eventTypes 
 */
data class OBEventSubscription1Data(

    @get:Size(min=1,max=10)
    @Schema(example = "null", required = true, description = "Version for the event notification.")
    @get:JsonProperty("Version", required = true) val version: kotlin.String,

    @field:Valid
    @Schema(example = "null", description = "Callback URL for a TPP hosted service. Will be used by ASPSPs, in conjunction with the resource name, to construct a URL to send event notifications to.")
    @get:JsonProperty("CallbackUrl") val callbackUrl: java.net.URI? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("EventTypes") val eventTypes: kotlin.collections.List<kotlin.String>? = null
) {

}

