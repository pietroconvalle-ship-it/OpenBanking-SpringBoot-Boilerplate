package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

/**
* Specifies the Mutability of the Transaction record. <br /> For a full list of enumeration values refer to `OBInternalTransactionMutability1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
* Values: Mutable,Immutable
*/
enum class OBInternalTransactionMutability1Code(@get:JsonValue val value: kotlin.String) {

  Mutable("Mutable"),
  Immutable("Immutable"),
  ;

  companion object {
    @JvmStatic
    @JsonCreator
    fun forValue(value: kotlin.String): OBInternalTransactionMutability1Code = values().firstOrNull { it -> it.value == value }
      ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBInternalTransactionMutability1Code'")
  }
}
