package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

/**
* Indicates whether the amount is a credit or a debit. For a full list of values see `OBInternalCreditDebitCode` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)<br /> Usage: A zero amount is considered to be a credit amount.
* Values: Credit,Debit
*/
enum class OBCreditDebitCode0(@get:JsonValue val value: kotlin.String) {

  Credit("Credit"),
  Debit("Debit"),
  ;

  companion object {
    @JvmStatic
    @JsonCreator
    fun forValue(value: kotlin.String): OBCreditDebitCode0 = values().firstOrNull { it -> it.value == value }
      ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBCreditDebitCode0'")
  }
}
