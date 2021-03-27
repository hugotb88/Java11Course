package examPart2;

public class Calculator {

        Integer numberA;
        Integer numberB;

        //Constructor
        public Calculator (Integer assignedNumberA, Integer assignedNumberB){
            this.numberA = assignedNumberA;
            this.numberB = assignedNumberB;
        }

        public Calculator (){
            this.numberA = 0;
            this.numberB = 0;
        }

        //Retornos de los valores

        public void setNumberA (Integer assignedNumberA) {
            this.numberA = assignedNumberA;
        }

        public Integer getNumberA () { return this.numberA; }

        public void setNumberB (Integer assignedNumberB) {
            this.numberB = assignedNumberB;
        }

        public Integer getNumberB () { return this.numberB; }



    public static void main(String[] args) {

        Calculator addition = new Calculator(1,5);
        int suma = addition.numberA + addition.numberB;

        System.out.println(suma);





    }


        //9) Crea otro package y dentro una clase llamada "Calculator" con los siguientes atributos
        //- numberA (Integer)
        //        - numberB (Integer)

        //Crea un Constructor que pida ambos parametros para crear una instancia
        //Crea un Constructor vacio en el que los valores default sean 0 para ambos atributos.
        //        Crea un metodo llamado "addition" que reciba un parametro y realice la suma del parametro recibido mas los dos de la clase,
        //        que no retorne ningun valor pero que imprima el resultado

    }

