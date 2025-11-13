package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

/**
*
* Values: UKPeriodOBIEPeriodCHAPSOut,UKPeriodOBIEPeriodBalanceTransferOut,UKPeriodOBIEPeriodMoneyTransferOut
*/
enum class OBInternalPaymentChargeType1Code1(@get:JsonValue val value: kotlin.String) {

  UKPeriodOBIEPeriodCHAPSOut("UK.OBIE.CHAPSOut"),
  UKPeriodOBIEPeriodBalanceTransferOut("UK.OBIE.BalanceTransferOut"),
  UKPeriodOBIEPeriodMoneyTransferOut("UK.OBIE.MoneyTransferOut"),
  ;

  companion object {
    @JvmStatic
    @JsonCreator
    fun forValue(value: kotlin.String): OBInternalPaymentChargeType1Code1 = values().firstOrNull { it -> it.value == value }
      ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBInternalPaymentChargeType1Code1'")
  }
}
