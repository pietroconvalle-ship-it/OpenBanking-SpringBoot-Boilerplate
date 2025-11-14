package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

/**
* For a full list of enumeration values see `OBExternalCommunicationMethod2Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_internal_CodeSets)
* Values: EMAL,FAXI,FILE,ONLI,POST
*/
enum class OBCommunicationMethod(@get:JsonValue val value: kotlin.String) {

  EMAL("EMAL"),
  FAXI("FAXI"),
  FILE("FILE"),
  ONLI("ONLI"),
  POST("POST"),
  ;

  companion object {
    @JvmStatic
    @JsonCreator
    fun forValue(value: kotlin.String): OBCommunicationMethod = values().firstOrNull { it -> it.value == value }
      ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBCommunicationMethod'")
  }
}
