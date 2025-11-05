package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Locale
import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import uk.gov.justice.digital.hmpps.openbanking.model.OBBCAData1
import uk.gov.justice.digital.hmpps.openbanking.model.OBPCAData1
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadProduct2DataProductInnerOtherProductType
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
 * Product details associated with the Account
 * @param accountId A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.
 * @param productType Descriptive code for the product category.  For a full list refer to `OBInternalProductType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)<br /><br /> If ProductType - \"Other\" is chosen, the object OtherProductType must be populated with name, and description.
 * @param productName The name of the Product used for marketing purposes from a customer perspective. I.e. what the customer would recognise.
 * @param productId Identifier within the parent organisation for the product. Must be unique in the organisation
 * @param secondaryProductId Any secondary Identification which supports Product Identifier to uniquely identify the current account banking products.
 * @param marketingStateId Unique and unambiguous identification of a Product Marketing State.
 * @param otherProductType 
 * @param BCA 
 * @param PCA 
 */
data class OBReadProduct2DataProductInner(

    @get:Size(min=1,max=40)
    @Schema(example = "22289", required = true, description = "A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.")
    @get:JsonProperty("AccountId", required = true) val accountId: kotlin.String,

    @Schema(example = "PersonalCurrentAccount", required = true, description = "Descriptive code for the product category.  For a full list refer to `OBInternalProductType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)<br /><br /> If ProductType - \"Other\" is chosen, the object OtherProductType must be populated with name, and description.")
    @get:JsonProperty("ProductType", required = true) val productType: OBReadProduct2DataProductInner.ProductType,

    @get:Size(min=1,max=350)
    @Schema(example = "321 Product", description = "The name of the Product used for marketing purposes from a customer perspective. I.e. what the customer would recognise.")
    @get:JsonProperty("ProductName") val productName: kotlin.String? = null,

    @get:Size(min=1,max=40)
    @Schema(example = "51B", description = "Identifier within the parent organisation for the product. Must be unique in the organisation")
    @get:JsonProperty("ProductId") val productId: kotlin.String? = null,

    @get:Size(min=1,max=70)
    @Schema(example = "CA78", description = "Any secondary Identification which supports Product Identifier to uniquely identify the current account banking products.")
    @get:JsonProperty("SecondaryProductId") val secondaryProductId: kotlin.String? = null,

    @get:Size(min=1,max=35)
    @Schema(example = "22878123", description = "Unique and unambiguous identification of a Product Marketing State.")
    @get:JsonProperty("MarketingStateId") val marketingStateId: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("OtherProductType") val otherProductType: OBReadProduct2DataProductInnerOtherProductType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("BCA") val BCA: OBBCAData1? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("PCA") val PCA: OBPCAData1? = null
) {

    /**
    * Descriptive code for the product category.  For a full list refer to `OBInternalProductType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)<br /><br /> If ProductType - \"Other\" is chosen, the object OtherProductType must be populated with name, and description.
    * Values: BusinessCurrentAccount,CommercialCreditCard,Other,PersonalCurrentAccount,SMELoan
    */
    enum class ProductType(@get:JsonValue val value: kotlin.String) {

        BusinessCurrentAccount("BusinessCurrentAccount"),
        CommercialCreditCard("CommercialCreditCard"),
        Other("Other"),
        PersonalCurrentAccount("PersonalCurrentAccount"),
        SMELoan("SMELoan");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): ProductType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OBReadProduct2DataProductInner'")
            }
        }
    }

}

