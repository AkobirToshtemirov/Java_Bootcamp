package OOP;

public class Hat extends ClothingItem {
    @Override  // Overriding from SuperClass Method below must have same type and same return type with the method in SuperClass
    public String getType() {
        return "Hat";
    }
}
