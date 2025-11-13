package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

/**
* Methods of calculating interest
* Values: ITCO,ITOT,ITSI
*/
enum class OBInterestCalculationMethod1Code(@get:JsonValue val value: kotlin.String) {

  ITCO("ITCO"),
  ITOT("ITOT"),
  ITSI("ITSI"),
  ;

  companion object {
    @JvmStatic
    @JsonCreator
    fun forValue(value: kotlin.String): OBInterestCalculationMethod1Code = values().firstOrNull { it -> it.value == value }
      ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBInterestCalculationMethod1Code'")
  }
}
