package uk.gov.justice.digital.hmpps.openbanking.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.constraints.Size

/**
 * Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account.
 * @param schemeName Name of the identification scheme, in a coded form as published in an external list.<br/> For a full list of enumeration values refer to `OBInternalFinancialInstitutionIdentification4Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 * @param identification Unique and unambiguous identification of the servicing institution.
 * @param name Name by which an agent is known and which is usually used to identify that agent.
 */
data class OBBranchAndFinancialInstitutionIdentification50(

  @Schema(example = "UK.OBIE.BICFI", required = true, description = "Name of the identification scheme, in a coded form as published in an external list.<br/> For a full list of enumeration values refer to `OBInternalFinancialInstitutionIdentification4Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
  @get:JsonProperty("SchemeName", required = true) val schemeName: kotlin.String,

  @get:Size(min = 1, max = 35)
  @Schema(example = "80200112344562", required = true, description = "Unique and unambiguous identification of the servicing institution.")
  @get:JsonProperty("Identification", required = true) val identification: kotlin.String,

  @get:Size(min = 1, max = 140)
  @Schema(example = "Agent Name", description = "Name by which an agent is known and which is usually used to identify that agent.")
  @get:JsonProperty("Name") val name: kotlin.String? = null,
)
