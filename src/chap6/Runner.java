package chap6;

public class Runner {
	public static void main(String[] args) throws Throwable {
		javassist.gluonj.util.Loader.run(BasicInterpreter.class, args, BasicEvaluator.class);
	}
}
