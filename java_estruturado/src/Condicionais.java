public class Condicionais {


    public static int somar(int a, int b){
        return a + b;
    }

    public static void somarSemRetorno(int a, int b){
        System.out.println( a + b );
    }


    public static void main(){

        boolean estaChovendo = true;

        if(estaChovendo) {
            System.out.println("Leve um guarda-chuva!");
        }

        int [] listaDeNumeros = new int[5];

        for(int i = 0; i < listaDeNumeros.length; i++){
            System.out.println(listaDeNumeros[i]);
        }

        var resultado = somar(7, 4);
        

        somarSemRetorno( 5 , 3);
        

        System.out.println(resultado);
    }

}