package ch10.convert;

public class Member {
    private String name;
    private byte [] code;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    
    public byte[] getCode() {
		return code;
	}

	public void setCode(byte[] code) {
		this.code = code;
	}

	@Override
    public String toString() {
        return "Member [name=" + name + "]";
    }
    
    
    
}
