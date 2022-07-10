package web.utils;

import java.util.List;
import java.util.stream.Collectors;

public class ListUtils {

    public static List<Double> convertStringPricesToDouble(List<String> stringPrices) {
        return stringPrices
                .stream()
                .map(price -> price.replace("от", ""))
                .map(price -> price.replace("р.", ""))
                .map(price -> price.replace(",", "."))
                .map(String::strip)
                .map(Double::parseDouble)
                .collect(Collectors.toList());
    }
}
