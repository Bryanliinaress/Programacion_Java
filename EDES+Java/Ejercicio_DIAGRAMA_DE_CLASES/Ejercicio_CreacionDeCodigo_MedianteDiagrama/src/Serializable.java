public interface Serializable<T> {

    public String serializar(T T);

    public T deserializar(String datos);
}
