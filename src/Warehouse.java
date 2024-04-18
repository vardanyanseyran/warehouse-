import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private String name;
    private Map<MaterialType, Material> materials;

    public Warehouse(String name) {
        this.name = name;
        materials = new HashMap<>();
    }

    public void addMaterial(MaterialType type, int quantity) {
        Material existingMaterial = materials.get(type);
        if (existingMaterial != null) {
            existingMaterial.adjustQuantity(quantity);
        } else {
            materials.put(type, new Material(type, quantity));
        }
    }
    public boolean removeMaterial(MaterialType type, int quantity) {
        Material existingMaterial = materials.get(type);
        if (existingMaterial == null || existingMaterial.getQuantity() < quantity) {
            return false;
        }
        existingMaterial.adjustQuantity(-quantity);
        if (existingMaterial.getQuantity() == 0) {
            materials.remove(type);
        }
        return true;
    }
    public boolean transferMaterial(Warehouse destination, MaterialType type, int quantity) {
        if (removeMaterial(type, quantity)) {
            destination.addMaterial(type, quantity);
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Warehouse: ").append(name).append("\n");
        for (Material material : materials.values()) {
            sb.append(material.getType().getName()).append(": ").append(material.getQuantity()).append("\n");
        }
        return sb.toString();
    }
}
