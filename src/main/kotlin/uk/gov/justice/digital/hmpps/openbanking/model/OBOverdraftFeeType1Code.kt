package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

/**
* Overdraft fee type
* Values: FBAO,FBAR,FBEB,FBIT,FBOR,FBOS,FBSC,FBTO,FBUB,FBUT,FTOT,FTUT
*/
enum class OBOverdraftFeeType1Code(@get:JsonValue val value: kotlin.String) {

  FBAO("FBAO"),
  FBAR("FBAR"),
  FBEB("FBEB"),
  FBIT("FBIT"),
  FBOR("FBOR"),
  FBOS("FBOS"),
  FBSC("FBSC"),
  FBTO("FBTO"),
  FBUB("FBUB"),
  FBUT("FBUT"),
  FTOT("FTOT"),
  FTUT("FTUT"),
  ;

  companion object {
    @JvmStatic
    @JsonCreator
    fun forValue(value: kotlin.String): OBOverdraftFeeType1Code = values().firstOrNull { it -> it.value == value }
      ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBOverdraftFeeType1Code'")
  }
}
