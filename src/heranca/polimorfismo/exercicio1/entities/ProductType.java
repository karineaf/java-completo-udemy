package heranca.polimorfismo.exercicio1.entities;

public enum ProductType {
    COMMON("c"),
    USED("u"),
    IMPORTED("i");

    public String idEnum;
    ProductType(String idEnum){
        this.idEnum = idEnum;
    }

    public static ProductType getByIdEnum(String idEnum){
        if (idEnum == null)
            return null;
        for (ProductType e : ProductType.values()){
            if (e.idEnum.equals(idEnum))
                return e;
        }
        return null;
    }
}
