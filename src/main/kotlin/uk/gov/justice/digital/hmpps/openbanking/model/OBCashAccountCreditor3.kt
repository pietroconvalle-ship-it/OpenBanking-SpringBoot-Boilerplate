package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import uk.gov.justice.digital.hmpps.openbanking.model.OBProxy11
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
 * @param schemeName Name of the identification scheme, in a coded form as published in an external list. For a full list of values refer to `OBInternalAccountIdentification4Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 * @param identification Identification assigned by an institution to identify an account. This identification is known by the account owner.
 * @param name Name of the account, as assigned by the account servicing institution.  Usage The account name is the name or names of the account owner(s) represented at an account level. The account name is not the product name or the nickname of the account.
 * @param secondaryIdentification Secondary identification of the account, as assigned by the account servicing institution. This can be used by building societies to additionally identify accounts with a roll number (in addition to a sort code and account number combination).
 * @param LEI Legal entity identification as an alternate identification for a party. Legal Entity Identifier is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\".
 * @param proxy 
 */
data class OBCashAccountCreditor3(

    @Schema(example = "null", required = true, description = "Name of the identification scheme, in a coded form as published in an external list. For a full list of values refer to `OBInternalAccountIdentification4Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
    @get:JsonProperty("SchemeName", required = true) val schemeName: kotlin.String,

    @get:Size(max=256)
    @Schema(example = "null", required = true, description = "Identification assigned by an institution to identify an account. This identification is known by the account owner.")
    @get:JsonProperty("Identification", required = true) val identification: kotlin.String,

    @Schema(example = "null", required = true, description = "Name of the account, as assigned by the account servicing institution.  Usage The account name is the name or names of the account owner(s) represented at an account level. The account name is not the product name or the nickname of the account.")
    @get:JsonProperty("Name", required = true) val name: kotlin.String,

    @get:Size(max=34)
    @Schema(example = "null", description = "Secondary identification of the account, as assigned by the account servicing institution. This can be used by building societies to additionally identify accounts with a roll number (in addition to a sort code and account number combination).")
    @get:JsonProperty("SecondaryIdentification") val secondaryIdentification: kotlin.String? = null,

    @get:Pattern(regexp="^[0-9]{4}[0]{2}[A-Z0-9]{12}[0-9]{2}")
    @get:Size(min=1,max=20)
    @Schema(example = "null", description = "Legal entity identification as an alternate identification for a party. Legal Entity Identifier is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\".")
    @get:JsonProperty("LEI") val LEI: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("Proxy") val proxy: OBProxy11? = null
) {

}

