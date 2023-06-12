package util;

public class Conversao {
	public double CotacaoDolar;
	public double Quantidade;
	public double Iof = 6.00;
	
	

	public double Preco()
	{
		return CotacaoDolar * Quantidade * Iof / 100 + CotacaoDolar * Quantidade;
	}
    
	
}
