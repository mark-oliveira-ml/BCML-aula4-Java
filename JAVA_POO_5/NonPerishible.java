public class NonPerishible extends Product
{
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public NonPerishible (String name, double price, int quantidadeOfProdutos, String type) 
    {
        super(name, price, quantidadeOfProdutos);
        this.type = type;
    }

    
    



}
