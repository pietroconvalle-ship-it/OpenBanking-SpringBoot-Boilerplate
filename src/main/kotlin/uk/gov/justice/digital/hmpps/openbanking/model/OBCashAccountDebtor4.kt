package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Locale
import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * ^ Only included in the response if `Data. ReadRefundAccount` is set to `Yes` in the consent.
 * @param schemeName ^ Name of the identification scheme, in a coded form as published in an external list. | Namespaced Enumeration OBInternalAccountIdentification4Code
 * @param identification ^ Identification assigned by an institution to identify an account. This identification is known by the account owner. | Max256Text
 * @param name ^ Name of the account, as assigned by the account servicing institution.  Usage The account name is the name or names of the account owner(s) represented at an account level. The account name is not the product name or the nickname of the account.
 * @param secondaryIdentification ^ This is secondary identification of the account, as assigned by the account servicing institution.  This can be used by building societies to additionally identify accounts with a roll number (in addition to a sort code and account number combination) | Max34Text
 * @param LEI Legal entity identification as an alternate identification for a party. Legal Entity Identifier is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\".
 */
data class OBCashAccountDebtor4(

    @Schema(example = "null", description = "^ Name of the identification scheme, in a coded form as published in an external list. | Namespaced Enumeration OBInternalAccountIdentification4Code")
    @get:JsonProperty("SchemeName") val schemeName: kotlin.String? = null,

    @Schema(example = "null", description = "^ Identification assigned by an institution to identify an account. This identification is known by the account owner. | Max256Text")
    @get:JsonProperty("Identification") val identification: kotlin.String? = null,

    @Schema(example = "null", description = "^ Name of the account, as assigned by the account servicing institution.  Usage The account name is the name or names of the account owner(s) represented at an account level. The account name is not the product name or the nickname of the account.")
    @get:JsonProperty("Name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "^ This is secondary identification of the account, as assigned by the account servicing institution.  This can be used by building societies to additionally identify accounts with a roll number (in addition to a sort code and account number combination) | Max34Text")
    @get:JsonProperty("SecondaryIdentification") val secondaryIdentification: kotlin.String? = null,

    @get:Pattern(regexp="^[0-9]{4}[0]{2}[A-Z0-9]{12}[0-9]{2}")
    @get:Size(min=1,max=20)
    @Schema(example = "null", description = "Legal entity identification as an alternate identification for a party. Legal Entity Identifier is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\".")
    @get:JsonProperty("LEI") val LEI: kotlin.String? = null
) {

}

