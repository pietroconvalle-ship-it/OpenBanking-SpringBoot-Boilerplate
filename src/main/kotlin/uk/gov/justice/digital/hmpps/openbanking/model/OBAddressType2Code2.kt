package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

/**
* Identifies the nature of the postal address. For a full set of codes see `OBAddressType2Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets).
* Values: BIZZ,DLVY,MLTO,PBOX,ADDR,HOME,CORR,STAT
*/
enum class OBAddressType2Code2(@get:JsonValue val value: kotlin.String) {

  BIZZ("BIZZ"),
  DLVY("DLVY"),
  MLTO("MLTO"),
  PBOX("PBOX"),
  ADDR("ADDR"),
  HOME("HOME"),
  CORR("CORR"),
  STAT("STAT"),
  ;

  companion object {
    @JvmStatic
    @JsonCreator
    fun forValue(value: kotlin.String): OBAddressType2Code2 = values().firstOrNull { it -> it.value == value }
      ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBAddressType2Code2'")
  }
}
