public class SchoolRecord implements Auditable, Storable {
    public void runAudit(){
        System.out.println("running Audit");
    }
    public void sentAuditToState(){
        System.out.println("Sent audit to state");
    }
    public void storeData(){
        System.out.println("Storing Data");
    }
    public void retrieveData(){
        System.out.println("Retrieving Data");
    }
}
