package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.Valid
import jakarta.validation.constraints.Size
import uk.gov.justice.digital.hmpps.openbanking.model.ExternalCategoryPurpose1Code
import uk.gov.justice.digital.hmpps.openbanking.model.ExternalEntryStatus1Code
import uk.gov.justice.digital.hmpps.openbanking.model.OBActiveOrHistoricCurrencyAndAmount10
import uk.gov.justice.digital.hmpps.openbanking.model.OBActiveOrHistoricCurrencyAndAmount9
import uk.gov.justice.digital.hmpps.openbanking.model.OBBankTransactionCodeStructure1
import uk.gov.justice.digital.hmpps.openbanking.model.OBCreditDebitCode1
import uk.gov.justice.digital.hmpps.openbanking.model.OBCurrencyExchange5
import uk.gov.justice.digital.hmpps.openbanking.model.OBExtendedProprietaryBankTransactionCode
import uk.gov.justice.digital.hmpps.openbanking.model.OBExternalPurpose1Code
import uk.gov.justice.digital.hmpps.openbanking.model.OBInternalTransactionMutability1Code
import uk.gov.justice.digital.hmpps.openbanking.model.OBTransactionCardInstrument1
import uk.gov.justice.digital.hmpps.openbanking.model.ProprietaryBankTransactionCodeStructure1

/**
 * Provides further details on an entry in the report.
 * @param accountId A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.
 * @param creditDebitIndicator
 * @param status
 * @param bookingDateTime Date and time when a transaction entry is posted to an account on the account servicer's books. Usage: Booking date is the expected booking date, unless the status is booked, in which case it is the actual booking date. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 * @param amount
 * @param transactionId Unique identifier for the transaction within an servicing institution. This identifier is both unique and immutable.
 * @param transactionReference Unique reference for the transaction. This reference is optionally populated, and may as an example be the FPID in the Faster Payments context.
 * @param statementReference
 * @param transactionMutability
 * @param valueDateTime Date and time at which assets become available to the account owner in case of a credit entry, or cease to be available to the account owner in case of a debit transaction entry. Usage: If transaction entry status is pending and value date is present, then the value date refers to an expected/requested value date. For transaction entries subject to availability/float and for which availability information is provided, the value date must not be used. In this case the availability component identifies the number of availability days. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 * @param addressLine Information that locates and identifies a specific address for a transaction entry, that is presented in free format text.
 * @param chargeAmount
 * @param currencyExchange
 * @param bankTransactionCode
 * @param proprietaryBankTransactionCode
 * @param extendedProprietaryBankTransactionCodes
 * @param cardInstrument
 * @param supplementaryData Additional information that can not be captured in the structured fields and/or any other specific block.
 * @param categoryPurposeCode
 * @param paymentPurposeCode
 */
data class OBTransaction6Basic(

  @get:Size(min = 1, max = 40)
  @Schema(example = "22289", required = true, description = "A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.")
  @get:JsonProperty("AccountId", required = true) val accountId: kotlin.String,

  @field:Valid
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("CreditDebitIndicator", required = true) val creditDebitIndicator: OBCreditDebitCode1,

  @field:Valid
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("Status", required = true) val status: ExternalEntryStatus1Code,

  @Schema(example = "null", required = true, description = "Date and time when a transaction entry is posted to an account on the account servicer's books. Usage: Booking date is the expected booking date, unless the status is booked, in which case it is the actual booking date. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  @get:JsonProperty("BookingDateTime", required = true) val bookingDateTime: java.time.OffsetDateTime,

  @field:Valid
  @Schema(example = "null", required = true, description = "")
  @get:JsonProperty("Amount", required = true) val amount: OBActiveOrHistoricCurrencyAndAmount9,

  @get:Size(min = 1, max = 210)
  @Schema(example = "null", description = "Unique identifier for the transaction within an servicing institution. This identifier is both unique and immutable.")
  @get:JsonProperty("TransactionId") val transactionId: kotlin.String? = null,

  @get:Size(min = 1, max = 210)
  @Schema(example = "null", description = "Unique reference for the transaction. This reference is optionally populated, and may as an example be the FPID in the Faster Payments context.")
  @get:JsonProperty("TransactionReference") val transactionReference: kotlin.String? = null,

  @Schema(example = "null", description = "")
  @get:JsonProperty("StatementReference") val statementReference: kotlin.collections.List<kotlin.String>? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("TransactionMutability") val transactionMutability: OBInternalTransactionMutability1Code? = null,

  @Schema(example = "null", description = "Date and time at which assets become available to the account owner in case of a credit entry, or cease to be available to the account owner in case of a debit transaction entry. Usage: If transaction entry status is pending and value date is present, then the value date refers to an expected/requested value date. For transaction entries subject to availability/float and for which availability information is provided, the value date must not be used. In this case the availability component identifies the number of availability days. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  @get:JsonProperty("ValueDateTime") val valueDateTime: java.time.OffsetDateTime? = null,

  @get:Size(min = 1, max = 70)
  @Schema(example = "null", description = "Information that locates and identifies a specific address for a transaction entry, that is presented in free format text.")
  @get:JsonProperty("AddressLine") val addressLine: kotlin.String? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("ChargeAmount") val chargeAmount: OBActiveOrHistoricCurrencyAndAmount10? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("CurrencyExchange") val currencyExchange: OBCurrencyExchange5? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("BankTransactionCode") val bankTransactionCode: OBBankTransactionCodeStructure1? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("ProprietaryBankTransactionCode") val proprietaryBankTransactionCode: ProprietaryBankTransactionCodeStructure1? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("ExtendedProprietaryBankTransactionCodes") val extendedProprietaryBankTransactionCodes: kotlin.collections.List<OBExtendedProprietaryBankTransactionCode>? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("CardInstrument") val cardInstrument: OBTransactionCardInstrument1? = null,

  @field:Valid
  @Schema(example = "null", description = "Additional information that can not be captured in the structured fields and/or any other specific block.")
  @get:JsonProperty("SupplementaryData") val supplementaryData: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("CategoryPurposeCode") val categoryPurposeCode: ExternalCategoryPurpose1Code? = null,

  @field:Valid
  @Schema(example = "null", description = "")
  @get:JsonProperty("PaymentPurposeCode") val paymentPurposeCode: OBExternalPurpose1Code? = null,
)
