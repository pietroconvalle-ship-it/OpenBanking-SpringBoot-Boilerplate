package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

/**
* Specifies which party/parties will bear the charges associated with the processing of the payment transaction. For a full list of values refer to `OBInternalChargeBearerType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
* Values: BorneByCreditor,BorneByDebtor,FollowingServiceLevel,Shared
*/
enum class OBInternalChargeBearerType1Code(@get:JsonValue val value: kotlin.String) {

  BorneByCreditor("BorneByCreditor"),
  BorneByDebtor("BorneByDebtor"),
  FollowingServiceLevel("FollowingServiceLevel"),
  Shared("Shared"),
  ;

  companion object {
    @JvmStatic
    @JsonCreator
    fun forValue(value: kotlin.String): OBInternalChargeBearerType1Code = values().firstOrNull { it -> it.value == value }
      ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBInternalChargeBearerType1Code'")
  }
}
