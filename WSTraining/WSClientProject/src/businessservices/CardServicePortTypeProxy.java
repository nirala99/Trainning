package businessservices;

public class CardServicePortTypeProxy implements businessservices.CardServicePortType {
  private String _endpoint = null;
  private businessservices.CardServicePortType cardServicePortType = null;
  
  public CardServicePortTypeProxy() {
    _initCardServicePortTypeProxy();
  }
  
  public CardServicePortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initCardServicePortTypeProxy();
  }
  
  private void _initCardServicePortTypeProxy() {
    try {
      cardServicePortType = (new businessservices.CardServiceLocator()).getCardServiceHttpSoap11Endpoint();
      if (cardServicePortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)cardServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)cardServicePortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (cardServicePortType != null)
      ((javax.xml.rpc.Stub)cardServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public businessservices.CardServicePortType getCardServicePortType() {
    if (cardServicePortType == null)
      _initCardServicePortTypeProxy();
    return cardServicePortType;
  }
  
  public java.lang.Boolean login(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException{
    if (cardServicePortType == null)
      _initCardServicePortTypeProxy();
    return cardServicePortType.login(username, password);
  }
  
  public java.lang.Boolean validateCard(java.lang.Long cardNumber) throws java.rmi.RemoteException{
    if (cardServicePortType == null)
      _initCardServicePortTypeProxy();
    return cardServicePortType.validateCard(cardNumber);
  }
  
  public businessservices.xsd.Account openAccount(businessservices.xsd.Customer newCustomer) throws java.rmi.RemoteException{
    if (cardServicePortType == null)
      _initCardServicePortTypeProxy();
    return cardServicePortType.openAccount(newCustomer);
  }
  
  public java.lang.Double balanceEnquiry(java.lang.Integer customerId) throws java.rmi.RemoteException{
    if (cardServicePortType == null)
      _initCardServicePortTypeProxy();
    return cardServicePortType.balanceEnquiry(customerId);
  }
  
  
}