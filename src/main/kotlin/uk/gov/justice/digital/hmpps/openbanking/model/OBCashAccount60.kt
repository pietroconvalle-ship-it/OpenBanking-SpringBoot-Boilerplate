package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import uk.gov.justice.digital.hmpps.openbanking.model.OBProxy1
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
 * Unambiguous identification of the account of the creditor, in the case of a debit transaction.
 * @param schemeName Name of the identification scheme, in a coded form as published in an external list. <br /> For a full list of enumeration values refer to `OBInternalAccountIdentification4Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 * @param identification Identification assigned by an institution to identify an account. This identification is known by the account owner.
 * @param name The account name is the name or names of the account owner(s) represented at an account level, as displayed by the ASPSP's online channels. Note, the account name is not the product name or the nickname of the account.
 * @param secondaryIdentification This is secondary identification of the account, as assigned by the account servicing institution.  This can be used by building societies to additionally identify accounts with a roll number (in addition to a sort code and account number combination).
 * @param proxy 
 */
data class OBCashAccount60(

    @Schema(example = "null", description = "Name of the identification scheme, in a coded form as published in an external list. <br /> For a full list of enumeration values refer to `OBInternalAccountIdentification4Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
    @get:JsonProperty("SchemeName") val schemeName: kotlin.String? = null,

    @get:Size(min=1,max=256)
    @Schema(example = "80200112344562", description = "Identification assigned by an institution to identify an account. This identification is known by the account owner.")
    @get:JsonProperty("Identification") val identification: kotlin.String? = null,

    @get:Size(min=1,max=350)
    @Schema(example = "Jane Smith", description = "The account name is the name or names of the account owner(s) represented at an account level, as displayed by the ASPSP's online channels. Note, the account name is not the product name or the nickname of the account.")
    @get:JsonProperty("Name") val name: kotlin.String? = null,

    @get:Size(min=1,max=34)
    @Schema(example = "87562298675897", description = "This is secondary identification of the account, as assigned by the account servicing institution.  This can be used by building societies to additionally identify accounts with a roll number (in addition to a sort code and account number combination).")
    @get:JsonProperty("SecondaryIdentification") val secondaryIdentification: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("Proxy") val proxy: OBProxy1? = null
) {

}

