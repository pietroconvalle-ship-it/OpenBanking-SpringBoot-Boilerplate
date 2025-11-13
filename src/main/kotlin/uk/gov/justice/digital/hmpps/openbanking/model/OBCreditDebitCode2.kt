package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

/**
* Indicates whether the balance is a credit or a debit balance.  Usage: A zero balance is considered to be a credit balance. <br /> For a full list of enumeration values refer to `OBInternalCreditDebitCode` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
* Values: Credit,Debit
*/
enum class OBCreditDebitCode2(@get:JsonValue val value: kotlin.String) {

  Credit("Credit"),
  Debit("Debit"),
  ;

  companion object {
    @JvmStatic
    @JsonCreator
    fun forValue(value: kotlin.String): OBCreditDebitCode2 = values().firstOrNull { it -> it.value == value }
      ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBCreditDebitCode2'")
  }
}
