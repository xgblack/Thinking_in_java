package e19_7.menu;

/**
 * @author 小光
 * @date 2019/10/9 20:25
 * Copyright(C),2018-2019,https://blog.xgblack.cn
 * interfaceName: Food
 * description:
 */
public interface Food {
    enum Appetizer implements Food {
        SALAD,SOUP,SPRING_ROLLS;
    }

    enum MainCourse implements Food {
        LASAGNE,BURRITO,PAD_THAI,
        LENTILS,HUMMOUS,VINDALOO;
    }
    enum Dessert implements Food {
        TIRAMISU, GELATO, BLACK_FOREST_CAKE,
        FRUIT, CREME_CARAMEL;
    }
    enum Coffee implements Food {
        BLACK_COFFEE, DECAF_COFFEE, ESPRESSO,
        LATTE, CAPPUCCINO, TEA, HERB_TEA;
    }
}
