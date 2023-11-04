public class Product {
    private String name;
    private boolean vegan;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setVegan(boolean vegan){
        this.vegan=vegan;
    }
    public boolean getVegan(){
        return this.vegan;
    }
    public String toString(){
        return "Nazwa produktu: " + getName() + "\nCzy jest vegański: " + ((getVegan()) ? "Tak" : "Nie");
    }
}
