
/**
 * Representa la clase Car (coche) en donde tenemos unos atributos como
 * make (marca del coche),model (modelo del coche), year (año del coche)
 * y price (precio del coche).
 * 
 * @author Bryan Linares González
 * @version 1.0
 */
public class Car {
    private String make;
    private String model;
    private int year;
    private double price;

    /**
     * Aqui tenemos el constructor para crear un nuevo objeto coche, donde
     * especificamos su make, model, year y price.
     *
     * @param make  la marca del coche
     * @param model el modelo del coche
     * @param year  el año de creación
     * @param price el precio del coche
     */
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    /**
     * Devuelve la marca del coche.
     *
     * @return la marca del coche.
     */
    public String getMake() {
        return make;
    }

    /**
     * Le da valor a la marca del coche.
     *
     * @param make la nueva marca del coche.
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * Devuelve el modelo del coche.
     *
     * @return el modelo del coche
     */
    public String getModel() {
        return model;
    }

    /**
     * Le da valor al modelo del coche.
     *
     * @param model el nuevo modelo del coche
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Devuelve el año de creación del coche.
     *
     * @return el año de creación del coche
     */
    public int getYear() {
        return year;
    }

    /**
     * Le da valor al año de creación del coche.
     *
     * @param year el nuevo año de creación del coche
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Devuelve el precio del coche.
     *
     * @return el precio del coche
     */
    public double getPrice() {
        return price;
    }

    /**
     * Le da valor al precio del coche.
     *
     * @param price el nuevo precio del coche
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Devuelve una descripcioón del coche.
     *
     * @return una descripcion general del coche
     */
    public String carDescription() {
        return "The car is a " + year + " " + make + " " + model + " priced at $" + price;
    }

    /**
     * Devuelve la descripción del coche.(que en lo personal lo fuera hecho en la
     * "fucion de antes ")
     *
     * @return una descripcon del coche
     */
    @Override
    public String toString() {
        return carDescription();
    }

    /**
     * El metodo main para representar el objeto coche.
     *
     * @param args lineas de argumento
     */
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2025, 26800);
        System.out.println(car);
    }
}
