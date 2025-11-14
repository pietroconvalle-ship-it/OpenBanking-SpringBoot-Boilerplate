package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

/**
* Rate type for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)
* Values: INBB,INFR,INGR,INLR,INNE,INOT
*/
enum class OBInterestRateType1Code0(@get:JsonValue val value: kotlin.String) {

  INBB("INBB"),
  INFR("INFR"),
  INGR("INGR"),
  INLR("INLR"),
  INNE("INNE"),
  INOT("INOT"),
  ;

  companion object {
    @JvmStatic
    @JsonCreator
    fun forValue(value: kotlin.String): OBInterestRateType1Code0 = values().firstOrNull { it -> it.value == value }
      ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBInterestRateType1Code0'")
  }
}
