package element;

import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

import static element.HomePageElements.*;
import static element.CategoryPageElements.*;
import static element.ChildCategoryPageElements.*;
import static element.LoginPageElements.*;
import static element.AccountPageElements.*;

public class ElementMap {

    public static HashMap<String, By> elementsMap() {
        HashMap<String, By> elementsMap = new HashMap<String, By>();
        elementsMap.put("startShoppingStoreBy", startShoppingStoreBy);
        elementsMap.put("relLayMarketBy", relLayMarketBy);
        elementsMap.put("categoriesBy", categoriesBy);
        elementsMap.put("recyclerCategoriesBy", recyclerCategoriesBy);
        elementsMap.put("womanBy", womanBy);
        elementsMap.put("PantolonBy", PantolonBy);
        elementsMap.put("lastProductBy", lastProductBy);
        elementsMap.put("btnLoginBy", btnLoginBy);
        elementsMap.put("ivBackBy", ivBackBy);
        elementsMap.put("recyclerViewBy", recyclerViewBy);
        elementsMap.put("accountBy", accountBy);
        elementsMap.put("cartBy", cartBy);

        return elementsMap;
    }


}