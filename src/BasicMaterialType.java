public class BasicMaterialType implements MaterialType {
    private final String name;
    private final String description;
    private final String icon;
    private final int maxCapacity;

    public BasicMaterialType(String name, String description, String icon, int maxCapacity) {
        this.name = name;
        this.description = description;
        this.icon = icon;
        this.maxCapacity = maxCapacity;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getIcon() {
        return icon;
    }

    @Override
    public int getMaxCapacity() {
        return maxCapacity;
    }
}
