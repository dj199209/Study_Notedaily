class Demo1_Switch {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
	String name = "rose";
	String gender = "人妖";
	switch(gender) {
	case "男士":
		System.out.println(name +"是一个"+gender +"喜欢吃饭睡觉打dota");
	break;
	case "女士":
		System.out.println(name + "是一位"+ gender +"喜欢逛街购物美容");
	break;
	default:
		System.out.println(name + "是一位"+ gender+ "打雌性激素维持美貌");
	break;
	}
}
}
	
