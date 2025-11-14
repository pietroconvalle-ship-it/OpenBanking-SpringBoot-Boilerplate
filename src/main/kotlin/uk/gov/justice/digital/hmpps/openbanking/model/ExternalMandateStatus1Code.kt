package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

/**
* Specifies the status of the standing order in code form. For a full list of enumeration values refer to 'ExternalMandateStatus1Code' in *ISO_External_Codeset* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
* Values: ACTV,CANC,EXPI,SUSP
*/
enum class ExternalMandateStatus1Code(@get:JsonValue val value: kotlin.String) {

  ACTV("ACTV"),
  CANC("CANC"),
  EXPI("EXPI"),
  SUSP("SUSP"),
  ;

  companion object {
    @JvmStatic
    @JsonCreator
    fun forValue(value: kotlin.String): ExternalMandateStatus1Code = values().firstOrNull { it -> it.value == value }
      ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ExternalMandateStatus1Code'")
  }
}
