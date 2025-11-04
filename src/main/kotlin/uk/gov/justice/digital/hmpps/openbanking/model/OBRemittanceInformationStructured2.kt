package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import uk.gov.justice.digital.hmpps.openbanking.model.OBReferredDocumentInformation2
import uk.gov.justice.digital.hmpps.openbanking.model.OBRemittanceInformationStructured2CreditorReferenceInformation
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
 * @param referredDocumentInformation Provides the identification and the content of the referred document.
 * @param referredDocumentAmount 
 * @param creditorReferenceInformation 
 * @param invoicer Identification of the organisation issuing the invoice, when it is different from the creditor or ultimate creditor
 * @param invoicee Identification of the party to whom an invoice is issued, when it is different from the debtor or ultimate debtor.
 * @param taxRemittance 
 * @param additionalRemittanceInformation 
 */
data class OBRemittanceInformationStructured2(

    @field:Valid
    @Schema(example = "null", description = "Provides the identification and the content of the referred document.")
    @get:JsonProperty("ReferredDocumentInformation") val referredDocumentInformation: kotlin.collections.List<OBReferredDocumentInformation2>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ReferredDocumentAmount") val referredDocumentAmount: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("CreditorReferenceInformation") val creditorReferenceInformation: OBRemittanceInformationStructured2CreditorReferenceInformation? = null,

    @get:Size(max=256)
    @Schema(example = "null", description = "Identification of the organisation issuing the invoice, when it is different from the creditor or ultimate creditor")
    @get:JsonProperty("Invoicer") val invoicer: kotlin.String? = null,

    @get:Size(max=256)
    @Schema(example = "null", description = "Identification of the party to whom an invoice is issued, when it is different from the debtor or ultimate debtor.")
    @get:JsonProperty("Invoicee") val invoicee: kotlin.String? = null,

    @get:Size(min=1,max=140)
    @Schema(example = "null", description = "")
    @get:JsonProperty("TaxRemittance") val taxRemittance: kotlin.String? = null,

    @get:Size(max=3)
    @Schema(example = "null", description = "")
    @get:JsonProperty("AdditionalRemittanceInformation") val additionalRemittanceInformation: kotlin.collections.List<kotlin.String>? = null
) {

}

