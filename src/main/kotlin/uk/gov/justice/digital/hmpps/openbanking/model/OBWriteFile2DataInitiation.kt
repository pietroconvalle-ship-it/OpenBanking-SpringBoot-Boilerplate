package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import uk.gov.justice.digital.hmpps.openbanking.model.OBRemittanceInformation21
import uk.gov.justice.digital.hmpps.openbanking.model.OBUltimateDebtor11
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteDomestic2DataInitiationCreditorAgent
import uk.gov.justice.digital.hmpps.openbanking.model.OBWriteDomestic2DataInitiationDebtorAccount

/**
 * The Initiation payload is sent by the initiating party to the ASPSP. It is used to request movement of funds using a payment file.
 * @param fileType Specifies the payment file type.
 * @param fileHash A base64 encoding of a SHA256 hash of the file to be uploaded.
 * @param fileReference Reference for the file.
 * @param numberOfTransactions Number of individual transactions contained in the payment information group.
 * @param controlSum Total of all individual amounts included in the group, irrespective of currencies.
 * @param requestedExecutionDateTime Date at which the initiating party requests the clearing agent to process the payment.  Usage: This is the date on which the debtor's account is to be debited. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 * @param localInstrument User community specific instrument. Usage: This element is used to specify a local instrument, local clearing option and/or further qualify the service or service level. For a full list of values refer to `OBInternalLocalInstrument1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 * @param creditorAgent
 * @param debtorAccount
 * @param ultimateDebtor
 * @param remittanceInformation
 * @param supplementaryData Additional information that can not be captured in the structured fields and/or any other specific block.
 */
data class OBWriteFile2DataInitiation(

  @Schema(example = "null", required = true, description = "Specifies the payment file type.")
  @get:JsonProperty("FileType", required = true) val fileType: kotlin.String,

  @get:Size(min = 1, max = 44)
  @Schema(example = "null", required = true, description = "A base64 encoding of a SHA256 hash of the file to be uploaded.")
  @get:JsonProperty("FileHash", required = true) val fileHash: kotlin.String,

  @get:Size(min = 1, max = 40)
  @Schema(example = "null", description = "Reference for the file.")
  @get:JsonProperty("FileReference") val fileReference: kotlin.String? = null,

  @get:Pattern(regexp = "[0-9]{1,15}")
  @Schema(example = "null", description = "Number of individual transactions contained in the payment information group.")
  @get:JsonProperty("NumberOfTransactions") val numberOfTransactions: kotlin.String? = null,

  @Schema(example = "null", description = "Total of all individual amounts included in the group, irrespective of currencies.")
  @get:JsonProperty("ControlSum") val controlSum: java.math.BigDecimal? = null,

  @Schema(example = "null", description = "Date at which the initiating party requests the clearing agent to process the payment.  Usage: This is the date on which the debtor's account is to be debited. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  @get:JsonProperty("RequestedExecutionDateTime") val requestedExecutionDateTime: java.time.OffsetDateTime? = null,

  @Schema(example = "null", description = "User community specific instrument. Usage: This element is used to specify a local instrument, local clearing option and/or further qualify the service or service level. For a full list of values refer to `OBInternalLocalInstrument1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
  @get:JsonProperty("LocalInstrument") val localInstrument: kotlin.String? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("CreditorAgent") val creditorAgent: OBWriteDomestic2DataInitiationCreditorAgent? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("DebtorAccount") val debtorAccount: OBWriteDomestic2DataInitiationDebtorAccount? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("UltimateDebtor") val ultimateDebtor: OBUltimateDebtor11? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("RemittanceInformation") val remittanceInformation: OBRemittanceInformation21? = null,

  @field:Valid
  @Schema(example = "null", description = "Additional information that can not be captured in the structured fields and/or any other specific block.")
  @get:JsonProperty("SupplementaryData") val supplementaryData: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,
)
