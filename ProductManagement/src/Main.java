import entity.Product;
import handle.ProductHandle;
import view.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductHandle productHandle = new ProductHandle();
        Menu menu = new Menu();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời b nhập số lượng sản phẩm muốn tạo ra: ");
        int n = Integer.parseInt(scanner.nextLine());
        Product[] products = productHandle.createManyProducts(scanner, n);
        //Display all products
        productHandle.displayAllProducts(products);
        // select by price
        productHandle.filterByPrice(products,menu.menuSelectByPrice(scanner));

        // sort by price
        productHandle.sortByPrice(products);
    }
}
