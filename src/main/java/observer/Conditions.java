package observer;

import java.util.Objects;

class Conditions implements Subscriber, Display {

	private WeatherData weatherData;

	@Override
	public void update(final double temperature, final double humidity, final double pressure) {
		if (Objects.isNull(weatherData)) {
			weatherData = new WeatherData();
		}
		weatherData.setTemperature(temperature);
		weatherData.setHumidity(humidity);
		weatherData.setPressure(pressure);
		displayState();
	}

	@Override
	public void displayState() {
		System.out.println("- - - - - - - - - - - - - - - -");
		System.out.println(String.format(
			generateCommonMessage(),
			"Conditions notified:", weatherData.getTemperature(), weatherData.getHumidity(), weatherData.getPressure()
		));
	}

}
