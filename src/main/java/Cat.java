public class Cat extends Animal{
    private String color = "black";
    public Cat(String name, int age) {
        super(name, age);
    }

    public void sayColor() {
        System.out.println(color);
    }
}
