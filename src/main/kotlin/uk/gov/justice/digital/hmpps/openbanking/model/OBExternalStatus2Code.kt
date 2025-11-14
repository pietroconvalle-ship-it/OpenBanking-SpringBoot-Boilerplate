package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

/**
*
* Values: AUTH,AWAU,RJCT
*/
enum class OBExternalStatus2Code(@get:JsonValue val value: kotlin.String) {

  AUTH("AUTH"),
  AWAU("AWAU"),
  RJCT("RJCT"),
  ;

  companion object {
    @JvmStatic
    @JsonCreator
    fun forValue(value: kotlin.String): OBExternalStatus2Code = values().firstOrNull { it -> it.value == value }
      ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBExternalStatus2Code'")
  }
}
