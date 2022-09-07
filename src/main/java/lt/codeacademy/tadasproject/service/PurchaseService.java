package lt.codeacademy.tadasproject.service;

import lt.codeacademy.tadasproject.model.Purchase;
import lt.codeacademy.tadasproject.repository.projection.PurchaseItem;

import java.util.List;

public interface PurchaseService {
    Purchase savePurchase(Purchase purchase);

    List<PurchaseItem> findPurchaseItemsOfUser(Long userId);
}
