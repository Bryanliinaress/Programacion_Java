public class GAtoSimple {
    String color, raza , sexo;
    int edad;
    double peso;
    GAtoSimple (String s){
        this.sexo=s;
    }

    String getSexo(){
        return this.sexo;
    }

    void maulla(){
        System.out.println("Miauuuu");
    }

    void ronroneo(){
        System.out.println("mrrrrr");
    }
    
    void come(String comida){
        if (comida.equals("pescado")) {
            System.out.println("Hmmmm, gracias");
        }else{
            System.out.println("Lo siento, yo solo como pescado.");
        }
    }

    void peleaCon (GAtoSimple contrincante){
        if (this.sexo.equals("hembra")) {
            System.out.println("no me gusta pelear");

        }else{
            if (contrincante.getSexo().equals("hembra")) {
                System.out.println("no peleo contra gatitas");
            }else{
                System.out.println("ven aqui que te vas a enterar");
            }
        }
    }
}
