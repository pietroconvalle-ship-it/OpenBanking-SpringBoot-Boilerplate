package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

/**
*
* Values: FIXE,USGB,VARI
*/
enum class OBExternalMandateClassification1Code1(@get:JsonValue val value: kotlin.String) {

  FIXE("FIXE"),
  USGB("USGB"),
  VARI("VARI"),
  ;

  companion object {
    @JvmStatic
    @JsonCreator
    fun forValue(value: kotlin.String): OBExternalMandateClassification1Code1 = values().firstOrNull { it -> it.value == value }
      ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBExternalMandateClassification1Code1'")
  }
}
