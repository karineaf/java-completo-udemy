package heranca.polimorfismo.exercicio1.entities;

public class ImportedProduct extends Product {
    private Double customsFee;

    public ImportedProduct(){
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag(){
        return super.priceTag() +
                " (Customs fee: $ " + String.format("%.2f", customsFee) + ")";
    }

    public Double totalPrice(){
        return price += customsFee;
    }
}
