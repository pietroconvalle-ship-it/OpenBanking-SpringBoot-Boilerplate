package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import jakarta.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * Supporting Data provided by TPP, when requesting SCA Exemption.
 * @param requestedSCAExemptionType This field allows a PISP to request specific SCA Exemption for a Payment Initiation. For a full list of values reefer to `OBInternalSCAExemptionType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 * @param appliedAuthenticationApproach Specifies a character string with a maximum length of 40 characters. Usage: This field indicates whether the PSU was subject to SCA performed by the TPP For a full list of values refer to `OBInternalAppliedAuthenticationApproach1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 * @param referencePaymentOrderId If the payment is recurring, then this field is populated with the transaction identifier of the previous payment occurrence so that the ASPSP can verify that the PISP, amount and the payee are the same as the previous occurrence. The value here refers to the payment id e.g. DomesticPaymentId  
 */
data class OBSCASupportData1(

    @Schema(example = "null", description = "This field allows a PISP to request specific SCA Exemption for a Payment Initiation. For a full list of values reefer to `OBInternalSCAExemptionType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
    @get:JsonProperty("RequestedSCAExemptionType") val requestedSCAExemptionType: OBSCASupportData1.RequestedSCAExemptionType? = null,

    @get:Size(max=40)
    @Schema(example = "null", description = "Specifies a character string with a maximum length of 40 characters. Usage: This field indicates whether the PSU was subject to SCA performed by the TPP For a full list of values refer to `OBInternalAppliedAuthenticationApproach1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
    @get:JsonProperty("AppliedAuthenticationApproach") val appliedAuthenticationApproach: OBSCASupportData1.AppliedAuthenticationApproach? = null,

    @get:Size(min=1,max=40)
    @Schema(example = "null", description = "If the payment is recurring, then this field is populated with the transaction identifier of the previous payment occurrence so that the ASPSP can verify that the PISP, amount and the payee are the same as the previous occurrence. The value here refers to the payment id e.g. DomesticPaymentId  ")
    @get:JsonProperty("ReferencePaymentOrderId") val referencePaymentOrderId: kotlin.String? = null
) {

    /**
    * This field allows a PISP to request specific SCA Exemption for a Payment Initiation. For a full list of values reefer to `OBInternalSCAExemptionType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
    * Values: BillPayment,ContactlessTravel,EcommerceGoods,EcommerceServices,Kiosk,Parking,PartyToParty
    */
    enum class RequestedSCAExemptionType(val value: kotlin.String) {

        @JsonProperty("BillPayment") BillPayment("BillPayment"),
        @JsonProperty("ContactlessTravel") ContactlessTravel("ContactlessTravel"),
        @JsonProperty("EcommerceGoods") EcommerceGoods("EcommerceGoods"),
        @JsonProperty("EcommerceServices") EcommerceServices("EcommerceServices"),
        @JsonProperty("Kiosk") Kiosk("Kiosk"),
        @JsonProperty("Parking") Parking("Parking"),
        @JsonProperty("PartyToParty") PartyToParty("PartyToParty")
    }

    /**
    * Specifies a character string with a maximum length of 40 characters. Usage: This field indicates whether the PSU was subject to SCA performed by the TPP For a full list of values refer to `OBInternalAppliedAuthenticationApproach1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
    * Values: CA,SCA
    */
    enum class AppliedAuthenticationApproach(val value: kotlin.String) {

        @JsonProperty("CA") CA("CA"),
        @JsonProperty("SCA") SCA("SCA")
    }

}

