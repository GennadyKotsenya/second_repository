package itmanStudy;

/*
Есть товар (уникальный номер, название) и магазин.
Каждый магазин имеет название и массив цен товаров (уникальный номер товара, цена).

Необходимо написать функцию, которая принимает массив товаров и массив магазинов.
Функция должна возвращать для каждого товара, лучшую цену и соответствующий магазин.
Товары должны идти в том же порядке, что и в исходном массиве товаров.

Гарантируется, что:

каждый товар будет присутствовать хотя бы в одном магазине будет.
в магазине присутствуют только повторяющиеся товары
 */

public class BestItemPrice {
    public static void main(String[] args) {

        Price[] price1 ={new Price(1,1000)}; 
        Price[] price2 ={new Price(2,100)}; 
        Price[] price3 ={new Price(2,99), new Price(1, 1001)}; 
        
        Item[] items ={new Item(1, "Notebook"), new Item(2, "Phone")} ;
        Shop[] shops= {new Shop("First shop", price1 ), new Shop("Second shop", price2), new Shop("Third shop", price3)};

        ItemWithBestPrice[] r =  findBestPrices(items, shops);


        for (int i = 0; i < r.length;i++){
            System.out.println(r[i].shopName + " : " + r[i].item + " - " + r[i].bestPrice);
        }
    }

    public static class Item{

        public int id;
        public String name;

        public Item(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    public static class Shop{

        public String name;
        public Price[] prices;

        public Shop(String name, Price[] prices) {
            this.name = name;
            this.prices = prices;
        }
    }

    public static class Price{

        public int itemId;
        public int price;

        public Price(int itemId, int price) {
            this.itemId = itemId;
            this.price = price;
        }
    }

    public static class ItemWithBestPrice{

        public Item item;
        public String shopName;
        public int bestPrice;


    }

    public static ItemWithBestPrice[] findBestPrices(Item[] items, Shop[] shops){

        ItemWithBestPrice[] itemWithBestPrice = new ItemWithBestPrice[items.length];

        for (int i = 0; i < items.length; i++){
            itemWithBestPrice[i] =  new ItemWithBestPrice();
        }

        for(int i = 0; i < items.length; i++){

            itemWithBestPrice[i].item = items[0];
            itemWithBestPrice[i].shopName = shops[0].name;
            itemWithBestPrice[i].bestPrice = Integer.MAX_VALUE;

            for( int j = 0; j < shops.length; j++){

                for(int k = 0; k < shops[j].prices.length; k++){

                    if(shops[j].prices[k].itemId == items[i].id && shops[j].prices[k].price < itemWithBestPrice[i].bestPrice){

                        itemWithBestPrice[i].bestPrice = shops[j].prices[k].price;
                        itemWithBestPrice[i].shopName = shops[j].name;
                        itemWithBestPrice[i].item = items[i];
                    }

                }

            }
        }

        return itemWithBestPrice;
    }

}
