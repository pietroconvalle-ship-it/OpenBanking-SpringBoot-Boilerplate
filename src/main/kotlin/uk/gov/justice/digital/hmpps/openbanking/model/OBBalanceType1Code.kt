package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

/**
* Balance type, in a coded form. <br /> For a full list of enumeration values refer to `ExternalBalanceType1Code` in *ISO_External_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets).
* Values: CLAV,CLBD,FWAV,INFO,ITAV,ITBD,OPAV,OPBD,PRCD,XPCD
*/
enum class OBBalanceType1Code(@get:JsonValue val value: kotlin.String) {

  CLAV("CLAV"),
  CLBD("CLBD"),
  FWAV("FWAV"),
  INFO("INFO"),
  ITAV("ITAV"),
  ITBD("ITBD"),
  OPAV("OPAV"),
  OPBD("OPBD"),
  PRCD("PRCD"),
  XPCD("XPCD"),
  ;

  companion object {
    @JvmStatic
    @JsonCreator
    fun forValue(value: kotlin.String): OBBalanceType1Code = values().firstOrNull { it -> it.value == value }
      ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBBalanceType1Code'")
  }
}
