package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

/**
* Statement type, in a coded form. For a full list of values see `OBInternalStatementType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
* Values: AccountClosure,AccountOpening,Annual,Interim,RegularPeriodic
*/
enum class OBInternalStatementType1Code(@get:JsonValue val value: kotlin.String) {

  AccountClosure("AccountClosure"),
  AccountOpening("AccountOpening"),
  Annual("Annual"),
  Interim("Interim"),
  RegularPeriodic("RegularPeriodic"),
  ;

  companion object {
    @JvmStatic
    @JsonCreator
    fun forValue(value: kotlin.String): OBInternalStatementType1Code = values().firstOrNull { it -> it.value == value }
      ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBInternalStatementType1Code'")
  }
}
