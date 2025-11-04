package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import uk.gov.justice.digital.hmpps.openbanking.model.ExternalCategoryPurpose1Code1
import uk.gov.justice.digital.hmpps.openbanking.model.ExternalPurpose1Code
import uk.gov.justice.digital.hmpps.openbanking.model.OBInternalExtendedAccountType1Code
import uk.gov.justice.digital.hmpps.openbanking.model.OBPostalAddress71
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
 * The Risk section is sent by the initiating party to the ASPSP. It is used to specify additional details for risk scoring for Payments.
 * @param paymentContextCode Specifies the payment context, `OBInternalPaymentContext1Code` 
 * @param merchantCategoryCode Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction.
 * @param merchantCustomerIdentification The unique customer identifier of the PSU with the merchant.
 * @param contractPresentIndicator Indicates if Payee has a contractual relationship with the PISP.
 * @param beneficiaryPrepopulatedIndicator Indicates if PISP has immutably prepopulated payment details in for the PSU.
 * @param paymentPurposeCode 
 * @param categoryPurposeCode 
 * @param beneficiaryAccountType 
 * @param deliveryAddress 
 */
data class OBRisk1(

    @Schema(example = "null", description = "Specifies the payment context, `OBInternalPaymentContext1Code` ")
    @get:JsonProperty("PaymentContextCode") val paymentContextCode: OBRisk1.PaymentContextCode? = null,

    @get:Size(min=3,max=4)
    @Schema(example = "null", description = "Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction.")
    @get:JsonProperty("MerchantCategoryCode") val merchantCategoryCode: kotlin.String? = null,

    @get:Size(min=1,max=70)
    @Schema(example = "null", description = "The unique customer identifier of the PSU with the merchant.")
    @get:JsonProperty("MerchantCustomerIdentification") val merchantCustomerIdentification: kotlin.String? = null,

    @Schema(example = "null", description = "Indicates if Payee has a contractual relationship with the PISP.")
    @get:JsonProperty("ContractPresentIndicator") val contractPresentIndicator: kotlin.Boolean? = null,

    @Schema(example = "null", description = "Indicates if PISP has immutably prepopulated payment details in for the PSU.")
    @get:JsonProperty("BeneficiaryPrepopulatedIndicator") val beneficiaryPrepopulatedIndicator: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("PaymentPurposeCode") val paymentPurposeCode: ExternalPurpose1Code? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("CategoryPurposeCode") val categoryPurposeCode: ExternalCategoryPurpose1Code1? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("BeneficiaryAccountType") val beneficiaryAccountType: OBInternalExtendedAccountType1Code? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("DeliveryAddress") val deliveryAddress: OBPostalAddress71? = null
) {

    /**
    * Specifies the payment context, `OBInternalPaymentContext1Code` 
    * Values: BillingGoodsAndServicesInAdvance,BillingGoodsAndServicesInArrears,EcommerceMerchantInitiatedPayment,FaceToFacePointOfSale,TransferToSelf,TransferToThirdParty
    */
    enum class PaymentContextCode(val value: kotlin.String) {

        @JsonProperty("BillingGoodsAndServicesInAdvance") BillingGoodsAndServicesInAdvance("BillingGoodsAndServicesInAdvance"),
        @JsonProperty("BillingGoodsAndServicesInArrears") BillingGoodsAndServicesInArrears("BillingGoodsAndServicesInArrears"),
        @JsonProperty("EcommerceMerchantInitiatedPayment") EcommerceMerchantInitiatedPayment("EcommerceMerchantInitiatedPayment"),
        @JsonProperty("FaceToFacePointOfSale") FaceToFacePointOfSale("FaceToFacePointOfSale"),
        @JsonProperty("TransferToSelf") TransferToSelf("TransferToSelf"),
        @JsonProperty("TransferToThirdParty") TransferToThirdParty("TransferToThirdParty")
    }

}

