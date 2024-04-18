public class Main {
    public static void main(String[] args) {
        MaterialType wood = new BasicMaterialType("Wood", "A versatile material used in construction", "wood_icon.png", 100);
        MaterialType metal = new BasicMaterialType("Metal", "A durable material used in manufacturing", "metal_icon.png", 50);


        Warehouse warehouse1 = new Warehouse("Warehouse 1");
        Warehouse warehouse2 = new Warehouse("Warehouse 2");

        warehouse1.addMaterial(wood, 50);
        warehouse1.addMaterial(metal, 30);

        warehouse1.transferMaterial(warehouse2, wood, 20);

        System.out.println("Contents of Warehouse 1:");
        System.out.println(warehouse1);

        System.out.println("Contents of Warehouse 2:");
        System.out.println(warehouse2);
    }
}
