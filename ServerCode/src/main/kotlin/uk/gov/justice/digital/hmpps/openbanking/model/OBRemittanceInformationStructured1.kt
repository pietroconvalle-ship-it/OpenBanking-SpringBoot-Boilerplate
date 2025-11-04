package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import uk.gov.justice.digital.hmpps.openbanking.model.OBReferredDocumentInformation1
import uk.gov.justice.digital.hmpps.openbanking.model.OBRemittanceInformationStructuredCreditorReferenceInformation
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
 * @param referredDocumentInformation 
 * @param referredDocumentAmount Provides details on the amounts of the referred document.
 * @param creditorReferenceInformation 
 * @param invoicer Identification of the organisation issuing the invoice, when it is different from the creditor or ultimate creditor
 * @param invoicee Identification of the party to whom an invoice is issued, when it is different from the debtor or ultimate debtor.
 * @param taxRemittance Provides remittance information about a payment made for tax-related purposes.
 * @param additionalRemittanceInformation Additional information, in free text form, to complement the structured remittance information.
 */
data class OBRemittanceInformationStructured1(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("ReferredDocumentInformation") val referredDocumentInformation: kotlin.collections.List<OBReferredDocumentInformation1>? = null,

    @Schema(example = "null", description = "Provides details on the amounts of the referred document.")
    @get:JsonProperty("ReferredDocumentAmount") val referredDocumentAmount: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("CreditorReferenceInformation") val creditorReferenceInformation: OBRemittanceInformationStructuredCreditorReferenceInformation? = null,

    @get:Size(min=1,max=256)
    @Schema(example = "80200112344562", description = "Identification of the organisation issuing the invoice, when it is different from the creditor or ultimate creditor")
    @get:JsonProperty("Invoicer") val invoicer: kotlin.String? = null,

    @get:Size(min=1,max=256)
    @Schema(example = "80200112344562", description = "Identification of the party to whom an invoice is issued, when it is different from the debtor or ultimate debtor.")
    @get:JsonProperty("Invoicee") val invoicee: kotlin.String? = null,

    @get:Size(min=1,max=140)
    @Schema(example = "null", description = "Provides remittance information about a payment made for tax-related purposes.")
    @get:JsonProperty("TaxRemittance") val taxRemittance: kotlin.String? = null,

    @get:Size(max=3)
    @Schema(example = "null", description = "Additional information, in free text form, to complement the structured remittance information.")
    @get:JsonProperty("AdditionalRemittanceInformation") val additionalRemittanceInformation: kotlin.collections.List<kotlin.String>? = null
) {

}

