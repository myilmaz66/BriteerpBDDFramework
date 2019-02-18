package com.briteerp.utilities;

import com.briteerp.pages.OdooFirstPage;
import com.briteerp.pages.*;
public class Pages {

    private OdooFirstPage odooFirstPage;
    private LoginPage loginPage;
    private DiscussModulePage discussModulePage;
    private PricelistsPage pricelistsPage;
    private OrdersPage orderspage;
    private PricelistEditCreatePage pricelistEditCreatePage;
    private CreatePricelistItemsPage createPricelistItemsPage;
    private PricelistSaveDiscardPage pricelistSaveDiscardPage;
    private CountryGroupsPage countryGroupsPage;
    private PointOfSaleModulePage pointOfSaleModulePage;
    private ProductsPage productsPage;
    private ProductsSaveDiscardPage productsSaveDiscardPage;
    private ProductsEditCreatePage productsEditCreatePage;
    private ListViewPage listViewPage;
    private PoSCategoriesPage posCategoriesPage;
    private PointOfSale pointOfSale;
    private ProductPage productPage;
    private Orders2Page orders2page;
    private OrderlistsPage orderlistpage;
    private WholeFoodsStorePage wholeFoodsStorePage;

    public Orders2Page orders2Page() {
        if (orders2page == null) {
            orders2page = new Orders2Page();
        }
        return orders2page;

    }

    public  OrderlistsPage orderListPage(){
        if (orderlistpage == null){
            orderlistpage = new OrderlistsPage();
        }
        return  orderlistpage;
    }

    public ProductPage productPage() {
        if (productPage == null) {
            productPage = new ProductPage();

        }
        return productPage;
    }


    public PointOfSale pointOfSale() {
        if (pointOfSale == null) {
            pointOfSale = new PointOfSale();
        }
        return pointOfSale;
    }

    public PoSCategoriesPage poSCategoriesPage(){
        if (posCategoriesPage == null) {
            posCategoriesPage = new PoSCategoriesPage();
        }
        return posCategoriesPage;
    }


    public ListViewPage listViewPage() {
        if (listViewPage == null) {
            listViewPage = new ListViewPage();
        }
        return listViewPage;
    }

    public ProductsEditCreatePage productsEditCreatePage() {
        if (productsEditCreatePage == null) {
            productsEditCreatePage = new ProductsEditCreatePage();
        }
        return productsEditCreatePage;
    }

    public ProductsSaveDiscardPage productsSaveDiscardPage() {
        if (productsSaveDiscardPage == null) {
            productsSaveDiscardPage = new ProductsSaveDiscardPage();
        }
        return productsSaveDiscardPage;
    }
    public ProductsPage productsPage() {
        if (productsPage == null) {
            productsPage = new ProductsPage();
        }
        return productsPage;
    }

    public PointOfSaleModulePage pointOfSaleModulePage() {
        if (pointOfSaleModulePage == null) {
            pointOfSaleModulePage = new PointOfSaleModulePage();
        }
        return pointOfSaleModulePage;
    }

    public CountryGroupsPage countryGroupsPage() {
        if (countryGroupsPage == null) {
            countryGroupsPage = new CountryGroupsPage();
        }
        return countryGroupsPage;
    }

    public OdooFirstPage odoo() {
        if (odooFirstPage == null) {
            odooFirstPage = new OdooFirstPage();
        }
        return odooFirstPage;
    }

    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }


    public DiscussModulePage discussModulePage() {
        if (discussModulePage == null) {
            discussModulePage = new DiscussModulePage();
        }
        return discussModulePage;
    }

    public PricelistsPage pricelists() {
        if (pricelistsPage == null) {
            pricelistsPage = new PricelistsPage();
        }
        return pricelistsPage;
    }


    public OrdersPage orders() {
        if (orderspage == null) {
            orderspage = new OrdersPage();
        }
        return orderspage;
    }

    public PricelistEditCreatePage pricelistEditCreate() {
        if (pricelistEditCreatePage == null) {
            pricelistEditCreatePage = new PricelistEditCreatePage();
        }
        return pricelistEditCreatePage;
    }

    public CreatePricelistItemsPage createPricelistItems() {
        if (createPricelistItemsPage == null) {
            createPricelistItemsPage = new CreatePricelistItemsPage();
        }
        return createPricelistItemsPage;
    }


    public PricelistSaveDiscardPage pricelistSaveDiscardPage() {
        if (pricelistSaveDiscardPage == null) {
            pricelistSaveDiscardPage = new PricelistSaveDiscardPage();
        }
        return pricelistSaveDiscardPage;
    }

    public WholeFoodsStorePage wholeFoodsStorePage() {
        if (wholeFoodsStorePage == null) {
            wholeFoodsStorePage = new WholeFoodsStorePage();
        }
        return wholeFoodsStorePage;

    }
}
