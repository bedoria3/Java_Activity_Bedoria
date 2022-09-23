public class Pet implements Dog {

    private String name;
    private String symbolize;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name; 
    }

    public void String getSymbolize(){
        return symbolize;
    }
    public void setSymbolize(String symbolize){
        this.symbolize = symbolize;
    }

    public Pet(String name){
        this.name = name;
    }
}
