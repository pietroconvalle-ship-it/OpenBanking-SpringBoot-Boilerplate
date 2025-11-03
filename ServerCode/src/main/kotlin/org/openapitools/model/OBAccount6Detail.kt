package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.OBAccount6AccountInner
import org.openapitools.model.OBBranchAndFinancialInstitutionIdentification50
import org.openapitools.model.OBExternalAccountSubType1Code
import org.openapitools.model.OBInternalAccountStatus1Code
import org.openapitools.model.OBInternalAccountType1Code
import org.openapitools.model.StatementFrequencyAndFormatInner
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
 * Unambiguous identification of the account to which credit and debit entries are made.
 * @param accountId A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.
 * @param account 
 * @param status 
 * @param statusUpdateDateTime Date and time at which the resource status was updated. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 * @param currency Identification of the currency in which the account is held.  Usage: Currency should only be used in case one and the same account number covers several currencies and the initiating party needs to identify which currency needs to be used for settlement on the account.
 * @param accountCategory 
 * @param accountTypeCode 
 * @param description Specifies the description of the account type.
 * @param nickname The nickname of the account, assigned by the account owner in order to provide an additional means of identification of the account.
 * @param openingDate Date on which the account and related basic services are effectively operational for the account owner. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 * @param maturityDate Maturity date of the account. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
 * @param switchStatus Specifies the switch status for the account, in a coded form. <br /> For a full list of enumeration values refer to `OBInternalSwitchStatusCode` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 * @param statementFrequencyAndFormat 
 * @param servicer 
 */
data class OBAccount6Detail(

    @get:Size(min=1,max=40)
    @Schema(example = "22289", required = true, description = "A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.")
    @get:JsonProperty("AccountId", required = true) val accountId: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("Account", required = true) val account: kotlin.collections.List<OBAccount6AccountInner>,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("Status") val status: OBInternalAccountStatus1Code? = null,

    @Schema(example = "null", description = "Date and time at which the resource status was updated. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @get:JsonProperty("StatusUpdateDateTime") val statusUpdateDateTime: java.time.OffsetDateTime? = null,

    @get:Pattern(regexp="^[A-Z]{3,3}$")
    @Schema(example = "null", description = "Identification of the currency in which the account is held.  Usage: Currency should only be used in case one and the same account number covers several currencies and the initiating party needs to identify which currency needs to be used for settlement on the account.")
    @get:JsonProperty("Currency") val currency: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AccountCategory") val accountCategory: OBInternalAccountType1Code? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AccountTypeCode") val accountTypeCode: OBExternalAccountSubType1Code? = null,

    @get:Size(min=1,max=35)
    @Schema(example = "null", description = "Specifies the description of the account type.")
    @get:JsonProperty("Description") val description: kotlin.String? = null,

    @get:Size(min=1,max=70)
    @Schema(example = "null", description = "The nickname of the account, assigned by the account owner in order to provide an additional means of identification of the account.")
    @get:JsonProperty("Nickname") val nickname: kotlin.String? = null,

    @Schema(example = "null", description = "Date on which the account and related basic services are effectively operational for the account owner. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @get:JsonProperty("OpeningDate") val openingDate: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "Maturity date of the account. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @get:JsonProperty("MaturityDate") val maturityDate: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "Specifies the switch status for the account, in a coded form. <br /> For a full list of enumeration values refer to `OBInternalSwitchStatusCode` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
    @get:JsonProperty("SwitchStatus") val switchStatus: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("StatementFrequencyAndFormat") val statementFrequencyAndFormat: kotlin.collections.List<StatementFrequencyAndFormatInner>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("Servicer") val servicer: OBBranchAndFinancialInstitutionIdentification50? = null
) {

}

