package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

/**
* Individual Definitions:  ADHO - Adhoc   YEAR - Annual DAIL - Daily INDA - Intra Day MNTH - Monthly QURT - Quarterly WEEK - Weekly
* Values: ADHO,YEAR,DAIL,INDA,MNTH,QURT,MIAN,WEEK
*/
enum class OBFrequencyPeriodType(@get:JsonValue val value: kotlin.String) {

  ADHO("ADHO"),
  YEAR("YEAR"),
  DAIL("DAIL"),
  INDA("INDA"),
  MNTH("MNTH"),
  QURT("QURT"),
  MIAN("MIAN"),
  WEEK("WEEK"),
  ;

  companion object {
    @JvmStatic
    @JsonCreator
    fun forValue(value: kotlin.String): OBFrequencyPeriodType = values().firstOrNull { it -> it.value == value }
      ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBFrequencyPeriodType'")
  }
}
