package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

/**
* Period e.g. day, week, month etc. for which the fee/charge is capped
* Values: PACT,PDAY,PHYR,PMTH,PQTR,PWEK,PYER
*/
enum class OBPeriod1Code(@get:JsonValue val value: kotlin.String) {

  PACT("PACT"),
  PDAY("PDAY"),
  PHYR("PHYR"),
  PMTH("PMTH"),
  PQTR("PQTR"),
  PWEK("PWEK"),
  PYER("PYER"),
  ;

  companion object {
    @JvmStatic
    @JsonCreator
    fun forValue(value: kotlin.String): OBPeriod1Code = values().firstOrNull { it -> it.value == value }
      ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBPeriod1Code'")
  }
}
