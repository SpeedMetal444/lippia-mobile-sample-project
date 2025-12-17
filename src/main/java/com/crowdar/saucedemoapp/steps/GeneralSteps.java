package com.crowdar.saucedemoapp.steps;

import com.crowdar.saucedemoapp.services.*;
import io.cucumber.java.en.Given;

public class GeneralSteps {
    @Given("The user makes a {string} order and continues shopping")
    public void theUserContinuesShopping(String product) {
        HomeService.scrollToProduct(product);
        HomeService.clickProduct(product);
        ProductViewService.isProductViewVisible();
        ProductViewService.clickAddToCart();
        ProductViewService.clickCart();
        CartViewService.isCartViewLoaded();
        CartViewService.clickProceedToCheckout();
        LoginService.isLoginVisible();
        LoginService.fillFormDefault();
        LoginService.clickLogin();
        ShippingService.isShippingVisible();
        ShippingService.fillFormDefault();
        ShippingService.clickToPayment();
        PaymentService.isPaymentVisible();
        PaymentService.fillFormDefault();
        PaymentService.clickReviewOrder();
        ReviewOrderService.isReviewVisible();
        ReviewOrderService.clickPlaceOrder();
        FinishedOrderService.isFinishedOrderVisible();
        FinishedOrderService.clickContinueShopping();
    }
}
