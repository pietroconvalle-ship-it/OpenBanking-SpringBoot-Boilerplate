package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

/**
* Specifies the status of account resource in code form. <br /> For a full list of enumeration values refer to `OBInternalAccountStatus1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
* Values: Deleted,Disabled,Enabled,Pending,ProForma
*/
enum class OBInternalAccountStatus1Code(@get:JsonValue val value: kotlin.String) {

  Deleted("Deleted"),
  Disabled("Disabled"),
  Enabled("Enabled"),
  Pending("Pending"),
  ProForma("ProForma"),
  ;

  companion object {
    @JvmStatic
    @JsonCreator
    fun forValue(value: kotlin.String): OBInternalAccountStatus1Code = values().firstOrNull { it -> it.value == value }
      ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBInternalAccountStatus1Code'")
  }
}
