package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

/**
* Amount sub type, in a coded form. Default if not specified is BCUR of the account.
* Values: BCUR,LCUR
*/
enum class OBExternalBalanceSubType1Code(@get:JsonValue val value: kotlin.String) {

  BCUR("BCUR"),
  LCUR("LCUR"),
  ;

  companion object {
    @JvmStatic
    @JsonCreator
    fun forValue(value: kotlin.String): OBExternalBalanceSubType1Code = values().firstOrNull { it -> it.value == value }
      ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBExternalBalanceSubType1Code'")
  }
}
