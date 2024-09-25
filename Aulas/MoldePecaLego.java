package Aulas;
//Uma classe publica pode ser usada em qualuqer parte do código
//Regras para definir uma classe: publica é uma caracteristica, class indica que voce esta criando uma classe
// moldepecalego é o nome da classe

public class MoldePecaLego {
    public static void main(String[] args) {
        //apesar de ser public e poder ser chamado por outras classes, porem por ser estatica ela não ira chamar outra classe
        //void quer dizer que este metodo retorna nada, se voce chamalo ele devolve o equivalente a none em python
        //com isso criamos um molde para as peças de lego que iremos criar, perceba que temos caracteristicas como:
        //public, nome, statica, retorna void, é main...
        System.out.println("sou um molde para peças lego");

        
    }
 }
 
