public class Category extends Product
{
    int CategoryID;
    String CategoryName;

    @Override
    public void Display() {
        System.out.println("Category ID: " + CategoryID +"\n Category Name: " + CategoryName);
        super.Display();
    }
}
