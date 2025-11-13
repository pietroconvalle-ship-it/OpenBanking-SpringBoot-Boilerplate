package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

/**
* Categorisation of fees and charges into standard categories.
* Values: FCOT,FCRE,FCSV
*/
enum class OBFeeCategory1Code(@get:JsonValue val value: kotlin.String) {

  FCOT("FCOT"),
  FCRE("FCRE"),
  FCSV("FCSV"),
  ;

  companion object {
    @JvmStatic
    @JsonCreator
    fun forValue(value: kotlin.String): OBFeeCategory1Code = values().firstOrNull { it -> it.value == value }
      ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBFeeCategory1Code'")
  }
}
