package prob3;

public class Sparrow extends Bird {
	/*
	 * 참새(짹짹)가 날아다닙니다. 
	 * 참새(짹짹)가 소리내어 웁니다. 
	 * 참새의 이름은 짹짹 입니다.
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void fly() {
		System.out.println("참새(" + getName() + ")가 날아다닙니다.");
	}

	@Override
	public void sing() {
		System.out.println("참새(" + getName() + ")가 소리내어 웁니다.");
	}

	@Override
	public String toString() {
		return "참새의 이름은 " + getName() + " 입니다.";
	}

}
