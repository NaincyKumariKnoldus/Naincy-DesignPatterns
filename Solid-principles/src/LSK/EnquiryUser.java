package LSK;

public class EnquiryUser extends Member{
    public EnquiryUser(String name){
        super(name);
        this.memberType = "Enquiry";
    }

    @Override
    public void addToDatabase() {
        System.out.println("Added to the Enquiry Info to DB");
    }
}