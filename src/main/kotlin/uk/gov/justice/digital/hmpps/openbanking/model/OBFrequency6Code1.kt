package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

/**
* `OBFrequency6Code` on External Codset Repo
* Values: ADHO,YEAR,DAIL,FRTN,INDA,MNTH,QURT,MIAN,WEEK,WEEK2,WODL,FOWK,TWMH,FOMH,FIMH,ALMH,NONE
*/
enum class OBFrequency6Code1(@get:JsonValue val value: kotlin.String) {

  ADHO("ADHO"),
  YEAR("YEAR"),
  DAIL("DAIL"),
  FRTN("FRTN"),
  INDA("INDA"),
  MNTH("MNTH"),
  QURT("QURT"),
  MIAN("MIAN"),
  WEEK("WEEK"),
  WEEK2("WEEK"),
  WODL("WODL"),
  FOWK("FOWK"),
  TWMH("TWMH"),
  FOMH("FOMH"),
  FIMH("FIMH"),
  ALMH("ALMH"),
  NONE("NONE"),
  ;

  companion object {
    @JvmStatic
    @JsonCreator
    fun forValue(value: kotlin.String): OBFrequency6Code1 = values().firstOrNull { it -> it.value == value }
      ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBFrequency6Code1'")
  }
}
