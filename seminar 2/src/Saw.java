public class Saw extends Tool implements Cut {
    public  Saw(String name, int weight){
        super(name, weight);
    }

    public boolean canCut(){
        return true;
    }

    @Override
    public void cut() {
        System.out.println("cuting.......");
    }
}
