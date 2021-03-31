package heranca.polimorfismo.exercicio2.entities;

import java.util.Objects;

public class Company extends TaxPayer{

    private static final Double TAXA_IMPOSTO_14 = 0.14;
    private static final Double TAXA_IMPOSTO_16 = 0.16;

    private Integer numberOfEmployees;

    public Company(){
        super();
    }

    public Company(String name, Double anualIncome, Integer numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        if (numberOfEmployees > 10)
            return anualIncome * TAXA_IMPOSTO_14;
        else
            return anualIncome * TAXA_IMPOSTO_16;
    }


}
