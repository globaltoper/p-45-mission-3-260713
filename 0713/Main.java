public class Main {
    public static void main(String[] args) {

        Product apple = new Product();
        apple.name = "사과";
        apple.price = 1000;
        apple.stock = 5;

        Product banana = new Product();
        banana.name = "바나나";
        banana.price = 500;
        banana.stock = 3;

        apple.sell(3);
        apple.sell(3);
        apple.restock(10);
        banana.sell(1);

        System.out.println(apple.name + " 재고 총 가치: " + apple.stockValue() + "원");
        System.out.println(banana.name + " 재고 총 가치: " + banana.stockValue() + "원");
    }
}
