package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

/**
* Min Max type
* Values: FMMN,FMMX
*/
enum class OBMinMaxType1Code(@get:JsonValue val value: kotlin.String) {

  FMMN("FMMN"),
  FMMX("FMMX"),
  ;

  companion object {
    @JvmStatic
    @JsonCreator
    fun forValue(value: kotlin.String): OBMinMaxType1Code = values().firstOrNull { it -> it.value == value }
      ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBMinMaxType1Code'")
  }
}
