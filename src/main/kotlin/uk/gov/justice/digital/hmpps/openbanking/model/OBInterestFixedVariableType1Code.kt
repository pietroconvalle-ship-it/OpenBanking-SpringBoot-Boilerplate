package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

/**
* Type of interest rate, Fixed or Variable
* Values: INFI,INVA
*/
enum class OBInterestFixedVariableType1Code(@get:JsonValue val value: kotlin.String) {

  INFI("INFI"),
  INVA("INVA"),
  ;

  companion object {
    @JvmStatic
    @JsonCreator
    fun forValue(value: kotlin.String): OBInterestFixedVariableType1Code = values().firstOrNull { it -> it.value == value }
      ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBInterestFixedVariableType1Code'")
  }
}
