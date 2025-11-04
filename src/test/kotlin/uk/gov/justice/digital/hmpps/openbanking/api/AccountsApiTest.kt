package uk.gov.justice.digital.hmpps.openbanking.api

import uk.gov.justice.digital.hmpps.openbanking.model.OBErrorResponse1
import uk.gov.justice.digital.hmpps.openbanking.model.OBErrorResponse12
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadAccount6
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadBalance1
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadBeneficiary5
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadDirectDebit2
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadOffer1
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadParty2
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadParty3
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadProduct2
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadScheduledPayment3
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadStandingOrder6
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadStatement2
import uk.gov.justice.digital.hmpps.openbanking.model.OBReadTransaction6
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class AccountsApiTest {

    private val api: AccountsApiController = AccountsApiController()

    /**
     * To test AccountsApiController.getAccounts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getAccountsTest() {
        val authorization: kotlin.String = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBReadAccount6> = api.getAccounts(authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }

    /**
     * To test AccountsApiController.getAccountsAccountId
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getAccountsAccountIdTest() {
        val accountId: kotlin.String = TODO()
        val authorization: kotlin.String = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBReadAccount6> = api.getAccountsAccountId(accountId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }

    /**
     * To test AccountsApiController.getAccountsAccountIdBalances
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getAccountsAccountIdBalancesTest() {
        val accountId: kotlin.String = TODO()
        val authorization: kotlin.String = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBReadBalance1> = api.getAccountsAccountIdBalances(accountId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }

    /**
     * To test AccountsApiController.getAccountsAccountIdBeneficiaries
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getAccountsAccountIdBeneficiariesTest() {
        val accountId: kotlin.String = TODO()
        val authorization: kotlin.String = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBReadBeneficiary5> = api.getAccountsAccountIdBeneficiaries(accountId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }

    /**
     * To test AccountsApiController.getAccountsAccountIdDirectDebits
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getAccountsAccountIdDirectDebitsTest() {
        val accountId: kotlin.String = TODO()
        val authorization: kotlin.String = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBReadDirectDebit2> = api.getAccountsAccountIdDirectDebits(accountId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }

    /**
     * To test AccountsApiController.getAccountsAccountIdOffers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getAccountsAccountIdOffersTest() {
        val accountId: kotlin.String = TODO()
        val authorization: kotlin.String = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBReadOffer1> = api.getAccountsAccountIdOffers(accountId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }

    /**
     * To test AccountsApiController.getAccountsAccountIdParties
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getAccountsAccountIdPartiesTest() {
        val accountId: kotlin.String = TODO()
        val authorization: kotlin.String = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBReadParty3> = api.getAccountsAccountIdParties(accountId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }

    /**
     * To test AccountsApiController.getAccountsAccountIdParty
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getAccountsAccountIdPartyTest() {
        val accountId: kotlin.String = TODO()
        val authorization: kotlin.String = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBReadParty2> = api.getAccountsAccountIdParty(accountId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }

    /**
     * To test AccountsApiController.getAccountsAccountIdProduct
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getAccountsAccountIdProductTest() {
        val accountId: kotlin.String = TODO()
        val authorization: kotlin.String = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBReadProduct2> = api.getAccountsAccountIdProduct(accountId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }

    /**
     * To test AccountsApiController.getAccountsAccountIdScheduledPayments
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getAccountsAccountIdScheduledPaymentsTest() {
        val accountId: kotlin.String = TODO()
        val authorization: kotlin.String = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBReadScheduledPayment3> = api.getAccountsAccountIdScheduledPayments(accountId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }

    /**
     * To test AccountsApiController.getAccountsAccountIdStandingOrders
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getAccountsAccountIdStandingOrdersTest() {
        val accountId: kotlin.String = TODO()
        val authorization: kotlin.String = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBReadStandingOrder6> = api.getAccountsAccountIdStandingOrders(accountId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }

    /**
     * To test AccountsApiController.getAccountsAccountIdStatements
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getAccountsAccountIdStatementsTest() {
        val accountId: kotlin.String = TODO()
        val authorization: kotlin.String = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val fromStatementDateTime: java.time.OffsetDateTime? = TODO()
        val toStatementDateTime: java.time.OffsetDateTime? = TODO()
        val response: ResponseEntity<OBReadStatement2> = api.getAccountsAccountIdStatements(accountId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent, fromStatementDateTime, toStatementDateTime)

        // TODO: test validations
    }

    /**
     * To test AccountsApiController.getAccountsAccountIdStatementsStatementId
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getAccountsAccountIdStatementsStatementIdTest() {
        val statementId: kotlin.String = TODO()
        val accountId: kotlin.String = TODO()
        val authorization: kotlin.String = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBReadStatement2> = api.getAccountsAccountIdStatementsStatementId(statementId, accountId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }

    /**
     * To test AccountsApiController.getAccountsAccountIdStatementsStatementIdFile
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getAccountsAccountIdStatementsStatementIdFileTest() {
        val statementId: kotlin.String = TODO()
        val accountId: kotlin.String = TODO()
        val authorization: kotlin.String = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<kotlin.Any> = api.getAccountsAccountIdStatementsStatementIdFile(statementId, accountId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }

    /**
     * To test AccountsApiController.getAccountsAccountIdStatementsStatementIdTransactions
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getAccountsAccountIdStatementsStatementIdTransactionsTest() {
        val statementId: kotlin.String = TODO()
        val accountId: kotlin.String = TODO()
        val authorization: kotlin.String = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val response: ResponseEntity<OBReadTransaction6> = api.getAccountsAccountIdStatementsStatementIdTransactions(statementId, accountId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent)

        // TODO: test validations
    }

    /**
     * To test AccountsApiController.getAccountsAccountIdTransactions
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getAccountsAccountIdTransactionsTest() {
        val accountId: kotlin.String = TODO()
        val authorization: kotlin.String = TODO()
        val xFapiAuthDate: kotlin.String? = TODO()
        val xFapiCustomerIpAddress: kotlin.String? = TODO()
        val xFapiInteractionId: kotlin.String? = TODO()
        val xCustomerUserAgent: kotlin.String? = TODO()
        val fromBookingDateTime: java.time.OffsetDateTime? = TODO()
        val toBookingDateTime: java.time.OffsetDateTime? = TODO()
        val response: ResponseEntity<OBReadTransaction6> = api.getAccountsAccountIdTransactions(accountId, authorization, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent, fromBookingDateTime, toBookingDateTime)

        // TODO: test validations
    }
}
