package aula6;

public class TesteConversaoGrausCelsius {
    public float conversorFarenheit(float c) { 
    	float r = (c * 9/5) + 32; 
    	return r;
    }
	public static void main(String[] args) {
		TesteConversaoGrausCelsius t = new 
				TesteConversaoGrausCelsius();
		float f = t.conversorFarenheit(20.0f);
		System.out.println(f);
	}
}
