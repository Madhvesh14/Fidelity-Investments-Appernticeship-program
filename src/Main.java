//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Category cat = new Category();
        cat.productID=111;
        cat.productName="Laptop";
        cat.productPrice=90000;
        cat.CategoryID=1;
        cat.CategoryName="Electronics";

        cat.Display();

        Brand brand = new Brand();
        brand.productID=111;
        brand.productName="Laptop";
        brand.productPrice=90000;
        brand.CategoryID=1;
        brand.CategoryName="Electronics";
        brand.BrandName="HP";

        brand.Display();



    }
}