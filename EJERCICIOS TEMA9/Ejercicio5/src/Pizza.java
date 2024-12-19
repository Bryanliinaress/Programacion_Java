public class Pizza {
    private static int contadorPizzas=0;
    private static int pizzasEntragadas=0;
    
    private String tipo;
    private String tamaño;
    private String estado;

    public Pizza(String tipo, String tamaño){
        this.tamaño=tamaño;
        this.tipo = tipo;
        this.estado="pedida";
        Pizza.contadorPizzas ++;
    }

    public String toString(){
        return "pizza "+ this.tipo+" "+ this.tamaño+", "+this.estado;
    }

    public static int getTotalPizzas(){
        return contadorPizzas;
    }

    public static int getTotalEntregadas(){
        return pizzasEntragadas;
    }

    public void sirve(){
        if (this.estado.equals("pedida")) {
            this.estado="entregada";
            Pizza.pizzasEntragadas ++;
        }else
        System.out.println("Esta pizza ya a sido entregada, lo siento");
    }
}
