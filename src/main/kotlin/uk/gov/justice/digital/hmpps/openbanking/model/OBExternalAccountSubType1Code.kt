package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

/**
* Specifies the sub type of account (product family group) <br /> For a full list of enumeration values refer to `OBExternalCashAccountType1Code` *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
* Values: CACC,CARD,CASH,CHAR,CISH,COMM,CPAC,LLSV,LOAN,MGLD,MOMA,NREX,ODFT,ONDP,OTHR,SACC,SLRY,SVGS,TAXE,TRAN,TRAS,VACC,NFCA,MORT,WALT
*/
enum class OBExternalAccountSubType1Code(@get:JsonValue val value: kotlin.String) {

  CACC("CACC"),
  CARD("CARD"),
  CASH("CASH"),
  CHAR("CHAR"),
  CISH("CISH"),
  COMM("COMM"),
  CPAC("CPAC"),
  LLSV("LLSV"),
  LOAN("LOAN"),
  MGLD("MGLD"),
  MOMA("MOMA"),
  NREX("NREX"),
  ODFT("ODFT"),
  ONDP("ONDP"),
  OTHR("OTHR"),
  SACC("SACC"),
  SLRY("SLRY"),
  SVGS("SVGS"),
  TAXE("TAXE"),
  TRAN("TRAN"),
  TRAS("TRAS"),
  VACC("VACC"),
  NFCA("NFCA"),
  MORT("MORT"),
  WALT("WALT"),
  ;

  companion object {
    @JvmStatic
    @JsonCreator
    fun forValue(value: kotlin.String): OBExternalAccountSubType1Code = values().firstOrNull { it -> it.value == value }
      ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBExternalAccountSubType1Code'")
  }
}
