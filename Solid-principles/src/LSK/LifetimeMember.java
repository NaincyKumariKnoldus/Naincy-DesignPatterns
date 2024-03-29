package LSK;

import java.util.Calendar;
import java.util.Date;

public class LifetimeMember extends Member {
    public LifetimeMember(String name, Date mStart){
        super(name);
        this.memberType = "Lifetime";
        this.mStartDate = mStart;
        Calendar c = Calendar.getInstance();
        c.setTime(this.mStartDate);
        c.add(Calendar.YEAR, 70);
        this.mEndDate = c.getTime();
    }

    @Override
    public void addToDatabase() {
        System.out.println("Added to the Lifetime Member info to DB");
    }
}
