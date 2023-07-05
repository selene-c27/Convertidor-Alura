package Principal;

import javax.swing.JOptionPane;

public class OpcionesConversion {
	
	ConvertirMonedas monedas = new ConvertirMonedas();
	
	public void ConvertirMonedas(double valor) {
	
	String opcion = (JOptionPane.showInputDialog(null,
			"Elije la moneda que deseas convertir tu dinero ",  "Monedas",
			JOptionPane.PLAIN_MESSAGE, null, new Object[]
					{"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras Esterlinas", "De Pesos a Yen Japonés", "De Pesos a Won sub-coreano", "De Dólar a Pesos", "De Euro a Pesos", "De Libras Esterlinas a Pesos", "De Yen Japonés a Pesos", "De Won sub-coreano a Pesos"}, 
					"Seleccion")).toString();
	
	switch (opcion) {
	case "De Pesos a Dólar": 
		monedas.ConvertirPesosMexDolares(valor);
		break;
	
	case "De Pesos a Euro": 
		monedas.ConvertirPesosMexEuros(valor);
		break;
		
	case "De Pesos a Libras Esterlinas":
		monedas.ConvertirPesosMexLibra(valor);
		break;
		
	case "De Pesos a Yen Japonés":
		monedas.ConvertirPesosMexYen(valor);
		break;
		
	case "De Pesos a Won sub-coreano":
		monedas.ConvertirPesosMexWon(valor);
		break;
	
	case "De Dólar a Pesos":
		monedas.ConvertirDolaresPesosMex(valor);
		break;
		
	case "De Euro a Pesos":
		monedas.ConvertirEurosPesosMex(valor);
		break;
		
	case "De Libras Esterlinas a Pesos":
		monedas.ConvertirLibraPesosMex(valor);
		break;
	 
	case "De Yen Japonés a Pesos":
		monedas.ConvertirYenPesosMex(valor);
		break;
		
	case "De Won sub-coreano a Pesos":
		monedas.ConvertirWonPesosMex(valor);
		break;
	}
	}

}
