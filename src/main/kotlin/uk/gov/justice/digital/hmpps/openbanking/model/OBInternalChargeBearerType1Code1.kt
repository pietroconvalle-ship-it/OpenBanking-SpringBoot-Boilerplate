package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

/**
* Specifies which party/parties will bear the charges associated with the processing of the payment transaction.
* Values: BorneByCreditor,BorneByDebtor,FollowingServiceLevel,Shared
*/
enum class OBInternalChargeBearerType1Code1(@get:JsonValue val value: kotlin.String) {

  BorneByCreditor("BorneByCreditor"),
  BorneByDebtor("BorneByDebtor"),
  FollowingServiceLevel("FollowingServiceLevel"),
  Shared("Shared"),
  ;

  companion object {
    @JvmStatic
    @JsonCreator
    fun forValue(value: kotlin.String): OBInternalChargeBearerType1Code1 = values().firstOrNull { it -> it.value == value }
      ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBInternalChargeBearerType1Code1'")
  }
}
