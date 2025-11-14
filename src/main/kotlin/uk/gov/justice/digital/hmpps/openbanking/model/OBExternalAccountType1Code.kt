package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

/**
* Specifies the type of account (personal or business).
* Values: Business,Personal
*/
enum class OBExternalAccountType1Code(@get:JsonValue val value: kotlin.String) {

  Business("Business"),
  Personal("Personal"),
  ;

  companion object {
    @JvmStatic
    @JsonCreator
    fun forValue(value: kotlin.String): OBExternalAccountType1Code = values().firstOrNull { it -> it.value == value }
      ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBExternalAccountType1Code'")
  }
}
