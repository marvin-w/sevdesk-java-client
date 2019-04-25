/*
 * sevDesk
 * # Getting started  The sevDesk API v1 uses a token authentication.    You need to click on the authorization button (lock symbol) and enter your api-key there.    The token can be found on [https://my.sevdesk.de](https://my.sevdesk.de).    settings-->user-->specific user    # General information    The sevDesk api uses **models** to represent the different categories like **contacts** and **invoices**.    Every time you request such a model from the api, it will return the whole model schema including the unique **model id** and all the other objects and parameters that are included in the model.    Have a look at it in the developer console of your desired browser, especially if you are looking for specific parameters like the model id.    # URL    The basic URL contains four elements. **BaseURL** + **Controller** + **Version** + **Model**: [https://my.sevdesk.de/api/v1/Contact/](https://my.sevdesk.de/api/v1/Contact/)    # Basic Operations    Access a list of models: [https://my.sevdesk.de/api/v1/{Model}/](https://my.sevdesk.de/api/v1/{Model}/)    Access a specific model: [https://my.sevdesk.de/api/v1/{Model}/{id}](https://my.sevdesk.de/api/v1/{Model}/{id})    The **id** of a specific model can usually be found in the **developer console** of your browser or when opening a specific model, in the **url**.    Call a model function: [https://my.sevdesk.de/api/v1/{Model}/{id}/{Function}](https://my.sevdesk.de/api/v1/{Model}/{id}/{Function})    Each operation can be used with different HTTP methods:  * GET - read data  * POST - create data  * PUT - update existing data  * DELETE - delete data    # Useful Parameters    For each request, there are some specific parameters.    **GET Query Parameters**  * **limit** - limits the number of entries returned  * **offset** - set the index where the returned entries should start  * **embed** - embed can be used to get some additional information about a model. For example you can get the addresses of a contact with **embed=addresses**    `[GET]https://my.sevdesk.de/api/v1/Contact/?embed=addresses`    * If there is a need to get more information about the country in the addresses, embed can be extended by **addresses.country**    `[GET]https://my.sevdesk.de/api/v1/Contact/?embed=addresses,addresses.country`    * Some models also contain other models. By default these models are only filled with an id and objectName. If you want to get more information about the nested model you can use embed too.    `[GET]https://my.sevdesk.de/api/v1/Contact/?embed=parent`    * Every model also has specified 'query parameters'. These can be used to filter the results. E.g. all Contacts with a 'Company' in their name    `[GET]https://my.sevdesk.de/api/v1/Contact/?name=Company`    * **countAll** If countAll is set to 1 the total number of entries will be returned additionally  * **orderBy** Is an array that can be filled with objects containing the the properties field and arrangement    `json: orderBy = [{field:'parent' ,arrangement:'desc'},{field:'name' ,arrangement:'asc'}];`    `url: ?orderBy[0][field]=parent&orderBy[0][arrangement]=desc&orderBy[1][field]=name&orderBy[1][arrangement]=asc`
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package de.wichmann.sevdesk.api;

import de.wichmann.sevdesk.ApiException;
import de.wichmann.sevdesk.model.ModelCheckAccountTransaction;
import de.wichmann.sevdesk.model.ModelCheckAccountTransactionLog;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CheckAccountTransactionApi
 */
@Ignore
public class CheckAccountTransactionApiTest {

    private final CheckAccountTransactionApi api = new CheckAccountTransactionApi();

    /**
     * Create a new check account transaction
     *
     * Calls CheckAccountTransaction.php 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addCheckAccountTransactionTest() throws ApiException {
        ModelCheckAccountTransaction response = api.addCheckAccountTransaction();

        // TODO: test validations
    }
    /**
     * Get log of a specified check account transaction
     *
     * Calls getLog() in CheckAccountTransaction.php to get the log of a specified check account transaction.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void checkAccountTransactionGetLogTest() throws ApiException {
        Integer id = null;
        List<String> embed = null;
        ModelCheckAccountTransactionLog response = api.checkAccountTransactionGetLog(id, embed);

        // TODO: test validations
    }
    /**
     * Get invoice amount which is not assigned yet
     *
     * Calls getRemainingAmount() in CheckAccountTransaction.php to get invoice amount which is not assigned yet.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void checkAccountTransactionGetRemainingAmountTest() throws ApiException {
        Integer id = null;
        api.checkAccountTransactionGetRemainingAmount(id);

        // TODO: test validations
    }
    /**
     * Delete an existing check account transaction
     *
     * Calls the delete() function in CheckAccountTransaction.php
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCheckAccountTransactionTest() throws ApiException {
        Integer id = null;
        api.deleteCheckAccountTransaction(id);

        // TODO: test validations
    }
    /**
     * Get an overview of all check account transactions
     *
     * Calls CheckAccountTransaction.php to get necessary variables.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCheckAccountTransactionsTest() throws ApiException {
        Integer limit = null;
        Integer offset = null;
        List<String> embed = null;
        ModelCheckAccountTransaction response = api.getCheckAccountTransactions(limit, offset, embed);

        // TODO: test validations
    }
    /**
     * link invoice to check account transaction
     *
     * Calls linkInvoice() in CheckAccountTransaction.php.      This will update the specified invoice as well as the status of the check account transaction!
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void linkInvoiceToCheckAccountTransactionTest() throws ApiException {
        Integer id = null;
        ModelCheckAccountTransaction response = api.linkInvoiceToCheckAccountTransaction(id);

        // TODO: test validations
    }
    /**
     * link voucher to check account transaction
     *
     * Calls linkVoucher() in CheckAccountTransaction.php.      This will update the specified voucher as well as the status of the check account transaction!
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void linkVoucherToCheckAccountTransactionTest() throws ApiException {
        Integer id = null;
        ModelCheckAccountTransaction response = api.linkVoucherToCheckAccountTransaction(id);

        // TODO: test validations
    }
    /**
     * Update a existing check account transaction
     *
     * Calls CheckAccountTransaction.php
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCheckAccountTransactionTest() throws ApiException {
        Integer id = null;
        ModelCheckAccountTransaction response = api.updateCheckAccountTransaction(id);

        // TODO: test validations
    }
    /**
     * Update status of a existing check account transaction
     *
     * Calls changeStatus() in CheckAccountTransaction.php
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCheckAccountTransactionStatusTest() throws ApiException {
        Integer id = null;
        ModelCheckAccountTransaction response = api.updateCheckAccountTransactionStatus(id);

        // TODO: test validations
    }
}