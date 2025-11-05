package uk.gov.justice.digital.hmpps.openbanking.model

import java.util.Locale
import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import uk.gov.justice.digital.hmpps.openbanking.model.OBInternalPartyType1Code
import uk.gov.justice.digital.hmpps.openbanking.model.OBPartyRelationships1
import uk.gov.justice.digital.hmpps.openbanking.model.OBPostalAddress7
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
 * @param partyId A unique and immutable identifier used to identify the customer resource. This identifier has no meaning to the account owner.
 * @param partyNumber Number assigned by an agent to identify its customer.
 * @param partyType 
 * @param name Name by which a party is known and which is usually used to identify that party.
 * @param fullLegalName The full legal name of the party.
 * @param legalStructure Legal standing of the party. For a full list refer to `OBInternalLegalStructureType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 * @param LEI Legal entity identification as an alternate identification for a party. Legal Entity Identifier is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\".
 * @param beneficialOwnership A flag to indicate a party's beneficial ownership of the related account
 * @param accountRole A party’s role with respect to the related account. For a full list refer to `OBInternalAccountRole1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 * @param emailAddress Address for electronic mail (e-mail).
 * @param phone Collection of information that identifies a phone number, as defined by telecom services.
 * @param mobile Collection of information that identifies a mobile phone number, as defined by telecom services.
 * @param relationships 
 * @param address 
 */
data class OBParty2(

    @get:Size(min=1,max=40)
    @Schema(example = "PXSIF023", required = true, description = "A unique and immutable identifier used to identify the customer resource. This identifier has no meaning to the account owner.")
    @get:JsonProperty("PartyId", required = true) val partyId: kotlin.String,

    @get:Size(min=1,max=35)
    @Schema(example = "20202002", description = "Number assigned by an agent to identify its customer.")
    @get:JsonProperty("PartyNumber") val partyNumber: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("PartyType") val partyType: OBInternalPartyType1Code? = null,

    @get:Size(min=1,max=350)
    @Schema(example = "Mx Jane Smith", description = "Name by which a party is known and which is usually used to identify that party.")
    @get:JsonProperty("Name") val name: kotlin.String? = null,

    @get:Size(min=1,max=350)
    @Schema(example = "Jane Smith", description = "The full legal name of the party.")
    @get:JsonProperty("FullLegalName") val fullLegalName: kotlin.String? = null,

    @Schema(example = "UK.OBIE.Individual", description = "Legal standing of the party. For a full list refer to `OBInternalLegalStructureType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
    @get:JsonProperty("LegalStructure") val legalStructure: kotlin.String? = null,

    @get:Pattern(regexp="^[A-Z0-9]{18,18}[0-9]{2,2}$")
    @get:Size(min=1,max=20)
    @Schema(example = "IZ9Q00LZEVUKWCQY6X15", description = "Legal entity identification as an alternate identification for a party. Legal Entity Identifier is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\".")
    @get:JsonProperty("LEI") val LEI: kotlin.String? = null,

    @Schema(example = "null", description = "A flag to indicate a party's beneficial ownership of the related account")
    @get:JsonProperty("BeneficialOwnership") val beneficialOwnership: kotlin.Boolean? = null,

    @Schema(example = "null", description = "A party’s role with respect to the related account. For a full list refer to `OBInternalAccountRole1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)")
    @get:JsonProperty("AccountRole") val accountRole: kotlin.String? = null,

    @get:Size(min=1,max=256)
    @Schema(example = "d.user@semiotec.co.jp", description = "Address for electronic mail (e-mail).")
    @get:JsonProperty("EmailAddress") val emailAddress: kotlin.String? = null,

    @get:Pattern(regexp="\\+[0-9]{1,3}-[0-9()+\\-]{1,30}")
    @Schema(example = "+44-2079460000", description = "Collection of information that identifies a phone number, as defined by telecom services.")
    @get:JsonProperty("Phone") val phone: kotlin.String? = null,

    @get:Pattern(regexp="\\+[0-9]{1,3}-[0-9()+\\-]{1,30}")
    @Schema(example = "+44-7700900000", description = "Collection of information that identifies a mobile phone number, as defined by telecom services.")
    @get:JsonProperty("Mobile") val mobile: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("Relationships") val relationships: OBPartyRelationships1? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("Address") val address: kotlin.collections.List<OBPostalAddress7>? = null
) {

}

