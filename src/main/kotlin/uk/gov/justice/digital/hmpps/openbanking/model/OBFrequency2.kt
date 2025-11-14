package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

/**
* For a full list of enumeration values refer to `OBFrequency2Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_internal_CodeSets)
* Values: YEAR,DAIL,INDA,MNTH,QURT,MIAN,TEND,MOVE,WEEK
*/
enum class OBFrequency2(@get:JsonValue val value: kotlin.String) {

  YEAR("YEAR"),
  DAIL("DAIL"),
  INDA("INDA"),
  MNTH("MNTH"),
  QURT("QURT"),
  MIAN("MIAN"),
  TEND("TEND"),
  MOVE("MOVE"),
  WEEK("WEEK"),
  ;

  companion object {
    @JvmStatic
    @JsonCreator
    fun forValue(value: kotlin.String): OBFrequency2 = values().firstOrNull { it -> it.value == value }
      ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBFrequency2'")
  }
}
