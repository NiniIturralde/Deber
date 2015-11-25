package ejerc2;

public class mai_desc {

	public static void main(String[] args) {
		
		Descuento des1=new Descuento(0.1,100);
		des1.setTotalCompra(150);
		
		double Total=des1.getTotal();
		System.out.println("TotalCompra: "+Total);
		System.out.println("TotalCompra: "+des1.getTotal());
	}

	}

