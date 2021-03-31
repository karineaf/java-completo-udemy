package introducao.programacao.orientada.objetos.exercicio3.entities;

import javax.print.DocFlavor;

public class Student {

    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double finalGrade(){
        return grade1 + grade2 + grade3;
    }

    public String result() {
        String result;
        if(finalGrade() >= 60)
            result = "PASS";
        else {
            result ="FAILED" + "\n" +
            String.format("MISSING %.2f POINTS", missingPoints());
        }
        return result;
    }

    public double missingPoints(){
        return 60 - finalGrade();
    }

}
