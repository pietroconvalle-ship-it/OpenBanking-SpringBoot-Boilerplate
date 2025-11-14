package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

/**
* Specifies the Beneficiary Type.
* Values: Trusted,Ordinary
*/
enum class OBInternalBeneficiaryType1Code(@get:JsonValue val value: kotlin.String) {

  Trusted("Trusted"),
  Ordinary("Ordinary"),
  ;

  companion object {
    @JvmStatic
    @JsonCreator
    fun forValue(value: kotlin.String): OBInternalBeneficiaryType1Code = values().firstOrNull { it -> it.value == value }
      ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBInternalBeneficiaryType1Code'")
  }
}
