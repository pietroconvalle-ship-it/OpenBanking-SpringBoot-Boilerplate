package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.Size

/**
 *
 * @param eventSubscriptionId Unique identification as assigned by the ASPSP to uniquely identify the callback url resource.
 * @param version Version for the event notification.
 * @param callbackUrl Callback URL for a TPP hosted service. Will be used by ASPSPs, in conjunction with the resource name, to construct a URL to send event notifications to.
 * @param eventTypes
 */
data class OBEventSubscriptionsResponse1DataEventSubscriptionInner(

  @get:Size(min = 1, max = 40)
  @Schema(example = "null", required = true, description = "Unique identification as assigned by the ASPSP to uniquely identify the callback url resource.")
  @get:JsonProperty("EventSubscriptionId", required = true) val eventSubscriptionId: kotlin.String,

  @get:Size(min = 1, max = 10)
  @Schema(example = "null", required = true, description = "Version for the event notification.")
  @get:JsonProperty("Version", required = true) val version: kotlin.String,

  @field:Valid
  @Schema(example = "null", description = "Callback URL for a TPP hosted service. Will be used by ASPSPs, in conjunction with the resource name, to construct a URL to send event notifications to.")
  @get:JsonProperty("CallbackUrl") val callbackUrl: java.net.URI? = null,

  @Schema(example = "null", description = "")
  @get:JsonProperty("EventTypes") val eventTypes: kotlin.collections.List<kotlin.String>? = null,
)
