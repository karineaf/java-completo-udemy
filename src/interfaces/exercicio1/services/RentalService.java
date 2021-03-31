package interfaces.exercicio1.services;

import interfaces.exercicio1.entities.CarRental;
import interfaces.exercicio1.entities.Invoice;

public class RentalService {

    private Double pricePerHour;
    private Double pricePerDay;

    private TaxService taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental){
        long instante1 = carRental.getStart().getTime();
        long instante2 = carRental.getFinish().getTime();
        double basicPayment;
        double hours = (double) (instante2 - instante1) / 1000 / 60 / 60;

        if(hours <= 12)
            basicPayment =  Math.ceil(hours) * pricePerHour;
        else
            basicPayment = Math.ceil(hours/24) * pricePerDay;

        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
