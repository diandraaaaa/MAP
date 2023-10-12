public class Tool {
    private String name;
    private int weight;

    @Override
    public String toString() {
        return "Tool{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public Tool(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public boolean canCut(){
        return false;
    }
}
