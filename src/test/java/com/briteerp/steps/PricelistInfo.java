package com.briteerp.steps;

import com.briteerp.pages.PricelistEditCreatePage;
import com.briteerp.utilities.Pages;

public interface PricelistInfo {
       Pages pages = new Pages();
    String pricelistName = pages.pricelistEditCreate().pricelistName.getText();
    String eCommercePromotionalCode = pages.pricelistEditCreate().eCommercePromotionalCodeBox.getText();
    String allowToUseOn = pages.pricelistEditCreate().selectedAllowToUseOn.getText();
    String itemsCount = pages.pricelistEditCreate().pricelistItems.size() + "";
}
