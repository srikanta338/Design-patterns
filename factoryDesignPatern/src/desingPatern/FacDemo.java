package desingPatern;

import impl.Os;
import service.Androis;
import service.Ioc;
import service.Widows;

public class FacDemo {
	public Os getInstance(String str) {
		if(str.equals("and")) {
			return new Androis();
		}else if(str.equals("win")) {
			return  new Widows();
		}else {
			return new Ioc();
		}
		
	}

}
