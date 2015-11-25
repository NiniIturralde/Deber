package ejerc2;

public class Descuento {

	
	private double descuento;
	private double TotalCompra;
	
	public Descuento(double descuentoParam,double TotalCompraParam){
		this.descuento=descuentoParam;
		this.TotalCompra=TotalCompraParam;
	}
	
	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public double getTotalCompra() {
		return TotalCompra;
	}

	public void setTotalCompra(double TotalCompra) {
		this.TotalCompra = TotalCompra;
	}

	public double getTotal(){
		double Total=TotalCompra-TotalCompra*descuento;
		return Total;
	}
}
