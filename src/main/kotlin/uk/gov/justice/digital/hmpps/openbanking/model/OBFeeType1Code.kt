package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

/**
* Fee/Charge Type
* Values: FEPF,FTOT,FYAF,FYAM,FYAQ,FYCP,FYDB,FYMI,FYXX
*/
enum class OBFeeType1Code(@get:JsonValue val value: kotlin.String) {

  FEPF("FEPF"),
  FTOT("FTOT"),
  FYAF("FYAF"),
  FYAM("FYAM"),
  FYAQ("FYAQ"),
  FYCP("FYCP"),
  FYDB("FYDB"),
  FYMI("FYMI"),
  FYXX("FYXX"),
  ;

  companion object {
    @JvmStatic
    @JsonCreator
    fun forValue(value: kotlin.String): OBFeeType1Code = values().firstOrNull { it -> it.value == value }
      ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBFeeType1Code'")
  }
}
