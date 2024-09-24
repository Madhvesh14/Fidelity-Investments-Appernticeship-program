public class Brand extends Category{
    String BrandName;

    @Override
    public void Display() {
        System.out.println("Brand: " + BrandName);
        super.Display();
    }
}
