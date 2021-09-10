package LSK;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Member> myList = new ArrayList<Member>();

        myList.add(new LifetimeMember("Naincy",new Date()));
        myList.add(new AnnualMember("Kumari",new Date()));
        myList.add(new EnquiryUser("Gupta"));
        for (Member c: myList){
            c.addToDatabase();
        }
    }
}
