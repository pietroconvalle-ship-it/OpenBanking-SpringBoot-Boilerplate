package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import uk.gov.justice.digital.hmpps.openbanking.model.OBInternalBeneficiaryType1Code
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
 * 
 * @param accountId A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.
 * @param beneficiaryId A unique and immutable identifier used to identify the beneficiary resource. This identifier has no meaning to the account owner.
 * @param beneficiaryType 
 * @param reference Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification.
 * @param supplementaryData Additional information that can not be captured in the structured fields and/or any other specific block.
 */
data class OBBeneficiary5Basic(

    @get:Size(min=1,max=40)
    @Schema(example = "22289", description = "A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.")
    @get:JsonProperty("AccountId") val accountId: kotlin.String? = null,

    @get:Size(min=1,max=40)
    @Schema(example = "Ben1", description = "A unique and immutable identifier used to identify the beneficiary resource. This identifier has no meaning to the account owner.")
    @get:JsonProperty("BeneficiaryId") val beneficiaryId: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("BeneficiaryType") val beneficiaryType: OBInternalBeneficiaryType1Code? = null,

    @get:Size(min=1,max=35)
    @Schema(example = "Towbar Club", description = "Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification.")
    @get:JsonProperty("Reference") val reference: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "Additional information that can not be captured in the structured fields and/or any other specific block.")
    @get:JsonProperty("SupplementaryData") val supplementaryData: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null
) {

}

