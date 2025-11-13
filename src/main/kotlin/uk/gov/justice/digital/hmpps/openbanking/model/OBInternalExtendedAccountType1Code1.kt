package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

/**
* Specifies the extended type of account if known. For a full set of values refer to `OBInternalExtendedAccountType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
* Values: Business,BusinessSavingsAccount,Charity,Collection,Corporate,Ewallet,Government,Investment,ISA,JointPersonal,Pension,Personal,PersonalSavingsAccount,Premier,Wealth
*/
enum class OBInternalExtendedAccountType1Code1(@get:JsonValue val value: kotlin.String) {

  Business("Business"),
  BusinessSavingsAccount("BusinessSavingsAccount"),
  Charity("Charity"),
  Collection("Collection"),
  Corporate("Corporate"),
  Ewallet("Ewallet"),
  Government("Government"),
  Investment("Investment"),
  ISA("ISA"),
  JointPersonal("JointPersonal"),
  Pension("Pension"),
  Personal("Personal"),
  PersonalSavingsAccount("PersonalSavingsAccount"),
  Premier("Premier"),
  Wealth("Wealth"),
  ;

  companion object {
    @JvmStatic
    @JsonCreator
    fun forValue(value: kotlin.String): OBInternalExtendedAccountType1Code1 = values().firstOrNull { it -> it.value == value }
      ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBInternalExtendedAccountType1Code1'")
  }
}
