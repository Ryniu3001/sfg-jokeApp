package pl.ryniu.sfg.joke.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

//@Configuration
public class ChuckConfiguration {

//	@Bean
	public ChuckNorrisQuotes chuckNorrisQuotes2() {
		return new ChuckNorrisQuotes();
	}
}
