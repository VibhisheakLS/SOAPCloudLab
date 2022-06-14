package Cloud_Client_SOAP;
import CLoud_SOAP.DisplayNames;
import CLoud_SOAP.Names;
public class ClientSoap {
	public static void main(String[] args) {
		DisplayNames wsdl = new DisplayNames();
		Names service = wsdl.getName();
		service.setName("Vibhisheak");
		System.out.println(service.getName()+"\t"+service.getAge());		
	}
}
