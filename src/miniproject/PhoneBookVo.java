package miniproject;

public class PhoneBookVo {
	private Long id;
	private String name;
	private String hp;
	private String tel;
	
	public PhoneBookVo() {
		//	기본 생성자
	}
	
	public PhoneBookVo(String name, String hp, String tel) {
		this.name = name;
		this.hp = hp;
		this.tel = tel;
	}
	
	public PhoneBookVo(Long id, String name, String hp, String tel) {
		this(name, hp, tel);
		this.id = id;
	}

	//	Getters/Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	//	객체 출력
	@Override
	public String toString() {
		return id + " " + name + " " + hp + " " + tel;
	}
}
