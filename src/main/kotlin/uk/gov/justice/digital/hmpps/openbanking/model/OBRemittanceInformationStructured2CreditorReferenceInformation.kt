package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.Size
import uk.gov.justice.digital.hmpps.openbanking.model.ExternalCreditorReferenceType1Code1

/**
 * Reference information provided by the creditor to allow the identification of the underlying documents.
 * @param code
 * @param issuer Entity that assigns the identification.
 * @param reference Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction.
 */
data class OBRemittanceInformationStructured2CreditorReferenceInformation(

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("Code") val code: ExternalCreditorReferenceType1Code1? = null,

  @get:Size(min = 1, max = 35)
  @Schema(example = "null", description = "Entity that assigns the identification.")
  @get:JsonProperty("Issuer") val issuer: kotlin.String? = null,

  @get:Size(min = 1, max = 35)
  @Schema(example = "null", description = "Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction.")
  @get:JsonProperty("Reference") val reference: kotlin.String? = null,
)
