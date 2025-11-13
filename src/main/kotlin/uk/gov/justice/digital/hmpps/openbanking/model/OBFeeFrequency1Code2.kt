package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

/**
* How frequently the fee/charge is applied to the account
* Values: FEAC,FEAO,FECP,FEDA,FEHO,FEI,FEMO,FEOA,FEOT,FEPC,FEPH,FEPO,FEPS,FEPT,FEPTA,FEPTP,FEQU,FESM,FEST,FEWE,FEYE
*/
enum class OBFeeFrequency1Code2(@get:JsonValue val value: kotlin.String) {

  FEAC("FEAC"),
  FEAO("FEAO"),
  FECP("FECP"),
  FEDA("FEDA"),
  FEHO("FEHO"),
  FEI("FEI"),
  FEMO("FEMO"),
  FEOA("FEOA"),
  FEOT("FEOT"),
  FEPC("FEPC"),
  FEPH("FEPH"),
  FEPO("FEPO"),
  FEPS("FEPS"),
  FEPT("FEPT"),
  FEPTA("FEPTA"),
  FEPTP("FEPTP"),
  FEQU("FEQU"),
  FESM("FESM"),
  FEST("FEST"),
  FEWE("FEWE"),
  FEYE("FEYE"),
  ;

  companion object {
    @JvmStatic
    @JsonCreator
    fun forValue(value: kotlin.String): OBFeeFrequency1Code2 = values().firstOrNull { it -> it.value == value }
      ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBFeeFrequency1Code2'")
  }
}
