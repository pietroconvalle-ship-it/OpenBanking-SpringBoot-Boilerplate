package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

/**
* Status of a transaction entry on the books of the account servicer. <br /> For a full list of enumeration values refer to `ExternalEntryStatus1Code` in *ISO_External_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
* Values: BOOK,FUTR,INFO,PDNG,RJCT
*/
enum class ExternalEntryStatus1Code(@get:JsonValue val value: kotlin.String) {

  BOOK("BOOK"),
  FUTR("FUTR"),
  INFO("INFO"),
  PDNG("PDNG"),
  RJCT("RJCT"),
  ;

  companion object {
    @JvmStatic
    @JsonCreator
    fun forValue(value: kotlin.String): ExternalEntryStatus1Code = values().firstOrNull { it -> it.value == value }
      ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ExternalEntryStatus1Code'")
  }
}
