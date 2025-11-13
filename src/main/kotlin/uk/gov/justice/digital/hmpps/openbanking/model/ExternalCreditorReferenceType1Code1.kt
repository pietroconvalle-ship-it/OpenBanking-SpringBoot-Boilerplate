package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

/**
* Specifies the amount type, as published in an external referred amount code set. For a full lust of values refer to `ExternalCreditorReferenceType1Code` in *ISO_External_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
* Values: DISP,FXDR,PUOR,RPIN,RADM,SCOR
*/
enum class ExternalCreditorReferenceType1Code1(@get:JsonValue val value: kotlin.String) {

  DISP("DISP"),
  FXDR("FXDR"),
  PUOR("PUOR"),
  RPIN("RPIN"),
  RADM("RADM"),
  SCOR("SCOR"),
  ;

  companion object {
    @JvmStatic
    @JsonCreator
    fun forValue(value: kotlin.String): ExternalCreditorReferenceType1Code1 = values().firstOrNull { it -> it.value == value }
      ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ExternalCreditorReferenceType1Code1'")
  }
}
