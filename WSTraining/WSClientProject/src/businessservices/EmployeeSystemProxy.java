package businessservices;

public class EmployeeSystemProxy implements businessservices.EmployeeSystem {
  private String _endpoint = null;
  private businessservices.EmployeeSystem employeeSystem = null;
  
  public EmployeeSystemProxy() {
    _initEmployeeSystemProxy();
  }
  
  public EmployeeSystemProxy(String endpoint) {
    _endpoint = endpoint;
    _initEmployeeSystemProxy();
  }
  
  private void _initEmployeeSystemProxy() {
    try {
      employeeSystem = (new businessservices.EmployeSystemImplServiceLocator()).getEmployeSystemImplPort();
      if (employeeSystem != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)employeeSystem)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)employeeSystem)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (employeeSystem != null)
      ((javax.xml.rpc.Stub)employeeSystem)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public businessservices.EmployeeSystem getEmployeeSystem() {
    if (employeeSystem == null)
      _initEmployeeSystemProxy();
    return employeeSystem;
  }
  
  public java.lang.String getEmployeeName(int arg0) throws java.rmi.RemoteException{
    if (employeeSystem == null)
      _initEmployeeSystemProxy();
    return employeeSystem.getEmployeeName(arg0);
  }
  
  public businessservices.Employee findEmployee(int employeeNumber) throws java.rmi.RemoteException{
    if (employeeSystem == null)
      _initEmployeeSystemProxy();
    return employeeSystem.findEmployee(employeeNumber);
  }
  
  public boolean registerEmployee(businessservices.Employee employee) throws java.rmi.RemoteException{
    if (employeeSystem == null)
      _initEmployeeSystemProxy();
    return employeeSystem.registerEmployee(employee);
  }
  
  public void uploadImage(byte[] arg0, int arg1) throws java.rmi.RemoteException{
    if (employeeSystem == null)
      _initEmployeeSystemProxy();
    employeeSystem.uploadImage(arg0, arg1);
  }
  
  
}