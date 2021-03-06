
package br.com.idtrust.sdk.icarta.ws.soap.v2;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "EmailRastreadoIntegracaoService", targetNamespace = "http://webservice.icarta.pro/", wsdlLocation = "http://webservice.icarta.pro/icarta/EmailRastreadoIntegracaoService/EmailRastreadoIntegracao?wsdl")
public class EmailRastreadoIntegracaoService
    extends Service
{

    private final static URL EMAILRASTREADOINTEGRACAOSERVICE_WSDL_LOCATION;
    private final static WebServiceException EMAILRASTREADOINTEGRACAOSERVICE_EXCEPTION;
    private final static QName EMAILRASTREADOINTEGRACAOSERVICE_QNAME = new QName("http://webservice.icarta.pro/", "EmailRastreadoIntegracaoService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://webservice.icarta.pro/icarta/EmailRastreadoIntegracaoService/EmailRastreadoIntegracao?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EMAILRASTREADOINTEGRACAOSERVICE_WSDL_LOCATION = url;
        EMAILRASTREADOINTEGRACAOSERVICE_EXCEPTION = e;
    }

    public EmailRastreadoIntegracaoService() {
        super(__getWsdlLocation(), EMAILRASTREADOINTEGRACAOSERVICE_QNAME);
    }

    public EmailRastreadoIntegracaoService(WebServiceFeature... features) {
        super(__getWsdlLocation(), EMAILRASTREADOINTEGRACAOSERVICE_QNAME, features);
    }

    public EmailRastreadoIntegracaoService(URL wsdlLocation) {
        super(wsdlLocation, EMAILRASTREADOINTEGRACAOSERVICE_QNAME);
    }

    public EmailRastreadoIntegracaoService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EMAILRASTREADOINTEGRACAOSERVICE_QNAME, features);
    }

    public EmailRastreadoIntegracaoService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EmailRastreadoIntegracaoService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EmailRastreadoIntegracao
     */
    @WebEndpoint(name = "EmailRastreadoIntegracaoPort")
    public EmailRastreadoIntegracao getEmailRastreadoIntegracaoPort() {
        return super.getPort(new QName("http://webservice.icarta.pro/", "EmailRastreadoIntegracaoPort"), EmailRastreadoIntegracao.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EmailRastreadoIntegracao
     */
    @WebEndpoint(name = "EmailRastreadoIntegracaoPort")
    public EmailRastreadoIntegracao getEmailRastreadoIntegracaoPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice.icarta.pro/", "EmailRastreadoIntegracaoPort"), EmailRastreadoIntegracao.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EMAILRASTREADOINTEGRACAOSERVICE_EXCEPTION!= null) {
            throw EMAILRASTREADOINTEGRACAOSERVICE_EXCEPTION;
        }
        return EMAILRASTREADOINTEGRACAOSERVICE_WSDL_LOCATION;
    }

}
