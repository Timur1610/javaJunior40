package lesson13;

import java.util.HashMap;
import java.util.Map;

public class Fridge {
    private HashMap<String, Integer> products = new HashMap<>();
    private int capacity = 500;

    public void addProducts(String product, int weight){
        if (products.containsKey(product)){
            products.put(product, weight + products.get(product));
        }else {
            products.put(product, weight);
        }
    }

    public void printAllProduct(){
        for (Map.Entry<String, Integer> product : products.entrySet()){
            System.out.println(product.getKey() + " - " + product.getValue());
        }
    }

    public void getProducts(String product, int weight){
        if (!products.containsKey(product)){
            System.out.println("Такого продукта нет в холодильнике");
        }
        if (products.get(product) < weight){
            System.out.println("Недостаточно продукта в холодильнике");
            products.remove(product);
            return;
        }
        if (products.get(product) == weight){
            products.remove(product);
            return;
        }
        products.put(product, products.get(product) - weight); //перезатерли по этому продукту ТО что БЫЛО минус ТО что ХОТЯТ ЗАПРОСИТЬ
    }

    public void men(String product, int weight){
        if (weight < 2){
            System.out.println("Продукт скоро закончится");
        }
    }

    public void bol(String product, int weight){;
        int prod = 1;
        if (products.get(product) < prod){
            prod = products.get(product);
        }
    }
}
