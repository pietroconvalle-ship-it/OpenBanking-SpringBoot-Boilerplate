package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

/**
* Indicates whether the transaction is a credit or a debit entry. <br /> <br /> For a full list of enumeration values refer to `OBInternalCreditDebitCode` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
* Values: Credit,Debit
*/
enum class OBCreditDebitCode1(@get:JsonValue val value: kotlin.String) {

  Credit("Credit"),
  Debit("Debit"),
  ;

  companion object {
    @JvmStatic
    @JsonCreator
    fun forValue(value: kotlin.String): OBCreditDebitCode1 = values().firstOrNull { it -> it.value == value }
      ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBCreditDebitCode1'")
  }
}
