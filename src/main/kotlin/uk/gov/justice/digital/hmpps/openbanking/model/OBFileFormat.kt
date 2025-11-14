package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

/**
* For a full list of enumeration values refer to `ExternalDocumentFormat1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_internal_CodeSets)
* Values: DPDF,DXML,SDSH,WORD,XSLT
*/
enum class OBFileFormat(@get:JsonValue val value: kotlin.String) {

  DPDF("DPDF"),
  DXML("DXML"),
  SDSH("SDSH"),
  WORD("WORD"),
  XSLT("XSLT"),
  ;

  companion object {
    @JvmStatic
    @JsonCreator
    fun forValue(value: kotlin.String): OBFileFormat = values().firstOrNull { it -> it.value == value }
      ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBFileFormat'")
  }
}
