package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

/**
* Specifies the scheduled payment date type requested. For a full list of enumeration values refer to `OBInternalScheduleType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
* Values: Arrival,Execution
*/
enum class OBInternalScheduleType1Code(@get:JsonValue val value: kotlin.String) {

  Arrival("Arrival"),
  Execution("Execution"),
  ;

  companion object {
    @JvmStatic
    @JsonCreator
    fun forValue(value: kotlin.String): OBInternalScheduleType1Code = values().firstOrNull { it -> it.value == value }
      ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBInternalScheduleType1Code'")
  }
}
