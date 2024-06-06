public class CalculadoraIMC {


public static void main (String[] args) {

    double alturaCentimetro;
    double peso;

    alturaCentimetro = 1.75;
    peso = 85.0;

    double totalPeso = alturaCentimetro*alturaCentimetro;
    double total = peso/totalPeso;

    
    if (total <= 15.9) {
    System.out.println("Seu IMC é: "+ total+" apresenta magreza grau III.");
    }
    else if  (total <= 16.9){
        System.out.println("Seu IMC é: "+ total +" apresenta magreza grau II.");
    }
    else if (total <= 18.4){
        System.out.println("Seu IMC é: "+ total +" apresenta magreza grau I.");
    }
    else if (total <= 24.9){
        System.out.println("Seu IMC é: "+ total +" peso ideal!.");
    }
    else if (total <= 29.9){
        System.out.println("Seu IMC é: "+ total +" apresenta sobrepeso.");
    }
    else if (total <= 34.9){
        System.out.println("Seu IMC é: "+ total +" apresenta obesidade grau I.");
    }
    else if (total <= 39.9){
        System.out.println("Seu IMC é: "+ total +" apresenta obesidade grau II ou severa.");
    }
    else if (total >= 40){
        System.out.println("Seu IMC é: "+ total +" apresenta obesidade grau III ou mórbida.");
    }
}
}

//Meu primeiro projeto solo em JAVA, após ler e estudar um livro sobre a linguagem nas primeiras lições 
//tinha como sugestão fazer essa calculadora; não copiei código de nenhum lugar, apenas coloquei em pratica
//o que ue tinha aprendido.