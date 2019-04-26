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

import java.io.File;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReportApi
 */
@Ignore
public class ReportApiTest {

    private final ReportApi api = new ReportApi();

    /**
     * Export the contact
     *
     * Calls contact() in Report.php to export the contact.    With **sevQuery[filter][yourFilter]**, you can filter the entries you want to export. For this, just switch &#x27;yourFilter&#x27; with some parameter the involved model would normally take.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reportContactTest() {
        Boolean download = null;
        Integer contactId = null;
        String contactObjectName = null;
        File response = api.reportContact(download, contactId, contactObjectName);

        // TODO: test validations
    }
    /**
     * Export the contact list
     *
     * Calls contactlist() in Report.php to export the contact list.    With **sevQuery[filter][yourFilter]**, you can filter the entries you want to export. For this, just switch &#x27;yourFilter&#x27; with some parameter the involved model would normally take.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reportContactListTest() {
        String sevQueryModelName = null;
        String sevQueryObjectName = null;
        Boolean download = null;
        Integer sevQueryLimit = null;
        Integer sevQueryOffset = null;
        File response = api.reportContactList(sevQueryModelName, sevQueryObjectName, download, sevQueryLimit, sevQueryOffset);

        // TODO: test validations
    }
    /**
     * Export the inventory
     *
     * Calls inventory() in Report.php to export the inventory.    With **sevQuery[filter][yourFilter]**, you can filter the entries you want to export. For this, just switch &#x27;yourFilter&#x27; with some parameter the involved model would normally take.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reportInventoryTest() {
        String sevQueryModelName = null;
        String sevQueryObjectName = null;
        Boolean download = null;
        Integer sevQueryLimit = null;
        Integer sevQueryOffset = null;
        File response = api.reportInventory(sevQueryModelName, sevQueryObjectName, download, sevQueryLimit, sevQueryOffset);

        // TODO: test validations
    }
    /**
     * Export the invoicelist
     *
     * Calls invoicelist() in Report.php to export the invoices.    With **sevQuery[filter][yourFilter]**, you can filter the entries you want to export. For this, just switch &#x27;yourFilter&#x27; with some parameter the involved model would normally take.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reportInvoiceListTest() {
        String sevQueryModelName = null;
        String sevQueryObjectName = null;
        Boolean download = null;
        Integer sevQueryLimit = null;
        Integer sevQueryOffset = null;
        File response = api.reportInvoiceList(sevQueryModelName, sevQueryObjectName, download, sevQueryLimit, sevQueryOffset);

        // TODO: test validations
    }
    /**
     * Export the order list
     *
     * Calls orderlist() in Report.php to export the orders.    With **sevQuery[filter][yourFilter]**, you can filter the entries you want to export. For this, just switch &#x27;yourFilter&#x27; with some parameter the involved model would normally take.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reportOrderListTest() {
        String sevQueryModelName = null;
        String sevQueryObjectName = null;
        Boolean download = null;
        Integer sevQueryLimit = null;
        Integer sevQueryOffset = null;
        File response = api.reportOrderList(sevQueryModelName, sevQueryObjectName, download, sevQueryLimit, sevQueryOffset);

        // TODO: test validations
    }
    /**
     * Export the profit and loss
     *
     * Calls profitAndLoss() in Report.php to export the profit and loss.    With **sevQuery[filter][yourFilter]**, you can filter the entries you want to export. For this, just switch &#x27;yourFilter&#x27; with some parameter the involved model would normally take.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reportProfitAndLossTest() {
        String startDate = null;
        String endDate = null;
        Boolean taxRule = null;
        Boolean download = null;
        File response = api.reportProfitAndLoss(startDate, endDate, taxRule, download);

        // TODO: test validations
    }
    /**
     * Export the register book / cash report
     *
     * Calls registerBook() in Report.php to export the register book / cash report.    With **sevQuery[filter][yourFilter]**, you can filter the entries you want to export. For this, just switch &#x27;yourFilter&#x27; with some parameter the involved model would normally take.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reportRegisterBookTest() {
        Integer checkAccountId = null;
        String checkAccountObjectName = null;
        String startDate = null;
        String endDate = null;
        Boolean download = null;
        File response = api.reportRegisterBook(checkAccountId, checkAccountObjectName, startDate, endDate, download);

        // TODO: test validations
    }
    /**
     * Export the voucher list
     *
     * Calls voucherlist() in Report.php to export the vouchers.    With **sevQuery[filter][yourFilter]**, you can filter the entries you want to export. For this, just switch &#x27;yourFilter&#x27; with some parameter the involved model would normally take.    **Currently there is a problem with swagger understanding return type &#x27;file&#x27;, so the api will respond accordingly but swagger ui can not display it correctly.**
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reportVoucherListTest() {
        String sevQueryFilterStartDate = null;
        String sevQueryModelName = null;
        String sevQueryObjectName = null;
        Boolean download = null;
        Integer sevQueryLimit = null;
        Integer sevQueryOffset = null;
        File response = api.reportVoucherList(sevQueryFilterStartDate, sevQueryModelName, sevQueryObjectName, download, sevQueryLimit, sevQueryOffset);

        // TODO: test validations
    }
}
