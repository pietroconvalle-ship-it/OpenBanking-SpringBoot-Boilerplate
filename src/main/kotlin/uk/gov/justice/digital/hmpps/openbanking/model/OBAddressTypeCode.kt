package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

/**
* Identifies the nature of the postal address.
* Values: Business,Correspondence,DeliveryTo,MailTo,POBox,Postal,Residential,Statement
*/
enum class OBAddressTypeCode(@get:JsonValue val value: kotlin.String) {

  Business("Business"),
  Correspondence("Correspondence"),
  DeliveryTo("DeliveryTo"),
  MailTo("MailTo"),
  POBox("POBox"),
  Postal("Postal"),
  Residential("Residential"),
  Statement("Statement"),
  ;

  companion object {
    @JvmStatic
    @JsonCreator
    fun forValue(value: kotlin.String): OBAddressTypeCode = values().firstOrNull { it -> it.value == value }
      ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBAddressTypeCode'")
  }
}
