public class Paciente {
    String nome;
    double altura;
    double peso;
    double imc;

    public Paciente(){

    }
    public Paciente(String nome,double altura,double peso ){
        this.nome=nome;
        this.altura=altura;
        this.peso=peso;

    }
    public double indiceMassaCorporal(){
         imc = peso/(altura*altura);
        return imc;
    }

    public String diagnostico(){
        String result = "";
        if (imc<18.5){
            result = "baixo peso muito grave!";
        } else if (imc>18.5 && imc<=24.9) {
            result="peso normal!";
        } else if (imc>=25.0 && imc<=29.9) {
            result="sobrepeso!";
        } else if (imc>=30.0 && imc<=34.9) {
            result="obesidade grau um!";
        } else if (imc>=35.0 && imc<=39.9) {
            result="obesidade grau dois!";
        } else if (imc>=40) {
            result="obesidade grau três!";
        }
        return result;
    }

}
