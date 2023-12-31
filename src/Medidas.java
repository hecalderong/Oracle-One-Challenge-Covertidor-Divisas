
//ESTA CLASE ALMACENA LOS ARRAY QUE SE CARGAN EN LOS COMBOBOX, SUS GETTERS Y SETTERS

public class Medidas {
	public static String seleccion = "Moneda";
	private String[] moneda = { "USD-Dolar", "COP-Peso", "EUR-Euro", "GBP-Libra", "JPY-Yen" };
	private String[] distancia = { "CM-Centimetro", "M-metro", "KM-Kilometro", "PUL-Pulgada", "PIE-Pie", "MI-Milla" };
	private String[] masa = { "GR-Gramo", "KG-Kilogramo", "TON-Tonelada", "LIB-Libra" };
	private String[] volumen = { "ML-mililitro", "L-Litro", "GAL-galon", "OZ-Onza" };
	private String[] temperatura = { "C°-Celsius", "F°-Farenheight" };

	public Medidas(String seleList) {
		seleccion = seleList;
	}

	public String[] getMoneda() {
		return moneda;
	}

	public String[] getDistancia() {
		return distancia;
	}

	public String[] getMasa() {
		return masa;
	}

	public String[] getVolumen() {
		return volumen;
	}

	public String[] getTemperatura() {
		return temperatura;
	}

}
