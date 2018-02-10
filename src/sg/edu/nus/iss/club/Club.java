package sg.edu.nus.iss.club;

import java.util.ArrayList;

public class Club {

    private static final int ARRAY_SIZE_INCREMENT = 10;

    private int count = 0;
    private ArrayList<Member> members = new ArrayList<>();

    public ArrayList<Member> getMembers () {
        return this.members;
    }


    public Member addMember (String surname, String firstName,
                                             String secondName) {
        Member m = new Member(surname, firstName, secondName, count++);
        return m;
    }

}
