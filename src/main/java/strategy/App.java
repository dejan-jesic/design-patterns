package strategy;

import java.util.List;

class App {

	public static void main(String[] args) {
		final List<Duck> ducks = List.of(
			new MallardDuck(),
			new RedHeadDuck(),
			new RubberDuck(),
			new WoodenDuck()
		);

		ducks.forEach(App::goDuck);
	}

	private static void goDuck(Duck duck) {
		System.out.println("- - - - - - - - - - - - - - - - - - -");
		duck.display();
		duck.swim();
		duck.doQuack();
		duck.doFly();
		System.out.println("- - - - - - - - - - - - - - - - - - -");
	}

}
