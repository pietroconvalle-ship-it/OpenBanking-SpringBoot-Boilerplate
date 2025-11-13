package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.Size
import uk.gov.justice.digital.hmpps.openbanking.model.ExternalDocumentType1Code1

/**
 *
 * @param code
 * @param issuer Identification of the issuer of the reference document type.
 * @param number Identification of the type specified for the referred document line.
 * @param relatedDate All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 * @param lineDetails Set of elements used to provide the content of the referred document line.
 */
data class OBReferredDocumentInformation2(

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("Code") val code: ExternalDocumentType1Code1? = null,

  @get:Size(min = 1, max = 35)
  @Schema(example = "null", description = "Identification of the issuer of the reference document type.")
  @get:JsonProperty("Issuer") val issuer: kotlin.String? = null,

  @get:Size(min = 1, max = 35)
  @Schema(example = "null", description = "Identification of the type specified for the referred document line.")
  @get:JsonProperty("Number") val number: kotlin.String? = null,

  @Schema(example = "null", description = "All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  @get:JsonProperty("RelatedDate") val relatedDate: java.time.OffsetDateTime? = null,

  @Schema(example = "null", description = "Set of elements used to provide the content of the referred document line.")
  @get:JsonProperty("LineDetails") val lineDetails: kotlin.collections.List<kotlin.String>? = null,
)
