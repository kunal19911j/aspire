package properties;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RuntimeProp {
	public static final String browser = "chrome";
	public static final String baseUrl = "https://aspireapp.odoo.com/";
	public static final String userName = "user@aspireapp.com";
	public static final String password = "@sp1r3app";
	public static final String prodName = "tp" + (new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
	public static final String prodQuantity = "111.00";

}
