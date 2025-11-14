package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import uk.gov.justice.digital.hmpps.openbanking.model.OBEventSubscriptionsResponse1DataEventSubscriptionInner

/**
 *
 * @param eventSubscription
 */
data class OBEventSubscriptionsResponse1Data(

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("EventSubscription") val eventSubscription: kotlin.collections.List<OBEventSubscriptionsResponse1DataEventSubscriptionInner>? = null,
)
