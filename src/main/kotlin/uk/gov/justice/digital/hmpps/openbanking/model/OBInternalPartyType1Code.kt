package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

/**
* Party type, in a coded form. For a full list see `OBInternalPartyType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
* Values: Delegate,Joint,Sole
*/
enum class OBInternalPartyType1Code(@get:JsonValue val value: kotlin.String) {

  Delegate("Delegate"),
  Joint("Joint"),
  Sole("Sole"),
  ;

  companion object {
    @JvmStatic
    @JsonCreator
    fun forValue(value: kotlin.String): OBInternalPartyType1Code = values().firstOrNull { it -> it.value == value }
      ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBInternalPartyType1Code'")
  }
}
