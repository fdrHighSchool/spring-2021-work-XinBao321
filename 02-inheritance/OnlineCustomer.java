class OnlineCustomer extends Customer{
private String emailAddress;

public OnlineCustomer(String name, String address, String email){
super(name, address);
this.emailAddress = email;
}//end consturctor

public String toString(){

 return super.toString() + " Email: " + this.emailAddress;
} //end to string method
} // end main
