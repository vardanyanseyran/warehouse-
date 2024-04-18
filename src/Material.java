public class Material {
    private MaterialType type;
    private int quantity;

    public Material(MaterialType type, int quantity) {
        this.type = type;
        this.quantity = quantity;
    }

    public MaterialType getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }
    public void adjustQuantity(int quantityChange) {
        quantity = Math.max(0, Math.min(quantity + quantityChange, type.getMaxCapacity()));
    }
}
