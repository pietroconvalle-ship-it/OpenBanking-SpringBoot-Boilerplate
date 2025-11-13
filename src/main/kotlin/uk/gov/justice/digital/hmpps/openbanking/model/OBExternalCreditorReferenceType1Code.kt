package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

/**
* Specifies the type of creditor reference as published in an external creditor reference type code set.  External code sets can be downloaded from www.iso20022.org. *`DISP`-Document is a dispatch advice. *`FXDR`-Document is a pre-agreed or pre-arranged foreign exchange transaction to which the payment transaction refers. *`PUOR`-Document is a purchase order. *`RPIN`-Document is a linked payment instruction to which the current payment instruction is related, for example, in a cover scenario. *`RADM`-Document is a remittance advice sent separately from the current transaction. *`SCOR`-Document is a structured communication reference provided by the creditor to identify the referred transaction.
* Values: DISP,FXDR,PUOR,RPIN,RADM,SCOR
*/
enum class OBExternalCreditorReferenceType1Code(@get:JsonValue val value: kotlin.String) {

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
    fun forValue(value: kotlin.String): OBExternalCreditorReferenceType1Code = values().firstOrNull { it -> it.value == value }
      ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBExternalCreditorReferenceType1Code'")
  }
}
