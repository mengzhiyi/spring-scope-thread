package ch10.convert;

import java.util.List;

import org.joda.time.LocalDate;
import org.springframework.format.annotation.NumberFormat;

public class Team {
	
	private int id;
    private List<String> names;
    private Member leader;
    private LocalDate createDate;
    private Member viceLeader;
    private List<Member> members;
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@NumberFormat(pattern="c:0000")
    private int memberCount;
    
    public List<String> getNames() {
        return names;
    }
    
    public int getMemberCount() {
        return memberCount;
    }


    public void setMemberCount(int memberCount) {
        this.memberCount = memberCount;
    }


    public void setNames(List<String> names) {
        this.names = names;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public Member getLeader() {
        return leader;
    }

    public void setLeader(Member member) {
        this.leader = member;
    }

	public Member getViceLeader() {
		return viceLeader;
	}

	public void setViceLeader(Member viceLeader) {
		this.viceLeader = viceLeader;
	}

	public List<Member> getMembers() {
		return members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}
   
    
}
