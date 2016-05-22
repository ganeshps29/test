package ecom;
import java.util.ArrayList;
import java.util.List;

import ecom.ecom_DAOInterface; 
import ecom.ecom_model; 
public class ecom_DAOImplement  implements ecom_DAOInterface 
{
	List<ecom_model >Produc;
	public ecom_DAOImplement()
	{	
	}
	 
 	public List<ecom_model> getAllProduct() {
		// TODO Auto-generated method stub
		Produc = new ArrayList<ecom_model>();
		
		 
		ecom_model pm1 = new ecom_model("10001","Red Rose","45");
		ecom_model pm2 = new ecom_model("10002","Rose","50");
		ecom_model pm3 = new ecom_model("10003","Rose","75");
		
		Produc.add(pm1);
		Produc.add(pm2);
		Produc.add(pm3);
		
		return Produc;

	}

	public List<ecom_model>Product(String name) {
		// TODO Auto-generated method stub
		Produc = new ArrayList<ecom_model>();
		
		  ecom_model pm1 = null;
		
		if("img1".equals(name))
			pm1 = new ecom_model("10001","Heart Touching Flower","45");
		if("img2".equals(name))
			pm1 = new ecom_model("10002","Flower","50");
		if("img3".equals(name))
			pm1 = new ecom_model("10003","Flower - Bokkay","75");
		
		Produc.add(pm1);
		
		return Produc;

	}
}
