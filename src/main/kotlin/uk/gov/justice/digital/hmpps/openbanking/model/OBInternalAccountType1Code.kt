package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

/**
* Specifies the type of account (personal or business). <br /> For a full list of enumeration values refer to 'OBInternalAccountType1Code' in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
* Values: Business,Personal
*/
enum class OBInternalAccountType1Code(@get:JsonValue val value: kotlin.String) {

  Business("Business"),
  Personal("Personal"),
  ;

  companion object {
    @JvmStatic
    @JsonCreator
    fun forValue(value: kotlin.String): OBInternalAccountType1Code = values().firstOrNull { it -> it.value == value }
      ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBInternalAccountType1Code'")
  }
}
