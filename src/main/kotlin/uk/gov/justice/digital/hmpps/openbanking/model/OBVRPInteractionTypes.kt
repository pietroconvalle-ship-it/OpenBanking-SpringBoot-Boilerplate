package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

/**
* Indicates interaction type, currently if customer is present or not present. If not provided the default is `OffSession` (customer is not present) when the individual VRP payment is made.
* Values: InSession,OffSession
*/
enum class OBVRPInteractionTypes(@get:JsonValue val value: kotlin.String) {

  InSession("InSession"),
  OffSession("OffSession"),
  ;

  companion object {
    @JvmStatic
    @JsonCreator
    fun forValue(value: kotlin.String): OBVRPInteractionTypes = values().firstOrNull { it -> it.value == value }
      ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBVRPInteractionTypes'")
  }
}
