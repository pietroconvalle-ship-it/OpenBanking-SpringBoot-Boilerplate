package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import uk.gov.justice.digital.hmpps.openbanking.model.OBCommunicationMethod
import uk.gov.justice.digital.hmpps.openbanking.model.OBFileFormat
import uk.gov.justice.digital.hmpps.openbanking.model.OBFrequency2
import uk.gov.justice.digital.hmpps.openbanking.model.OBPostalAddress7

/**
 * Frequency and format of statments for an account
 * @param frequency
 * @param communicationMethod
 * @param format
 * @param deliveryAddress
 */
data class StatementFrequencyAndFormatInner(

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("Frequency") val frequency: OBFrequency2? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("CommunicationMethod") val communicationMethod: OBCommunicationMethod? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("Format") val format: OBFileFormat? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("DeliveryAddress") val deliveryAddress: OBPostalAddress7? = null,
)
