package heranca.polimorfismo.exercicio2.entities;

public class Individual extends TaxPayer{

    private static final Double TAXA_IMPOSTO_15 = 0.15;
    private static final Double TAXA_IMPOSTO_25 = 0.25;

    private Double healthExpenditures;

    public Individual(){
        super();
    }

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        if(anualIncome < 20000.00)
            if (healthExpenditures > 0)
                return anualIncome * TAXA_IMPOSTO_15 - healthExpenditures * 0.5;
            else
                return anualIncome * TAXA_IMPOSTO_15;
        else
            if (healthExpenditures > 0)
                return anualIncome * TAXA_IMPOSTO_25 - healthExpenditures * 0.5;
            else
                return anualIncome * TAXA_IMPOSTO_15;

    }
}
