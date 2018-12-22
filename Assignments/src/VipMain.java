public class VipMain {
 
    public static void main(String[] args) {
        
    	VipCustomer c1 = new VipCustomer();
        System.out.println(c1.getName());
        
        VipCustomer c2 = new VipCustomer("Mike", 5000.0);
        System.out.println(c2.getName());
        System.out.println(c2.getCreditLimit());
        VipCustomer c3 = new VipCustomer("Smith", 1000.00, "smith@account.com");
        System.out.println(c3.getName());
        System.out.println(c3.getCreditLimit());
        System.out.println(c3.getEmailAddress());
 
    }
}