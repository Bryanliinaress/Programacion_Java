package tesauro;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class GestorDiccionario implements Serializador, ManejadorArchivos {

  private HashMap<String, ArrayList<String>> glosario;

  public GestorDiccionario() {
    glosario = new HashMap<String, ArrayList<String>>();
  }

  /**
   * Añade una nueva entrada al diccionario
   * 
   * @param palabraInglés      Palabra en inglés
   * @param significadoEspañol Significado en castellano
   * @return Verdadero si se produjo la adición
   */
  public boolean añadirEntrada(String palabraInglés, String significadoEspañol) {
    glosario.putIfAbsent(palabraInglés.toLowerCase(), new ArrayList<>());
    ArrayList<String> significados = glosario.get(palabraInglés.toLowerCase());
    if (!significados.contains(significadoEspañol.toLowerCase()))
      return significados.add(significadoEspañol.toLowerCase());
    return false;
  }

  /**
   * Elimina una entrada completa del diccionario
   * 
   * @param palabraInglés Palabra en inglés a borrar completamente del
   *                      diccionario.
   * @return Verdadero si se produjo la eliminación
   */
  public boolean eliminarEntrada(String palabraInglés) {
    if (glosario.remove(palabraInglés.toLowerCase()) != null)
      return true;
    else
      return false;
  }

  /**
   * Elimina una acepción en castellano del diccionario
   * 
   * @param palabraInglés      Palabra en inglés
   * @param significadoEspañol Significado en castellano que quiere borrarse
   * @return Verdadero si se produjo la eliminación
   */
  public boolean eliminarSignificado(String palabraInglés, String significadoEspañol) {
    if (glosario.containsKey(palabraInglés.toLowerCase())) {
      return glosario.get(palabraInglés.toLowerCase()).remove(significadoEspañol.toLowerCase());
    }
    return false;
  }

  /**
   * Construye una cadena con el contenido completo de una entrada del diccionario
   * 
   * @param palabraInglés Palabra en inglés de la que mostrar sus significados
   * @return Cadena con significados encontrados
   */
  public String muestraSignificados(String palabraInglés) {
    StringBuilder respuesta = new StringBuilder();
    if (glosario.containsKey(palabraInglés.toLowerCase())) {
      respuesta.append("Acepciones en español: ");
      ArrayList<String> significados = glosario.get(palabraInglés.toLowerCase());
      int númAcepciones = significados.size();
      if (númAcepciones == 0)
        respuesta.append("No hay ninguna.\n");
      else {
        for (int i = 0; i < númAcepciones; i++) {
          respuesta.append(significados.get(i));
          if (i < númAcepciones - 1)
            respuesta.append(", ");
          else
            respuesta.append(".\n");
        }
      }
    } else {
      respuesta.append("No se encuentra la palabra inglesa.\n");
    }
    return respuesta.toString();
  }

  /**
   * Construye una cadena con todas las palabras inglesas registradas en el
   * diccionario
   * 
   * @return Cadena con las palabras en inglés registradas
   */
  public String muestraPalabrasEnInglés() {
    StringBuilder respuesta = new StringBuilder();
    respuesta.append("Palabras inglesas registradas: ");
    if (glosario.isEmpty()) {
      respuesta.append("No hay aún entradas en el diccionario.\n");
    } else {
      glosario.keySet().forEach(palabraInglesa -> respuesta.append(palabraInglesa).append(" "));
    }
    return respuesta.toString();
  }

  /**
   * Añade datos al diccionario desde un fichero
   * 
   * @param nombreFichero
   * @return Verdadero si la importación se realizó con éxito
   */
  @Override
  public boolean importar(String nombreFichero) {

    //  Leer desde un fichero nuevas entradas para incorporarlas al glosario
    // Puedes utilizar 'añadirEntrada' para añadir las entradas leídas
    // Deserializa cada línea del fichero antes
    // Cada entrada estará en una línea distinta del fichero

    try {
      BufferedReader br = new BufferedReader(new FileReader(nombreFichero));
      String lineaDelFichero = "";
      while ((lineaDelFichero = br.readLine()) != null) {
        String[] palabrasDeserializadas = deserializar(lineaDelFichero);
        String palabraEnIngles = palabrasDeserializadas[0];
        for (int i =1; i< palabrasDeserializadas.length ; i++) {
          añadirEntrada(palabraEnIngles, palabrasDeserializadas[i]);
        }
      }
      br.close();
      return true;
    } catch (Exception e) {
      System.out.println(e);
      return false;
    }

  }

  /**
   * Exporta los datos actuales del diccionario a un fichero
   * 
   * @param nombreFichero
   * @return Verdadero si la exportación se realizó con éxito
   */
  @Override
  public boolean exportar(String nombreFichero) {
    try {
      if (glosario.isEmpty()) {
        return false;
      } else {
        BufferedWriter bw = new BufferedWriter(new FileWriter(nombreFichero));
        for (String clave : glosario.keySet()) {
          String frase = serializar(clave, glosario.get(clave))+"\n";
          bw.write(frase);
        }
        bw.close();
        return true;
      }
    } catch (Exception e) {
      System.out.println(e);
      return false;
    }

    //  Escribir sobre un fichero el contenido completo del glosario
    // Puedes utulizar keySet() sobre el glosario para obtener el conjunto de claves
    // Serializa cada entrada antes de escribirla en el fichero
    // Cada entrada estará en una línea nueva

  }

  /**
   * Recorre el archivo para escribir en mayúsculas la primera letra de cada
   * palabra
   * 
   * @param nombreFichero
   * @return Verdadero si el proceso se realizó con éxito
   */
  @Override
  public boolean embellecer(String nombreFichero) {
    try {
      File ficheroOriginal = new File(nombreFichero);
      File ficheroModificado = new File(nombreFichero + ".tmp");
      if (!ficheroOriginal.renameTo(ficheroModificado))
        return false;
      ficheroOriginal = new File(nombreFichero); // Creamos un fichero vacío
      if (!ficheroOriginal.exists()) {
        try {
          ficheroOriginal.createNewFile();
        } catch (Exception e) {
          return false;
        }
      }

      BufferedReader br = new BufferedReader(new FileReader(ficheroModificado));
      BufferedWriter bw = new BufferedWriter(new FileWriter(ficheroOriginal));
      String linea = "";
      String lineaEmbellecida = "";
      while ((linea = br.readLine()) != null) {
        String lineaDeserializada[] = deserializar(linea);
        for (String palabra : lineaDeserializada) {
          lineaEmbellecida += embellece(palabra) + ";";
        }
        lineaEmbellecida += "\n";
      }
      bw.write(lineaEmbellecida);

      //  Reescribir cada palabra del fichero para poner la primera letra
      // mayúscula
      // Puedes emplear la función privada embellece(cadena) incluida en esta clase
      // Empieza deserializando cada línea del fichero modificado (el que leemos)
      // Construye, concatenando cadenas 'embellecidas', la nueva línea que hemos de
      // escribir en el fichero original (recién creado y vacío tras el renombrado)

      br.close();
      bw.close();
      ficheroModificado.delete();
      return true;
    } catch (IOException ioe) {
      return false;
    }
  }

  /**
   * Serializa los datos de una entrada del diccionario en una cadena:
   * palabraInglés;significadoEspañol1;significadoEspañol2
   * 
   * @param palabraInglés Palabra en inglés
   * @param significados  Lista con las acepciones en castellano asociadas a la
   *                      palabra inglesa
   * @return Cadena de caracteres conteniendo todos los datos de esa entrada del
   *         diccionario
   */
  @Override
  public String serializar(String palabraInglés, ArrayList<String> significados) {
    String frase = "";
    frase = palabraInglés + ";";
    for (String palabrasEnEspañol : significados) {
      frase += palabrasEnEspañol + ";";
    }
    return frase;
  }

  /**
   * Deserializa los datos de una entrada del diccionario devolviendo un array de
   * cadenas
   * 
   * @param líneaFichero Datos en el fichero de una entrada del diccionario
   * @return Array de Strings con la palabra en inglés en primera posición seguida
   *         de los significados en español
   */
  @Override
  public String[] deserializar(String líneaFichero) {

    String[] misPalabras = líneaFichero.split(";");
    return misPalabras;

  }

  /**
   * Método privado que cambia el primer carácter de la cadena de entrada a
   * mayúsculas
   * 
   * @param cadena Cadena de caracteres a embellecer
   * @return Cadena embellecida
   */
  private String embellece(String cadena) {
    // Verificamos si la cadena no está vacía
    if (cadena != null && !cadena.isEmpty()) {
      // Convertimos la primera letra a mayúscula y dejamos el resto igual
      String resultado = cadena.substring(0, 1).toUpperCase() + cadena.substring(1);
      return resultado;
    } else {
      return null;
    }
  }
}
